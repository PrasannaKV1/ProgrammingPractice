package strings;

import java.util.Arrays;

public class anagramcheckone {
    public static void main(String[] args) {
        String s1="prasanna".toLowerCase();
        String s2="annasarp".toLowerCase();
        //now im checking
        char ch1[] =s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("yes both are anagrams");
        }
        else
        {
            System.out.println("Not anagarams");
        }

    }
}
