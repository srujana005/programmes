package arrayprogramms;

import java.util.Scanner;

public class FindingElennet {

	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();

	        boolean found = false;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                System.out.println("Element " + target + " found at index " + i);
	                found = true;
	                break; // Stop searching once found
	            }
	        }

	        if (!found) {
	            System.out.println("Element " + target + " not found in the array.");
	        }

	        scanner.close();
	    }
	}



