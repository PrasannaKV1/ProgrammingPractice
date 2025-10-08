package numbersystem;

import java.util.Scanner;

public class GCDoftwoNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // now nan en madta idini andre two user input tagotini
        System.out.println("Please enter the first number ");
        int A=sc.nextInt();
        System.out.println("please enter the second number");
        int B= sc.nextInt();

        System.out.println("So the GCD of two numbers are "+gcd(A,B));




    }
    public static int gcd(int A,int B)
    {
        int max=0,result=0;
        if(A>B)
        {
            max=A;
        }
        else {
            max=B;
        }

        for(int i=max;i>=1;i--)
        {
            if((A%i)==0 && (B%i)==0)
            {
                result=i;
                break;
            }
        }
        return result;
    }



}
