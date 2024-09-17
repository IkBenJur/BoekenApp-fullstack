import { Component, Input } from '@angular/core';
import { BookInterface } from '../book-interface';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-book-tile',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './book-tile.component.html',
  styleUrl: './book-tile.component.css'
})
export class BookTileComponent {
  @Input() book!: BookInterface
}
