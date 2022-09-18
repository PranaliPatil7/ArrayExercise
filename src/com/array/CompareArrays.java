//compare two arrays

package com.array;

public class CompareArrays {
	public static void main(String[]ar)
	{
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {1,2,3,4,5,6,7,8};
	    int c[]= {22,34,56,5,4};
		
				if(a.length==b.length)
				{
					
					System.out.println("Arrays are equal");
					
				}
				else
				{
					System.out.println("Arrays are not equal");
				}
				System.out.println("*****Comparism between a and c*****");
				for(int i=0;i<4;i++)
				{
					if(a.length==c.length)
					{
						System.out.println("a and c are equal");
					}
					else
					{
						System.out.println("a and c are not equal");
					}
				}
		
	}
}
