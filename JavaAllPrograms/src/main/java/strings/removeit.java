package strings;

import java.util.Scanner;

public class removeit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string based on your wish");
        String res=sc.nextLine();

        // now i'm printing the value after removing the duplicate characters

        System.out.println("The value of string after removing the duplicate charcters  "+result(res));


    }
    public static String result(String s)
    {
        // first en madtini andre string na char arry ge convert madtini

        char ch[]=s.toCharArray();
        StringBuilder sb =new StringBuilder();
        boolean seen[] =new boolean[256];
        for(char a:ch)
        {
            if(!seen[a])
            {
                sb.append(a);
                seen[a]=true;
            }
        }
        return sb.toString();
    }
}
