package com.samoyl.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopList {
	private List<Integer> L = new ArrayList<>();
	private Scanner input = new Scanner(System.in);
	boolean check = true;
	boolean endList = true;
	boolean inputNumber = true;
	private int ln = 0;
	private int n = 0;
	private int start = 0;
	private int i;

	public void checkInput() {
		System.out.println("Please enter the start number of the list: ");
		start = input.nextInt();

		int attempts = 5;
		for (i = 0; i <= 4; i++) {
			if (endList) {
				System.out.println("Please enter a number to specify the size of the list: ");
				ln = input.nextInt();
			}
			if (inputNumber) {
				System.out.println("Please enter the number you want to find in the list: ");
				n = input.nextInt();
			}

			if (ln <= start && i < 4) {
				inputNumber = false;
				System.err.println(
						"The start number of the List should not be equal to or bigger then the size number of the list.");
			} else if ((n >= ln || n < start) && i < 4) {
				inputNumber = true;
				endList = false;
				System.err.println(
						"The number you want to find should be less then size number of the List and bigger then start number of the list..");
			} else if (n < ln && n > start) {
				break;
			}

			attempts--;
			System.out.println("You still have " + attempts + " attempts, try again ");

			if (i == 4) {
				System.err.println("Your five attempts are ended. Please try again later");
				check = false;
			}
		}
	}

	public void buildList() {
		System.out.println("The size of the List is between " + start + " and " + ln + ".");
		for (int i = start; i < ln; i++) {
			L.add(i);
		}
	}

	public void normalLoop() {
		i = 1;
		for (int s : L) {
			if (s == n) {
				System.out.println(s + " in postion: " + (s - 1) + " In " + i + " loops");
				break;
			}
			i++;
		}
	}

	public void advancedLoop() {
		// int start1 = start;
		 int end = ln - 1;

		for (i = 0; i < L.size(); i++) {
			int m = (end + start) / 2;
			if (n == start) {
				System.out.println(start + " in postion: " + (start - 1) + " In " + (i + 1) + " loops");
				break;
			} else if (n == end) {
				System.out.println(end + " in postion: " + (end - 1) + " In " + (i + 1) + " loops");
				break;
			} else if (n == m) {
				System.out.println(m + " in postion: " + (m - 1) + " In " + (i + 1) + " loops");
				break;
			} else if (m > n) {
				end = m;
			} else if (m < n) {
				start = m;
			}
		}
	}
}
