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

public class HolidayBonus {
	final static double HIGHEST_SOLD_BONUS = 5000;
	final static double LOWEST_SOLD_BONUS = 1000;
	final static double OTHER_BONUS = 2000;
	
	static double[] calculateHolidayBonus(double[][] data) {
		double[] bonuses = new double[data.length];

	    for (int i = 0; i < data.length; i++) {
	        double totalBonus = 0.0;
	        boolean isPositive = false; 
	        for (int j = 0; j < data[i].length; j++) {
	            if (data[i][j] > 0) {
	                isPositive = true; 
	                if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j)) {
	                    totalBonus += HIGHEST_SOLD_BONUS;
	                } 
	                else if (data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j)) {
	                    totalBonus += LOWEST_SOLD_BONUS;
	                } 
	                else {
	                    totalBonus += OTHER_BONUS;
	                }
	            }
	        }
	   
	        if (isPositive) {
	            bonuses[i] = totalBonus;
	        }
	        else {
	            bonuses[i] = 0;
	        }
	    }
	    return bonuses;

	}
	
	static double calculateTotalHolidayBonus(double[][] data) {
		double total= 0.0;
		double[] arr = calculateHolidayBonus(data);

        for (int i = 0; i < data.length; i++) {
            total += arr[i];
        }

        return total;
        
	}
	
}
