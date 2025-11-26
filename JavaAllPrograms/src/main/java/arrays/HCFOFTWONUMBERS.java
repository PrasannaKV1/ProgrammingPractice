package arrays;

import java.util.Scanner;

public class HCFOFTWONUMBERS {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the two number based on your wish ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int max=0;
        int HCFORGCD=0;
        if(A>B)
        {
            max=A;
        }
        else {
            max=B;
        }

        System.out.println(max);

        for (int i = max; i>=1 ; i--) {
            if(A%i==0 && B%i==0)
            {
                HCFORGCD=i;
                break;
            }
        }
        System.out.println(HCFORGCD);

    }
}
