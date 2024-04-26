/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: 
 * Assignment 5
 * Due: 04/25/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Donald Le
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {
	double[][] dataSet1 = {
            {12345.67, 23456.78, 34567.89, 45678.90},
            {98765.43, 87654.32, 76543.21},
            {65432.10, 56789.01, 54321.09, 43210.98},
            {10987.65, 98765.43, 87654.32, 76543.21},
            {32109.87, 43210.98, 54321.09, 65432.10}
        };

	@Test
	void setUp() {
	}
	
	@Test
	public void testGetAverage() {
		assertEquals(56199.47, TwoDimRaggedArrayUtility.getAverage(dataSet1), 0.01);
	}
	
	@Test
	public void testGetColumnTotal() {
		assertEquals(219640.71, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), 0.01);
		assertEquals(309876.52, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1), 0.01);
		assertEquals(307407.6, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 2), 0.01);
		assertEquals(230865.19, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 3), 0.01);
	}
	@Test	
	public void testGetHighestInArray() {
		assertEquals(98765.43, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 0.01);
	}
	
	@Test	
	public void testGetHighestInColumn() {
		assertEquals(98765.43, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), 0.01);
		assertEquals(98765.43, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 1), 0.01);
		assertEquals(87654.32, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2), 0.01);
		assertEquals(76543.21, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 3), 0.01);
	}

	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0));
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 1));
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 2));
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 3));
	}
	
	@Test
	public void testGetHighestInRow() {
		assertEquals(45678.9, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0));
		assertEquals(98765.43, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 1));
		assertEquals(65432.1, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2));
		assertEquals(98765.43, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 3));
	}
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0));
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 1));
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
		assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 3));
	}
	
	@Test
	public void testGetLowestInArray() {
		assertEquals(10987.65, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1));
	}
	
	@Test
	public void testGetLowestInColumn() {
		assertEquals(10987.65, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0));
		assertEquals(23456.78, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 1));
		assertEquals(34567.89, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 2));
		assertEquals(43210.98, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 3));
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		
	}
	
	@Test
	public void testGetLowestInRow() {
		
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		
	}
	
	@Test
	public void testGetRowTotal() {
		
	}
	
	@Test
	public void testGetTotal() {
		
	}
	

	

	
	

}
