import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookTileComponent } from './book-tile.component';

describe('BookTileComponent', () => {
  let component: BookTileComponent;
  let fixture: ComponentFixture<BookTileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BookTileComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookTileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
