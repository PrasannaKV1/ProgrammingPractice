package strings;

public class CharacterCount {

    public static void main(String[] args) {
        String s="Prasanna".toLowerCase();

        System.out.println(vcount(s));



    }

    public static int vcount(String s)
    {
        //convert string to character array
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i< ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        return -1;
    }
}
