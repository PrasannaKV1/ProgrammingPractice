package strings;

public class S1 {
    public static void main(String[] args) {
        String s1="I AM PRASANNA";
        String array[]=s1.split(" ");
        StringBuilder result=new StringBuilder();
        for(String a:array)
        {
            System.out.println(a);
        }
        for(String word:array)
        {
            StringBuilder sb=new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());


    }
}
