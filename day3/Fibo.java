package week1.day3;

public class Fibo {
	public static void main(String[] args) {
		int n=8,x=0,y=1,z;
		System.out.println(x);
		System.out.println(y);
		for(int i=2;i<n;i++) {
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}

}
