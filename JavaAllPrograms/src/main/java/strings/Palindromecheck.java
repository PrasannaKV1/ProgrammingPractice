package strings;
public class Palindromecheck {
    public static void main(String[] args)
    {

        //first method
        String s="prasanna";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }

        boolean result=s.equals(rev);

         System.out.println(result);


         //second method

        String s1="MAM";
        StringBuilder sb =new StringBuilder(s1);
        boolean result1=s1.equals(sb.reverse().toString());
        System.out.println(result1);
    }

}
