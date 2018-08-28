import java.util.Arrays;
import java.util.Scanner;

public class MaxOne {

	private int arr[][];
	private int size,max=0;
	private int[] temp;
	private Scanner scanner = new Scanner(System.in);
	
	void getArray()
	{
		System.out.println("Size of array:");
		size = scanner.nextInt();
		temp = new int[size];
		arr = new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j] = scanner.nextInt();
				if(arr[i][j]==1)
				{
					max++;
				}
			}
			temp[i]=max;
			max=0;
		}
		System.out.println(Arrays.toString(temp));
		int t = temp[0];
		
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>t)
			{
				t = temp[i];
			}
		}
		
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==t)
			{
				size = i;
			}
		}
		
		System.out.println("Max: "+t+" Row: "+size);
	}
}
