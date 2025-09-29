package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AllinONE {
    public static void main(String[] args) {

        //Program 1
        String s="prasanna";
        StringBuilder sb =new StringBuilder(s);
        sb.reverse().toString();
        System.out.println(sb);

        //check isit palindrome or not

        String t="mam".toLowerCase();
        boolean result=t.equals(new StringBuilder(t).reverse().toString());
        System.out.println(result);

        // two check anagrams

        String s2="prasanna".toLowerCase();
        String s3="annasarp".toLowerCase();
        char ch1[]=s2.toCharArray();
        char ch2[]=s3.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean res=Arrays.equals(ch1,ch2);
            System.out.println(res);
            //remove duplicates string
        String k="pooja";
        System.out.println(removed(k));


        //findout string is number

        String n="123456";
        boolean istrue=n.matches("\\d+");
        System.out.println(istrue);



    }

    public static String removed(String k)
    {
        StringBuilder sb =new StringBuilder();
        char ch[]=k.toCharArray();
        boolean seen[]=new boolean[256];
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
