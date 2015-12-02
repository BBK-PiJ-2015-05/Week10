import java.util.Arrays;
public class FunWithStrings {
	private String[] stringArray;
	
	
	public static void main(String[] args) {
		FunWithStrings fun = new FunWithStrings();
		
		fun.launch();
		
		
	}
	
	public void launch() {
		
		stringArray = new String[]{"Ollie", "Sarah", "Chris G", 
						"Chris K", "George", "Johnny",
						"Peter", "Andre", "Hijiri", "Stephen"};
		
		printArray();
		//now Lambda sort by length, shortest to longest 
		Arrays.sort(stringArray, (a, b) -> ((Integer)a.length()).compareTo((Integer)b.length()));
		
		System.out.println("Sorted by length, shortest to longest: ");
		printArray();
		
		//Sort by length, longest to shortest
		
		Arrays.sort(stringArray, (a, b) -> ((Integer)b.length()).compareTo((Integer)a.length()));
		System.out.println("Sorted by length, longest to shortest: ");
		printArray();
		
		//Sort by first character
		
		Arrays.sort(stringArray, (a, b) -> a.compareTo(b));
		System.out.println("Sorted by first character: ");
		printArray();
		
		//Sort by whether string contains 'e'
		
		Arrays.sort(stringArray, (a, b) -> FunWithStrings.eChecker(a,b));
		System.out.println("Sorted by presence of \'e\': ");
		printArray();
	}
	private void printArray() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Array i-" + i + ": " + stringArray[i]);
		}
	}
	
	public static int eChecker(String s1, String s2) {
		if(!s1.contains("e") && (s2.contains("e"))) {
				return 1;
			} else return -1;
	}
	
}