package numbersystem;

import java.util.Scanner;

public class reversenumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N");
        int N=sc.nextInt();
        int orig=N;
        int rev=0;

        while(N!=0)
        {
            int digit=N%10;
            rev=rev*10+digit;
            N=N/10;
        }
        System.out.println("the reversed number is "+rev);

        if(rev==orig)
        {
            System.out.println("Is it's palindrome");
        }
        else {
            System.out.println("it's not a palindrome");
        }
    }


}
