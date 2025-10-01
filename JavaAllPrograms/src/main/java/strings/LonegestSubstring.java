package strings;

public class LonegestSubstring {

    public static void main(String[] args) {
        String s="abc";
        int len=s.length();
        int total=len*(len+1)/2;
        //String[] str=new String[total];
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println(s.substring(i,j));

               // str[i]=s.substring(i,j);
            }
        }


    }
}
