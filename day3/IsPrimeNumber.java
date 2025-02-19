package week1.day3;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		int n=15,x = 0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
			   x=i;
			}
		}
		if(x==0) {
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
