//Swap elements from Array
package com.array;

public class SwapElements {
	public static void main(String[]ar)
	{
		int temp=0;
		int i;
		int a[]= {2,3,4,5,6};
		temp=a[0];
		a[0]=a[4];
		a[4]=temp;
		for(i=0;i<=4;i++)
		{
			System.out.println(" "+a[i]);
		}
	}
}
