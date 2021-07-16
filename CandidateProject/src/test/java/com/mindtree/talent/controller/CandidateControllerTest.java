package com.mindtree.talent.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CandidateControllerTest {

	@Autowired
	CandidateController candidateController;
	
	@Test
	void oneTest() {
		assertEquals("Notworking", candidateController.getMessage());
	}
	
	@Test
	void twoTest() {
		assertEquals("Working", candidateController.getMessage());
	}
	
	@Test
	void threeTest() {
		assertEquals("Working", candidateController.getMessage());
	}

}
