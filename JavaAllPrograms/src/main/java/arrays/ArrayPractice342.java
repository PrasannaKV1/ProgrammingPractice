package arrays;

import java.util.Scanner;

public class ArrayPractice342 {
    public static void main(String[] args) {
        int  array[]={-100,-200,-1,0,2,3,4,5,6};
        // now im gonna find the first maximum and secondmaxmium number this is the different way

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondmax=max;
        int secondmin=min;
        for(int a :array)
        {
            if(a>max)
            {
                secondmax=max;
                max=a;
            } else if (a>secondmax && a!=max) {
                {
                    secondmax=a;
                }

            }
        }

        System.out.println("The first maximum and second maximum element is " +max +"=="+secondmax);
    }
}
