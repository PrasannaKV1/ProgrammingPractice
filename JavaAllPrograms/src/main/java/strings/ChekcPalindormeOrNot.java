package strings;

import java.util.Scanner;

public class ChekcPalindormeOrNot {
    public static void main(String[] args) {
        String s="A man, a plan, a canal, Panama!";
        String original=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(original);
        boolean result=original.equals(sb.reverse().toString());
        System.out.println(s);
        System.out.println(original);
        System.out.println(result);
    }
}
