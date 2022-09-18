//Remove dublicate element from array
package com.array;

public class  RemoveDublicates{
	public void remove()
	{
		int i,j;
		
		int a[]= {1,2,3,4,5,5};
		
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println("Dublicates Element is:"+a[j]);
				}
			}
		}
		
	}
	public static void main(String[]ar)
	{
		RemoveDublicates r=new RemoveDublicates();
		r.remove();


	}
	
}
