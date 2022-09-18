//Find 2nd highest value from array
package com.array;

public class Hightest2ndValue {
	public static void main(String[]ar)
	{
		int a[]= {1,4,6,2,3,5};
		int temp;
		int i;
		
		for(i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\n\n2nd highest value from array:"+a[a.length-1]);
	}
}
