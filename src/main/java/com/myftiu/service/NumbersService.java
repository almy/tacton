package com.myftiu.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author by ali myftiu on 09/10/14.
 */
@Service
public class NumbersService {

	private static final Pattern pattern = Pattern.compile(".*[^0-9].*");

	public static void main(String args[]) {



		System.out.println("Please enter an integer or press Q to exit");
		Scanner input = new Scanner(System.in);
		String value = "";
         NumbersService numbersService = new NumbersService();


		while(input.hasNextLine()) {
			value = input.next().trim();
			if("Q".equalsIgnoreCase(value)) {
				input.close();
				System.out.println("Program exited by user.");
				System.exit(0);
			} else if(value.matches("\\d+")) {
				System.out.println("the " + value + "th of the series is " + numbersService.calculateNumber(Integer.parseInt(value)) );
			} else {
				System.out.println(value + " is not of valid number. Please enter a valid number or press Q to exit");
			}

		}

	}


	public  int calculateNumber(int number) {

		int prevNumber = 0;
		int nextNumber = 1;
		int index = 1;

		while (index < number) {
			int currentNumber = prevNumber;
			prevNumber= nextNumber;
			nextNumber = prevNumber + currentNumber;
			index++;
		}
		return nextNumber;

	}

}
