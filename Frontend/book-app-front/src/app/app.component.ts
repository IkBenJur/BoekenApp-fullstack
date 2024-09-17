import { Component, inject } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { BookTileComponent } from './book-tile/book-tile.component';
import { BookInterface } from './book-interface';
import { BooksService } from './books.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, BookTileComponent, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'book-app-front';
  bookService: BooksService = inject(BooksService);
  books: BookInterface[] = [];

  constructor() {
    this.bookService.getAllBooks().then((books) => {
      console.log(books);
      this.books = books;
    });
  }
}
