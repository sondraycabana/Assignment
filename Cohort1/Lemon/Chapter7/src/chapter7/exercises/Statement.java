package chapter7.exercises;

/**
 * @author LEMON
 *
 */
public class Statement {
	public static void main(String[] args) {

		int[] count = new int[10];

		int[] bonus = new int[15];

		System.out.print("(a)");

		for (int zero : count) {
			System.out.print(zero);
		}
		System.out.println();

		System.out.print("(b)");

		for (int one : bonus) {
			
			one += 1;			
			System.out.print(one);
		}
		System.out.println();
		int[] bestScores = { 5, 3, 78, 23, 7};
		
		System.out.println("(c)");
		
		System.out.println("Index\tValue");
		
		for (int score : bestScores) {
			System.out.println(score + "\t" + score);
		}
	}
}