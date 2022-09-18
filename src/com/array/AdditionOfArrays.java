//Addition of two arrays
package com.array;

import java.util.Scanner;

public class AdditionOfArrays {
	public  void addition() {
	
		Scanner sc=new Scanner(System.in);
		int i;
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		int c[]=new int[4];
		for(i=0;i<=3;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(i=0;i<=3;i++)
		{
			System.out.println(+c[i]);
		}
	}
	public static void main(String[]ar)
	{
		AdditionOfArrays a=new AdditionOfArrays();
		a.addition();
	}
		
	
}

