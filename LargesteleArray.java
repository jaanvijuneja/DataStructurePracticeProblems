package databasepractice;

import java.util.Scanner;

public class LargesteleArray {
    
   private int[] arr;
    private int size, temp, k; 
    private Scanner scanner = new Scanner(System.in);
    void getArray()
    {
        System.out.println("Size of array:");
        size = scanner.nextInt();
        
        arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("k=");
        k=scanner.nextInt();
        for(int i=1;i<=k;i++)
        System.out.print(arr[size-i]+" ");        
    }    
}
