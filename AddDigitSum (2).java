import java.util.Scanner;

public class AddDigitSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=scan.nextInt();
		int rem,sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digits are  "+sum);
	}

}
