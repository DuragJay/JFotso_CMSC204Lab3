package jFotso_Lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook testCase1;
	GradeBook testCase2;

	@BeforeEach
	void setUp() throws Exception {
		//set up 2 GradeBook Objects with 5 score
		 testCase1 = new GradeBook(5);
		 testCase2 = new GradeBook(5);
		
		//adding two scores in both arrays
		testCase1.addScore(98);
		testCase1.addScore(75);
		
		testCase2.addScore(85);
		testCase2.addScore(79);
	}

	@AfterEach
	void tearDown() throws Exception {
		//set both objects to null
		testCase1 = null;
		testCase2 = null;
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		
		assertEquals(2.0, testCase1.getScoreSize(), 0.01);
		assertEquals(2.0, testCase2.getScoreSize(), 0.01);
		//compare what is in the score array to what is supposed to be in the scores array
		assertTrue(testCase1.toString().equals("98 75 "));
		assertTrue(testCase2.toString().equals("85 79 "));
		
	}

	@Test
	void testSum() {
		//compare what is returned in sum with expected return
		assertEquals(173, testCase1.sum(), 0.0001);
		assertEquals(164, testCase2.sum(), 0.0001);
		
		
		//fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		
		//compare what is returned by min() with the expected return
		
		assertEquals(75, testCase1.minimum(), 0.001);
		assertEquals(79, testCase2.minimum(), 0.001);
		///fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		//compare what is returned by finalScore(0 to the expeced 
		assertEquals(98, testCase1.finalScore(), 0.0);
		assertEquals(85, testCase2.finalScore(), 0.0);
		
	}

}
