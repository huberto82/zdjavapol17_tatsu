package com.michalszalkowski.module.books.service;

import com.michalszalkowski.module.books.dto.BookDto;
import com.michalszalkowski.module.books.entity.BookEntity;
import com.michalszalkowski.module.books.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BookDtoServiceTest {

	private static final long BOOK_ID = 1L;
	private static final String BOOK_TITLE = "Lorem";
	private static final BookEntity BOOK_ENTITY = new BookEntity()
			.setId(BOOK_ID)
			.setTitle(BOOK_TITLE);

	@Mock
	private BookRepository bookRepository;

	@InjectMocks
	private BookDtoService bookDtoService;

	@Test
	public void shouldNotReturnBook() {
		// given
		Mockito.when(bookRepository.getOne(BOOK_ID)).thenReturn(null);
		// when
		Optional<BookDto> bookDtoOpt = bookDtoService.findOne(BOOK_ID);
		// then
		assertThat(bookDtoOpt).isNotPresent();
	}

	@Test
	public void shouldReturnBook() {
		// given
		Mockito.when(bookRepository.getOne(BOOK_ID)).thenReturn(BOOK_ENTITY);
		// when
		Optional<BookDto> bookDtoOpt = bookDtoService.findOne(BOOK_ID);
		// then
		assertThat(bookDtoOpt)
				.isPresent()
				.hasValueSatisfying(dto -> {
					assertThat(dto.getId()).isEqualTo(BOOK_ID);
					assertThat(dto.getTitle()).isEqualTo(BOOK_TITLE);
				});
	}

	@Test
	public void shouldReturnEmptyList() {
		// given
		Mockito.when(bookRepository.findAll()).thenReturn(List.of());
		// when
		List<BookDto> dtos = bookDtoService.getAll();
		// then
		assertThat(dtos).isEmpty();
	}

	@Test
	public void shouldReturnList() {
		// given
		Mockito.when(bookRepository.findAll()).thenReturn(List.of(BOOK_ENTITY, BOOK_ENTITY));
		// when
		List<BookDto> dtos = bookDtoService.getAll();
		// then
		assertThat(dtos).hasSize(2).isNotEmpty();
	}
}