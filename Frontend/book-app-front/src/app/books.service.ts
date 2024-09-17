import { Injectable } from '@angular/core';
import { BookInterface } from './book-interface';

@Injectable({
  providedIn: 'root',
})
export class BooksService {
  readonly baseUrl = 'http://localhost:8080';

  constructor() {
  }

  async getAllBooks(): Promise<BookInterface[]> {
    const data = await fetch(`${this.baseUrl}/boeken`);
    const books = await data.json();

    return books;
  }

  createNewBook(book: BookInterface) {
    //Create post request
  }
}
