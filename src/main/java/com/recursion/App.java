package com.recursion;

/**
 * Hello world!
 *
 */
public class App {

	void printNTimes(int n) {
		if (n == 0)
			return;
		System.out.println("TEST");
		printNTimes(n - 1);

	}

	void printName(int i, int n) {
		if (i > n)
			return;
		System.out.println("MY NAME");
		printName(i + 1, n);

	}

	void print1toN(int counter, int n) {
		if (counter > n)
			return;
		System.out.println(counter);
		print1toN(counter + 1, n);
	}

	void printNto1(int counter, int n) {
		if (counter < 1)
			return;
		System.out.println(counter);
		printNto1(counter - 1, n);
	}

//	int sumtoN(int n) {
//		if (n == 1)
//			return 1;
//
//		return n + sumtoN(n - 1);
//
//	}

	void sumtoN(int n, int sum) {
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		sum = n + sum;
		sumtoN(n - 1, sum);

	}

	void factorialtoN(int n, int factorial) {
		if (n == 0) {
			System.out.println(factorial);
			return;
		}
		factorial = n * factorial;
		factorialtoN(n - 1, factorial);
	}

	void reverseArray(int[] a, int i) {
		if (i >= a.length / 2) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]);
			}
			return;
		}
		int temp = a[i];
		a[i] = a[a.length - 1 - i];
		a[a.length - 1 - i] = temp;
		reverseArray(a, i + 1);

	}

	void palindromeOrNot(int a[], int s, int e) {
		if (s > e) {
			System.out.println("PALINDROME");
			return;
		}
		if (a[s] == a[e])
			palindromeOrNot(a, s + 1, e - 1);
		else
			System.out.println("NOT PALINDROME");
	}

	int fibonacci(int n) {
		if (n == 0 || n == 1)
				return n;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(new App().fibonacci(i));
		}
		

	}
}
