import { Component, Input } from '@angular/core';
import { NgFor } from '@angular/common';

import { Title } from '../../title.model';

@Component({
  selector: 'app-title-row',
  standalone: true,
  imports: [NgFor],
  templateUrl: './title-row.component.html',
  styleUrl: './title-row.component.css'
})
export class TitleRowComponent {
  @Input({ required: true }) heading = '';
  @Input({ required: true }) titles: Title[] = [];
}
