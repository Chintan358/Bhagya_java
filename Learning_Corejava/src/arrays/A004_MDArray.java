package arrays;

public class A004_MDArray {
	public static void main(String[] args) {
		
			
//			int a[][] = new int[5][3];
//			
//			a[0][0] = 10;
//			a[0][1] = 20;
//			a[0][2] = 30;
//			
//			a[1][0] = 100;
//			a[1][1] = 200;
//			a[1][2] = 300;
//			
//			a[2][0] = 110;
//			a[2][1] = 210;
//			a[2][2] = 310;
//			
//			a[3][0] = 120;
//			a[3][1] = 220;
//			a[3][2] = 320;
//			
//			a[4][0] = 130;
//			a[4][1] = 230;
//			a[4][2] = 330;
//			
//			
//			for(int i=0;i<5;i++)
//			{
//				for(int j=0;j<3;j++)
//				{
//					System.out.print(a[i][j]+" ");
//				}
//				System.out.println();
//			}
		
		
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		
		System.out.println("++++++++++++++++++++++++");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
