package hackerrank.challenge1;

import java.util.Scanner;

public class HackerRank {
	
	static int solveMefirst(int a, int b) {
		// Hint: type return a + b; bellow
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int b;
		b = sc.nextInt();
		int sum;
		sum = solveMefirst(a,b);
		System.out.println(sum);
		
		sc.close();
	}

}
