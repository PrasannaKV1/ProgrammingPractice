package strings;

public class FirstNonRepeatingCharcter {
    public static void main(String[] args) {
        String s="prasanna";
        // now i wanna find first non repeating charcter

    System.out.println(nonrepeating(s));
    }
    public static char nonrepeating(String s)
    {
        int freq[]=new int[256];
        for(char a:s.toCharArray())
        {
            freq[a]++;
        }
        for(char a:s.toCharArray())
        {
            if(freq[a]==1)
            {
                return a;
            }
        }
        return '\0';

    }
}
