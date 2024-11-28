package assignment;
import java.util.Scanner;

public class Problemc {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter N ");
	        int N = scanner.nextInt();

	        try {

	            if (N < 0 || N >= 31) {
	                System.out.println("Please enter a value for N such that 0 <= N < 31.");
	                return;
	            }

	            System.out.println("Table of powers of 2 up to 2^" + N + ":");

	            for (int i = 0; i <= N; i++) {
	                System.out.println((int)Math.pow(2, i));
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter an integer value for N.");
	        }
	       
	    }
	}
