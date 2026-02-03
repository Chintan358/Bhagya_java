package arrays;

public class A003_sortingArray {
	public static void main(String[] args) {
		
		
		
		int a[]= {10,20,56,7,89,4,1,89,60,5,25,45,63};
		
		//10,20,7,56,4,1,89,60,5,25,45,63,89
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
}
