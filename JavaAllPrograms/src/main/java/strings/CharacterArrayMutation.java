package strings;

import java.util.Scanner;

public class CharacterArrayMutation {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number based on your wish");
        int num =sc.nextInt();
        char ch[] =new char[num];

        for(int i=0;i<=num;i++)
        {
            ch[i]=sc.next().charAt(i);
        }
        for(char c:ch)
        {
            System.out.println(c);
        }


    }


}
