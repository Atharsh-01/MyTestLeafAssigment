package day4HA;

public class Anagram {

	public static void main(String[] args) {
		String a= "Atharsh";
		String b= "Wonders";
		
		char[] charArray = a.toCharArray();
		char[] charArray2 = b.toCharArray();
		
		if(charArray.length == charArray2.length) {
			System.out.println("The given strings are Anagram.");
		}
		else {
			System.out.println("The given strings are not an Anagram.");
		}
	}

}
