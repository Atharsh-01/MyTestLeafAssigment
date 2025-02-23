package day4HA;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String a="atharsh";
		char[] charArray = a.toCharArray();
		
		for(int i=0;i<= charArray.length-1;i++) {
			
			if(i%2!=0) {
				charArray[i]= Character.toUpperCase(charArray[i]);
			}
		}
		System.out.println(charArray);
	}

}
