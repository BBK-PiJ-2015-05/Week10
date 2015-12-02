import java.util.Arrays;
import java.util.Comparator;
public class ArraySorter {
	private Integer[] olliesAndSarahsArray;
	
	public static void main(String[] args) {
		ArraySorter myAS = new ArraySorter();
		
		myAS.launch();
		
		
	}
	
	public void launch() {
		olliesAndSarahsArray = new Integer[10];
		for (int i = 0; i < 10; i++) {
			Integer temp = (int) (Math.random() *10);
			olliesAndSarahsArray[i] = temp;
		}
		
		printArray();
		//now sort with Lambda
		Arrays.sort(olliesAndSarahsArray, (Integer a, Integer b) -> a.compareTo(b));
		
		System.out.println("Sorted: ");
		printArray();
		//sort with AIC
	}
	private void printArray() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Array i-" + i + ": " + olliesAndSarahsArray[i]);
		}
	}
	
	private void checkBox() {
		
	}
	
}