package arrays;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int a:array)
        {
            System.out.println(a);
        }

        System.out.println(maxelement(array));

    }

    public static int maxelement(int array[])
    {
        int max=Integer.MIN_VALUE;
        for(int g:array)
        {
            if(g>max)
            {
                max=g;
            }
        }
        return max;
    }
}
