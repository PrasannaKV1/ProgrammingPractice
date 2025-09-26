package strings;

public class ReplaceParticularCharcter {

    public static void main(String[] args) {
        String s = "prasanna";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a')
            {
                ch[i]='@';
            }
        }
        System.out.println(ch);

    }
}
