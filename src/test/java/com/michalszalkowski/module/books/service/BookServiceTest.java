package com.michalszalkowski.module.books.service;

import com.michalszalkowski.module.books.entity.BookEntity;
import com.michalszalkowski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

	private static final long VALID_BOOK_ID = 1;
	private static final long NOT_VALID_BOOK_ID = 0;

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookService bookService;

	@Test
	public void shouldCallGetOneWhenIdIsValid() {
		// given
		// when
		bookService.getOne(VALID_BOOK_ID);
		// then
		// verify
		Mockito.verify(bookRepository, Mockito.atMostOnce()).getOne(VALID_BOOK_ID);
	}

	@Test
	public void shouldNotCallGetOneWhenIdIsValid() {
		// given
		// when
		BookEntity bookEntity = bookService.getOne(NOT_VALID_BOOK_ID);
		// then
		assertThat(bookEntity).isNull();
		// verify
		Mockito.verify(bookRepository, Mockito.never()).getOne(NOT_VALID_BOOK_ID);
	}

	@Test
	public void shouldCallFindAll() {
		// when
		bookService.getAll();
		// then
		Mockito.verify(bookRepository).findAll();
	}

	@Test
	public void shouldCallSaveAndFlush() {
		// given
		BookEntity entity = new BookEntity();
		// when
		bookService.create(entity);
		// then
		// verify
		Mockito.verify(bookRepository).saveAndFlush(entity);
	}

	@Test
	public void shouldNotCallSaveAndFlushWhenObjectIsEqualToNull() {
		// given
		BookEntity entity = null;
		// when
		bookService.create(entity);
		// then
		// verify
		Mockito.verify(bookRepository, Mockito.never()).saveAndFlush(entity);
	}
}