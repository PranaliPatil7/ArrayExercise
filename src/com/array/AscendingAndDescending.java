package com.array;

public class AscendingAndDescending {
   int a[]= {2,4,5,6,7,8,9};
   int temp=0;
   public  void ascending()
   {
	   int a[]={22,34,98,67,50,45};
		int temp=0;
		System.out.print("\n\t Ascending Array is:");
		for(int i=0;i<a.length;i++)
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
   }
  
   public void descending()
   {
	   int a[]={22,34,98,67,50,45};
		int temp=0;
		System.out.print("\n\t Descending Array is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[i])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print("\t " +a[i]);
			
		}
   }

	public static void main(String[]ar)
	{
		AscendingAndDescending a=new AscendingAndDescending();
		a.ascending();
		a.descending();
		
		
	}
}
