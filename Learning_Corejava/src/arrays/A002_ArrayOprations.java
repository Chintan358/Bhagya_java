package arrays;

public class A002_ArrayOprations {
		
	
			
			
			public static void main(String[] args) {
				
//				int a[] = {10,20,30,40,50,60,70};
//				int b[] = new int[10];
//				
//				System.arraycopy(a, 2, b, 5, 3);
//				
//				for(int i=0;i<b.length;i++)
//				{
//					System.out.println(b[i]);
//				}
				
				
//				int a[] = {10,20,30,40,50,60};
//				
//				int b[] = new int[a.length];
//				
//				for(int i=0;i<a.length;i++)
//				{
//					b[i] = a[i];
//				}
//				
//				for(int i=0;i<b.length;i++)
//				{
//					System.out.println(b[i]);
//				}
				
//				
//				int a[] = {10,20,30,40,50,60};
//				int b[] = {100,200,300,400,500,600};
//				int c[] = new int[a.length+b.length];
//				
//				for(int i=0;i<a.length;i++)
//				{
//					c[i] = a[i];
//				}
//				
//				for(int i=0;i<b.length;i++)
//				{
//					c[a.length+i] = b[i];
//				}
//				
//				for(int i=0;i<c.length;i++)
//				{
//					System.out.println(c[i]);
//				}
				
				
//				int a[]= {10,20,56,7,89,4,1,5,25,45,63};
				
//				int sum = 0;
//				for(int i=0;i<a.length;i++)
//				{
//					sum = sum + a[i];
//				}
//				System.out.println("sum is : "+sum);
//				System.out.println("Avg is : "+(sum/a.length));
				
//				int max = a[0]; 
//				for(int i=0;i<a.length;i++)
//				{
//					if(a[i]>max)
//					{
//						max = a[i];
//					}
//				}
//				System.out.println(max);
				
				int a[]= {10,20,56,7,89,4,1,89,60,5,25,45,63};
				
				int max = a[0]; //89
				int smax = a[0]; // 60
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>max)
					{
						smax = max;
						max = a[i];
					}
					else if(a[i]>smax && a[i]!=max)
					{
						smax = a[i];
					}
				}
				System.out.println(max);
				System.out.println(smax);
				
			}
			
}
