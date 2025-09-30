package strings;

public class ReplaceCapstoSmall {
    public static void main(String[] args) {
        String s="Prasanna";
        // character array ge convert madta idini
        char ch[]=s.toCharArray();

        for (int i = 0; i < ch.length ; i++) {
           if(ch[i]>='A' && ch[i]<='Z')
           {
               ch[i]= (char) (ch[i]+32);
           }
           else {
               ch[i]= (char) (ch[i]-32);
           }
        }

        System.out.println(ch);
    }




}
