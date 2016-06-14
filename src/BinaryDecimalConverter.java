import java.util.Scanner;

public class BinaryDecimalConverter {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	    int number;
	    System.out.println("Please input the binary number: ");
		number =sc.nextInt();
		
		
		int power=1;
		int decimal = 0;
		while (number > 0 ) {
			decimal += (number %10) * power;
			number = number / 10;
			power = power * 2;
		}
		
		
		System.out.println("The decimal is "+decimal);
		
		
	}

}
