//Average of elements
package com.array;

public class AverageElement {
	public void average()
	{
		int i,total = 0,avg = 0;
		int a[]= {1,2,3,4,5};
		
		for(i=0;i<a.length;i++)	
		{
			total=total+a[i];
			avg=total/a.length;
		}
		System.out.println("total of:"+total);
		System.out.println("Average of:"+avg);
	}
	public static void main(String[]ar)
	{
		AverageElement a=new AverageElement();
		a.average();
	}
}
