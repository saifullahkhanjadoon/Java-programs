// Q2. Write a program in Java to read a set of numbers to store it in one dimensional array A, copy the elements
// 	in another Array B in reverse order, find the sum of individual 
// 	array A and B and copy the result in array C and display all three arrays.

import java.util.Scanner;
public class Q2{

	public static void main(String[] args)
	{	Scanner sc=new Scanner(System.in);

	int[] A1=new int[5];
		int[] A2=new int[5];
	int[] A3=new int[5];

	System.out.println("Enter 5 numbers ");
	for(int i=0;i<A1.length;i++){
			System.out.print("Enter "+(i+1)+" number: ");

		A1[i]=sc.nextInt();
	}

		for(int i=0;i<A1.length;i++){

			A2[i]=A1[A1.length-1-i];
}
	for(int j=0;j<A1.length;j++){
				A3[j]=A1[j]+A2[j];
				}

	System.out.println("A1 numbers: ");
	for(int i:A1){
			System.out.print(i+" ");
				}		System.out.println();

	System.out.println("A2 numbers: ");
		for(int i:A2){
					System.out.print(i+" ");}
			System.out.println();
			System.out.println("A3 numbers: ");
				{	for(int i:A3)
					System.out.print(i+" ");
}}

}
