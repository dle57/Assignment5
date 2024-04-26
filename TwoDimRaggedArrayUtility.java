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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	//NOTE TO SELF: DONT FORGET TO ADD COMMENTS TO STAEMENTS IN METHODS	
	
	/**
	 * This method returns the average of the elements in the two dimensional array
	 * @param data is the two dimensional array getting the average of 
	 * @return the average of the elements in the passed two dimensional array
	 */
	static double getAverage(double[][] data) {
		double total = 0;
		int counter = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];
				counter += 1;
			}
		}
		return total / counter; 
	}
	
	/**
	 * This method returns the total of the selected column in the two dimensional array 
	 * index 0 refers to the first column. If a row in the two dimensional array doesn't 
	 * have this column index, it is not an error, it doesn't participate in this method.
	 * @param data is the two dimensional array
	 * @param col is the column index to take the total of (0 refers to the first column)
	 * @return the total of the column
	 */
	static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && col >= 0)
				total += data[i][col];
		}
		return total;
	}
	
	static double getHighestInArray(double[][] data) {
		double highest = data[0][0]; 
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > highest)
					highest = data[i][j];
			}
		}
		return highest; 
		
	}

	static double getHighestInColumn(double[][] data, int col) {
		double highest = 0.0;
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && col >= 0) {
				if (data[i][col] > highest)
					highest = data[i][col];
			}
		}
		return highest; 
	
	}
	
	static int getHighestInColumnIndex(double[][] data, int col) {
		int index = 0;
		double highest = 0.0;
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && col >= 0) {
				if (data[i][col] > highest) {
					highest = data[i][col];
					index = i;
				}
			}
		}
		return index; 
	}
	
	static double getHighestInRow(double[][] data, int row) {
		double highest = 0.0;
		for (int j = 0; j < data[row].length; j++) {
			if (data[row][j] > highest) {
				highest = data[row][j];
			}
		}
		return highest; 
	}
	
	static int getHighestInRowIndex(double[][] data, int row) {
		int index = 0;
		double highest = 0.0;
		for (int j = 0; j < data[row].length; j++) {
			if (data[row][j] > highest) {
				highest = data[row][j];
				index = j;
			}
		}
		return index; 
	}
	
	static double getLowestInArray(double[][] data) {
		double lowest = data[0][0]; 
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] < lowest)
					lowest = data[i][j];
			}
		}
		return lowest; 
	}
	
	static double getLowestInColumn(double[][] data, int col) {
		double lowest = data[0][col];
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && col >= 0) {
				if (data[i][col] < lowest)
					lowest = data[i][col];
			}
		}
		return lowest; 
	}
	
//REVISIT, issue with out of bounds and initialization 
	static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = 1000; //data[0][col];
		int index = data.length - 1;
		for (int i = 0; i < data.length; i++) {
			if (col < data[i].length && col >= 0) {
				if (data[i][col] < lowest) {
					lowest = data[i][col];
					index = i;
				}
			}
		}
		return index; 
	}
	
	static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		for (int j = 0; j < data[row].length; j++) {
			if (data[row][j] < lowest) {
				lowest = data[row][j];
			}
		}
		return lowest; 
	}
	
	static int getLowestInRowIndex(double[][] data, int row) {
		double lowest = data[row][0];
		int index = 0;
		for (int j = 0; j < data[row].length; j++) {
			if (data[row][j] < lowest) {
				lowest = data[row][j];
				index = j;
			}
		}
		return index; 
	}
	
	static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for (int j = 0; j < data[row].length; j++) {
			total += data[row][j];
		}
		return total;
	}
	
	static double getTotal(double[][] data) {
		double total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				total += data[i][j];
			}
		}
		return total; 
	}

	public static double[][] readFile(File selectedFile) throws FileNotFoundException {
		File file = selectedFile;
		Scanner inputFile = new Scanner(file);
		ArrayList<double[]> rows = new ArrayList<>();

		
		while (inputFile.hasNextLine()) {
			String line = inputFile.nextLine();
			Scanner scannerLine = new Scanner(line);
			
			ArrayList<Double> values = new ArrayList<>();
			
			while (scannerLine.hasNextDouble()) {
				double value = scannerLine.nextDouble();
				values.add(value);
			}
			
			double[] row = new double[values.size()];
			for (int i = 0; i < values.size(); i++) {
				row[i] = values.get(i);
			}
			
			rows.add(row);
		}
		
		double[][] data = new double[rows.size()][];
	    for (int i = 0; i < rows.size(); i++) {
	        data[i] = rows.get(i);
	    }
		
	   return data;
	}

	public static void writeToFile(double[][] sales, File selectedFile) throws FileNotFoundException {
		PrintWriter outputFile = new PrintWriter(selectedFile);

	    // Iterate through the array and write each element to the file
	    for (double[] row : sales) {
	        for (double value : row) {
	            outputFile.print(value + " ");
	        }
	        outputFile.println(); // Move to the next line after each row
	    }

	    outputFile.close(); // Close the PrintWriter
	}
	
	
	
	//public static double[][] readFile(File file){
		
		
	
}
