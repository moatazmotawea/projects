package com.twago.task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author moataz.motawea
 *
 */
public class Test {

	static int solution(Scanner scanner, int x, int y) {

		int i, j, k;
		int[] numList = new int[x];

		try {
			while (y > 0) {

				// read input ex: 1 2 100
				String[] operation = scanner.nextLine().split(" ");

				i = Integer.parseInt(operation[0]) - 1;
				j = Integer.parseInt(operation[1]) - 1;
				k = Integer.parseInt(operation[2]);

				// add k from i to j
				for (int l = i; l <= j; l++) {
					numList[l] += k;
				}

				// operations counter
				y--;

			}

			// ascending sorting to get the max
			Arrays.sort(numList);

			return numList[x - 1];

		} catch (NumberFormatException e) {
			System.out.println("Input format must be integers like these:1 2 100");
			return -1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	public static void main(String[] args) {

		int x, y;
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Enter array size and number of operations: ");
			String[] inputs = scanner.nextLine().split(" ");

			x = Integer.parseInt(inputs[0]);
			y = Integer.parseInt(inputs[1]);

			System.out.println(solution(scanner, x, y));

		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println("List size and opertions must be integers like these:5 3");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
