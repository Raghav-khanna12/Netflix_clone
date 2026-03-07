import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { CatalogService } from './services/catalog.service';
import { Title } from './title.model';
import { TitleRowComponent } from './components/title-row/title-row.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, TitleRowComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  trendingTitles: Title[] = [];
  popularTitles: Title[] = [];
  email = '';
  formMessage = '';

  constructor(private readonly catalogService: CatalogService) {}

  ngOnInit(): void {
    this.catalogService.getTrendingTitles().subscribe((titles) => {
      this.trendingTitles = titles;
    });

    this.catalogService.getPopularTitles().subscribe((titles) => {
      this.popularTitles = titles;
    });
  }

  onSubmit(): void {
    if (!this.email.trim()) {
      return;
    }

    this.catalogService.subscribe(this.email).subscribe((result) => {
      this.formMessage = result.message;
      this.email = '';
    });
  }
}
