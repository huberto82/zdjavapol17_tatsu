package com.michalszalkowski.module.home;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HomeControllerTest {

	@Autowired
	private HomeController homeController;

	@Test
	public void shouldReturnController() {
		assertThat(homeController).isNotNull();
		assertThat(homeController.greeting()).isEqualTo("Hello World");
		assertThat(homeController.noGreeting()).isEqualTo("Go away");
	}

}