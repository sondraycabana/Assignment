package chapter7.exercises;

import java.security.SecureRandom;

/**
 * @author LEMON
 *
 */
public class NewArray {

	public static void main(String[] args){

		// create instance of SecureRandom class
		SecureRandom rand = new SecureRandom();

		// declare and initialize new array
		int[] f = new int[10];

		System.out.println("element 6 is " + f[5]);

		int[] g = { 8, 8, 8, 8, 8 };
		System.out.println("element are " + g);
		

		double[] c = new double[100];
		double total = 0;

		for (int i = 0; i < c.length; i++){
			c[i] = 5 * i;
			total += c[i];
		}
		System.out.println("Total = " + total);

		int[] a = { 3, 6, 8, 9, 23, 12, 98, 9, 8, -32, 10 };

		int[] b = new int[34];

		for (int j = 0; j < a.length; j++) {
			b[j] = a[j];
			System.out.println(b[j]);
		}

		for (int y = 0; y < b.length; y++) 
			System.out.println("array b:" + b[y]);
		

		
		double[] w = new double[100];

		double value = 0;
		double smallest = rand.nextInt(50) + rand.nextDouble();
		double highest = rand.nextInt(50) + rand.nextDouble();

				
			for (int q = 0; q < w.length; q++) {
				
				value = rand.nextInt(50) + rand.nextDouble();
				if (smallest > value) {
					smallest = value;
				}
				if (highest < value) {
					highest = value;
				}
		}
		System.out.println(smallest + "\n" + highest);
	}
}