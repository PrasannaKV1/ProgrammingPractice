package arrays;

import java.util.Scanner;

public class RowWiseSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[][] ={{2,3,4},{5,6,7}};

        // now im storing the values by taking the user input

        int answer[]=generate(array);
        // now usign the for-each loop to  print the values
        for(int z:answer)
        {
            System.out.println(z);
        }


    }

    public static int[] generate(int array[][])
    {

        int result[]=new int[array.length];
        for(int i=0;i< array.length;i++)
        {
            int sum=0;
            for(int j = 0; j< array[0].length; j++)
            {
              sum+=array[i][j];
            }
            result[i]=sum;

        }
return result;
    }
}
