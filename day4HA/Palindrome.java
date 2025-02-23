package day4HA;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int temp = num;
		int revNum=0,rem=0;
		while(num!=0) {
			rem= num%10;
			revNum= revNum*10 + rem;
			num=num/10;
		}
		if(temp==revNum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
