package strings;

public class RemoveCharcters {
    public static void main(String[] args) {
        // now i'm gonna remove the special charcters from the string

        String s="WelcometoPrasanna@@$$$%%%%528".toLowerCase();
        char ch[] =s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]>='a' && ch[i]<='z')
            {
              ch[i]+=ch[i];
            }
            if(ch[i]>'0' &&ch[i]<'9')
            {
                ch[i]+=ch[i];
            }

        }
        System.out.println(ch.toString());
    }
}
