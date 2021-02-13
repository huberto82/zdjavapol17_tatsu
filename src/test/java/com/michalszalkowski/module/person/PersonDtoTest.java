package com.michalszalkowski.module.person;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDtoTest {

	private static final String NAME = "Michał";
	private static final String SURNAME = "Szałkowski";
	private static final String EMAIL = "nono@michalszalkowski.com";

	@Test
	public void shouldReturnEmptyObject() {
		// given
		// when
		PersonDto dto = new PersonDto();
		// then
		assertThat(dto.getName()).isNull();
		assertThat(dto.getSurname()).isNull();
		assertThat(dto.getEmail()).isNull();
		assertThat(dto.isEmailValid()).isFalse();
	}

	@Test
	public void shouldReturnPerson() {
		// given
		// when
		PersonDto dto = new PersonDto(NAME, SURNAME, EMAIL);
		// then
		assertThat(dto.getName()).isEqualTo(NAME);
		assertThat(dto.getSurname()).isEqualTo(SURNAME);
		assertThat(dto.getEmail()).isEqualTo(EMAIL);
		assertThat(dto.isEmailValid()).isTrue();
	}
}