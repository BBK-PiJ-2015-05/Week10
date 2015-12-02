public class StringUtils {
	public static String betterString(String s1, String s2, TwoStringPredicate tester) {
		if (tester.isBetter()) {
			return s1;
		} else return s2;
	}

	public static void main(String[] args) {
		System.out.println(StringUtils.betterString("Ollie", "Sarah", (a,b) -> a.charAt(0) > b.charAt(0)));
		
	}	
	
}