package strings;

import java.util.Arrays;

public class AncheckYaar {

    public static void main(String[] args) {
        String s1="PRASANNA".toLowerCase();
        String s2="annasarp".toLowerCase();
        // two strings na char array agi convert madtini


        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("Yes it's Anagram");
        }
        else {
            System.out.println("its not anaggram");
        }


    }
}
