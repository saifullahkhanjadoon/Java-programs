// Q3 Write a program in Java that display Fibonacci series of n number.
// 	For example if n=7 the generated output should look like as: 1 1 2 3 5 8 13 

import java.util.Scanner;
public class Q3{

	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many fibonascci numbers: " );
	int a=0,b=1;
	int n=sc.nextInt();
	int[] fib=new int[n];
	System.out.println("Output"+a);
	for(int i=0;i<n;i++){

		fib[i]=a;
		int sum=a+b;
		a=b;
		b=sum;}

		for(int x:fib){
					if(x!=0)
			System.out.print(x+"  ");}
			System.out.println();
		}

		}
