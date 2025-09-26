package strings;

public class removeduplicte {

    public static void main(String[] args)
    {
        String s="prasanna";
        System.out.println(removed(s));
    }
    static public String removed(String s)
    {
        char ch[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        boolean seen[]=new boolean[256];
        for(char a:ch)
        {
            if(!seen[a])
            {
                sb.append(a);
                seen[a]=true;
            }
        }
        return sb.toString();
    }
}
