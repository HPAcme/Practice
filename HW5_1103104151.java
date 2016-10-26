import java.util.Scanner;

public class HW5_1103104151 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入Array[c,z]大小");
		System.out.print("c=");
		int c=sc.nextInt();
		System.out.print("z=");
		int z=sc.nextInt();
		System.out.println("請輸入Array2[c,z]大小");
		System.out.print("c=");
		int v=sc.nextInt();
		System.out.print("z=");
		int q=sc.nextInt();
		int Array[][]=new int[c][z];
		int Array2[][]=new int[v][q];
		for(int a=0;a<c;a++)
		{
			for(int b=0;b<z;b++)
			{
				System.out.print("Array["+a+","+b+"]=");
				Array[a][b]=sc.nextInt();
			}
		}
		for(int a=0;a<v;a++)
		{
			for(int b=0;b<q;b++)
			{
				System.out.print("Array2["+a+","+b+"]=");
				Array2[a][b]=sc.nextInt();
			}
		}
		printARR(Array);
		printARR(Array2);
		multiplication(Array, Array2);
		printARR(multiplication(Array, Array2));
		sc.close();
	}

	public static int[][] multiplication(int[][] array, int[][] array2) {
		// TODO Auto-generated method stub
		int [][] array3=new int[array.length][array.length];
		for (int i = 0; i <array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array3[i][j]=0;
				for(int k=0;k<array[i].length;k++)
				{
					array3[i][j]=array3[i][j]+array[i][k]*array2[k][j];
				}
			}
		}
		return array3;
	}

	private static void printARR(int[][] Array)  {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 0; i < Array.length; i++) {
			for (j = 0; j < Array[i].length; j++) {
				System.out.print("[");
				System.out.print(Array[i][j]);
				System.out.print("]");
			}
			System.out.println();
		}
		System.out.println();
	}

}
