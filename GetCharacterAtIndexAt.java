package week3.day1.assignments;

public class GetCharacterAtIndexAt {

	public static void main(String[] args) {
		String text = "Java Exercise";
		System.out.println("The String: "+text);
		char chAtIndex5 = text.charAt(5);
		System.out.println("Char at index 5: "+chAtIndex5);
		char chAtIndex11 = text.charAt(11);
		System.out.println("Char at index 11: "+chAtIndex11);
		int indexOfE = text.indexOf('E');
		System.out.println("Index of 'E'   : "+indexOfE);
		int indexOfs = text.indexOf('s');
		System.out.println("Index of 's'   : "+indexOfs);
	}

}
