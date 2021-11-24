import java.util.Scanner;

class FibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scan.nextInt();
  
		int []c = new int[num];
		c[0]=1;c[1]=1;
		System.out.println("Fibonacci series '"+ num +" Number is :"+c[0]+" "+c[1]);
		int i =2;

		while(i<num)
		{
			c[i]=c[i-1]+c[i-1];
			System.out.println(" "+c[i]);
			i++;
		}

	}
}
