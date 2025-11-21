package arrays;

import java.util.Scanner;

public class HCFOFTWONUMBERS {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the two number based on your wish ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int max=0;
        if(A>B)
        {
            max=A;
        }
        else {
            max=B;
        }

        System.out.println(max);

    }
}
