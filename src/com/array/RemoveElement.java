//remove element from array
package com.array;

public class RemoveElement {
	public void remove()
	{
		int i;
		int a[]=new int[] {1,2,3,4,5};
		
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			System.out.print("\t" +a[i]);
		}
	}
	public static void main(String[]ar)
	{
		RemoveElement r=new RemoveElement();
		r.remove();
	}
}
