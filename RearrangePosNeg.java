/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++)
    arr[i] = sc.nextInt();
    int i = 0;
    int j = 1;
    while(j<n)
    {
        if(arr[j]<0)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
        }
        j++;
    
	}
	for(int k = 0; k<n;k++)
	System.out.print(arr[k]+" ");
}
}
