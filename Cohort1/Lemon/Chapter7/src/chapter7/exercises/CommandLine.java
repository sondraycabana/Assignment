package chapter7.exercises;

public class CommandLine {
	
	public static void main(String[] args) {
		
		
//		for(int i=0; i<args.length; i++) {
			
			int numb=0;
			int arraylength = 10;
			
			if (args.length != 0) {
				numb = Integer.parseInt(args[0]);
					
				arraylength = numb;
			}
			
			int[] array = new int[arraylength];

		
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		for(int counter = 0; counter < array.length; counter++)
			System.out.printf("%4d%8d%n", counter, array[counter]);
		
	} // end method main
}
