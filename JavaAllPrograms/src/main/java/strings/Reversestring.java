package strings;

public class Reversestring {
    public static void main(String[] args)
    {
        // the first method of reversing the string
        String s ="Prasanna".toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        System.out.println(rev);


        //second method to reverse the string
        String s1="pooja";
        StringBuilder sb =new StringBuilder(s1);
        sb.reverse().toString();
        System.out.println(sb);
    }


}
