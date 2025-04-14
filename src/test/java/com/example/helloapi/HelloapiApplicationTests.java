package com.example.helloapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloapiApplicationTests {

	@Test
	void addition() {
        assertEquals(5, 2 + 2);
    }

}
