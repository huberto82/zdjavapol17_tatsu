package com.michalszalkowski.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTatsuUtilsTest {

	@Test
	public void shouldReturnTrueWhenProductionIsOn() {
		assertThat(StringTatsuUtils.isProductionState()).isTrue();
	}

	@Test
	public void shouldReturnFalseWhenDevIsOff() {
		assertThat(StringTatsuUtils.isDevState()).isFalse();
	}

	@Test
	public void shouldReturnTrueWhenStringIsBlank() {
		assertThat(StringTatsuUtils.isBlank("")).isTrue();
		assertThat(StringTatsuUtils.isBlank(" ")).isTrue();
		assertThat(StringTatsuUtils.isBlank(null)).isTrue();
	}

	@Test
	public void shouldReturnFalseWhenStringIsNotBlank() {
		assertThat(StringTatsuUtils.isNotBlank("V")).isTrue();
		assertThat(StringTatsuUtils.isNotBlank("Value1")).isTrue();
		assertThat(StringTatsuUtils.isNotBlank("Value1 Value")).isTrue();
	}

	@Test
	public void shouldReturnFalseWhenEmailIsNotValid() {
		assertThat(StringTatsuUtils.isEmail(null)).isFalse();
		assertThat(StringTatsuUtils.isEmail("")).isFalse();
		assertThat(StringTatsuUtils.isEmail(" ")).isFalse();
		assertThat(StringTatsuUtils.isEmail("a")).isFalse();
		assertThat(StringTatsuUtils.isEmail("admin")).isFalse();
		assertThat(StringTatsuUtils.isEmail("admin@")).isFalse();
		assertThat(StringTatsuUtils.isEmail("admin@michalszalkowski")).isFalse();
	}

	@Test
	public void shouldReturnTrueWhenEmailIsValid() {
		assertThat(StringTatsuUtils.isEmail("admin@michalszalkowski.pl")).isTrue();
	}

	@Test
	public void shouldReturnFullName() {
		assertThat(StringTatsuUtils.getFullName(null, null)).isEqualTo("");
		assertThat(StringTatsuUtils.getFullName("Michał", null)).isEqualTo("Michał");
		assertThat(StringTatsuUtils.getFullName(null, "Szałkowski")).isEqualTo("Szałkowski");
		assertThat(StringTatsuUtils.getFullName("Michał", "Szałkowski")).isEqualTo("Michał Szałkowski");
	}
}