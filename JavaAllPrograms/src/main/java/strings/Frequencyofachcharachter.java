package strings;

import java.util.Scanner;

public class Frequencyofachcharachter {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the string based on ypur wish");
        String s=sc.nextLine();
        int freq[]=new int[256];
        char ch[]=s.toCharArray();
        for(char b:ch)
        {
           freq[b]++;
        }
        for(int i=0;i< freq.length;i++)
        {
            if(freq[i]>1)
            {
                System.out.println((char)i+" ============ "+freq[i]);
            }
        }






    }
}
