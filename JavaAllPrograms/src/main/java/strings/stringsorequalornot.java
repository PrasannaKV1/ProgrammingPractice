package strings;

public class stringsorequalornot {

    public static void main(String[] args) {
        String s1="java".toLowerCase();
        String s2="java".toLowerCase();
        boolean equal=true;
        if(s1.length()!=s2.length())
        {
            equal=false;
        }
        else
        {

            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    equal=false;
                    break;
                }
            }

        }
        System.out.println(equal);


    }
}
