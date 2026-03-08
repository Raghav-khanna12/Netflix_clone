import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Title } from '../title.model';

@Injectable({ providedIn: 'root' })
export class CatalogService {
  private readonly apiBase = 'http://localhost:8080/api';

  constructor(private readonly http: HttpClient) {}

  getTrendingTitles(): Observable<Title[]> {
    return this.http.get<Title[]>(`${this.apiBase}/titles/trending`);
  }

  getPopularTitles(): Observable<Title[]> {
    return this.http.get<Title[]>(`${this.apiBase}/titles/popular`);
  }

  subscribe(email: string): Observable<{ message: string }> {
    return this.http.post<{ message: string }>(`${this.apiBase}/subscriptions`, { email });
  }
}
