package com.michalszalkowski.module.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTatsuUtilsTest {

	@Test
	public void shouldReturnTrueAAA() {
		// arrange
		int caseA = 2;
		// act
		boolean result = NumberTatsuUtils.isEven(caseA);
		// assert
		assertThat(result).isTrue();
	}

	@Test
	public void shouldReturnTrueGWT() {
		// given
		int caseA = 2;
		// when
		boolean result = NumberTatsuUtils.isEven(caseA);
		// then
		assertThat(result).isTrue();
	}

	@Test
	// -> 2,4,6,8,10
	public void shouldReturnTrue() {
		assertThat(NumberTatsuUtils.isEven(2)).isTrue();
		assertThat(NumberTatsuUtils.isEven(4)).isTrue();
		assertThat(NumberTatsuUtils.isEven(6)).isTrue();
		assertThat(NumberTatsuUtils.isEven(8)).isTrue();
		assertThat(NumberTatsuUtils.isEven(10)).isTrue();
	}

	@Test
	// -> 1,3,5,7,9
	public void shouldReturnFalse() {
		assertThat(NumberTatsuUtils.isEven(1)).isFalse();
		assertThat(NumberTatsuUtils.isEven(3)).isFalse();
		assertThat(NumberTatsuUtils.isEven(5)).isFalse();
		assertThat(NumberTatsuUtils.isEven(7)).isFalse();
		assertThat(NumberTatsuUtils.isEven(9)).isFalse();
	}

	@Test
	public void shouldReturnSum() {
		assertThat(NumberTatsuUtils.add(0, 0)).isEqualTo(0);
		assertThat(NumberTatsuUtils.add(0, 1)).isEqualTo(1);
		assertThat(NumberTatsuUtils.add(1, 0)).isEqualTo(1);
		assertThat(NumberTatsuUtils.add(1, 1)).isEqualTo(2);
		assertThat(NumberTatsuUtils.add(10, 20)).isEqualTo(30);
		assertThat(NumberTatsuUtils.add(-10, 20)).isEqualTo(10);
		assertThat(NumberTatsuUtils.add(10, -20)).isEqualTo(-10);
	}
}