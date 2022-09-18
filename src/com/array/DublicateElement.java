package com.array;

public class DublicateElement {
	public static void main(String[]ar)
	{
		int a[]= {1,2,3,5,4,3,8};
		int b[]=new int[a.length];
		int i,temp,k=0;
		for(i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print("\t" +a[i]);
		}
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[k]=a[i];
				k++;
			}
		}
		b[k]=a[a.length-1];
		System.out.println("\n After removing Dublicate element:");
		for(i=0;i<k;i++)
		{
			System.out.print("\t" +a[i]);
		}
    }
}
