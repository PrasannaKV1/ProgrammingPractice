package strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args )
    {

        // Now Im checking the two strings
        String s1="Prasanna".toLowerCase();
        String s2="AnnasarP".toLowerCase();

        //Now convert the sttrings into arrays
        char ch1[] =s1.toCharArray();
        char ch2[]=s2.toCharArray();

        // after converting to arrays just sort the arrays using inbuilt functions

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result=Arrays.equals(ch1,ch2);
        System.out.println(result);




    }
}
