package week3.day1.assignments;

public class ReplaceInString {

	public static void main(String[] args) {
		String str = "I am working with Java8";
		System.out.println("The given string:\n"+str);
		System.out.println("\nstring after replacing '8' with '11':\n"+str.replaceAll("8","11"));
		System.out.println("\nCharacters from index 5 to 14:\n"+str.substring(5, 14));
		System.out.println("\nadding # to the string:\n"+str.concat("#"));		
	}

}
