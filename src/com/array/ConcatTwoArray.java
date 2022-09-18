//concat two arrays
package com.array;

import java.util.Arrays;

public class ConcatTwoArray {
	public static void main(String[]ar)
	{
		int i,j=0;
		int a[]= {40,24,35,46,57};
		int b[]= {64,75,83,69,10};
		int c[]=new int[a.length+b.length];
		for(i=0;i<=4;i++)
		{
			c[j]=a[i];
			j++;
		}
		for(i=0;i<=4;i++)
		{
			c[j]=b[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
	}
}
