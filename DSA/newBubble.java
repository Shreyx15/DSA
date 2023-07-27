package com.company;

import java.util.*;
public class newBubble
{
    public void display(int a[] , int n)
    {
        for(int k = 0; k < n; k++)
        {
            System.out.print(a[k]+" ");
        }
        System.out.println("\n");
    }
    public  void bubbleSort(int a[], int n)
    {
        int temp;
        boolean swapped = false;
        for(int i = 0; i < n; i++)
        {
            // Printing the passes
            System.out.println("Pass"+i+"->");
            display(a,n);
            for(int j = 0; j < n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements: \n");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
        newBubble obj = new newBubble();
        obj.bubbleSort(a,n);
    }
}
