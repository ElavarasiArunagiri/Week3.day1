package week3.day1.assignments;

public class CompareStrings {

	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		System.out.println("String1: "+str1);
		System.out.println("String2: "+str2);
		boolean comp = str1==str2;
		boolean equals = str1.equals(str2);
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);			
		System.out.println("The strings compared using \"==\" returns: "+comp);
		System.out.println("The strings compared using \"equals\" returns: "+equals);
		System.out.println("The strings compared using \"equalsIgnoreCase\" returns: "+equalsIgnoreCase);

	}

}
