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

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

	
    private double[][] dataSet1 = {
            {12345.67, 23456.78, 34567.89, 45678.90},
            {98765.43, 87654.32, 76543.21},
            {65432.10, 56789.01, 54321.09, 43210.98},
            {10987.65, 98765.43, 87654.32, 76543.21},
            {32109.87, 43210.98, 54321.09, 65432.10}
        };

        @Test
        public void testCalculateHolidayBonus() {
            double[] expectedBonuses = {6000, 9000, 7000, 16000, 8000};
            assertArrayEquals(expectedBonuses, HolidayBonus.calculateHolidayBonus(dataSet1), 0.01);
            
        }

        @Test
        public void testCalculateTotalHolidayBonus_dataSet1() {
            assertEquals(46000, HolidayBonus.calculateTotalHolidayBonus(dataSet1), 0.01);
        }
 }



