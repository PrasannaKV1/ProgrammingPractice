package strings;

public class firstnonrepeatingcharc12 {
    public static void main(String[] args) {
        String s1="Prasanna".toLowerCase();
        // now i wanna find first non-repeating charcter in a given string

        int freq[]=new int[256];
        char ch[]=s1.toCharArray();
        for(char c :ch) {
            freq[c]++;
        }
        for(char a:ch)
        {
            if(freq[a]==1)
            {
                System.out.println(a);
                break;
            }
        }



    }
}
