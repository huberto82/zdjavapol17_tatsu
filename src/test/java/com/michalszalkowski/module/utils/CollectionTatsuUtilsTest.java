package com.michalszalkowski.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTatsuUtilsTest {

	private static final String TYPE_FOR_GROUP_A = "TYPE_1";
	private static final String TYPE_FOR_GROUP_B = "TYPE_2";
	private static final String NOT_VALID_TYPE = "NOT_VALID_TYPE";

	@Test
	public void shouldReturnEmptyListWhenTypeIsNotValid() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType(null)).isEmpty();
		assertThat(CollectionTatsuUtils.getListOfColorsPerType("")).isEmpty();
		assertThat(CollectionTatsuUtils.getListOfColorsPerType(NOT_VALID_TYPE)).isEmpty();
	}

	@Test
	public void shouldReturnFirstGroupOfColors() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType(TYPE_FOR_GROUP_A))
				.isNotEmpty()
				.hasSize(3)
				.containsExactly("red", "blue", "green");
	}

	@Test
	public void shouldReturnSecondGroupOfColors() {
		assertThat(CollectionTatsuUtils.getListOfColorsPerType(TYPE_FOR_GROUP_B))
				.isNotEmpty()
				.hasSize(2)
				.containsExactly("black", "white");
	}
}