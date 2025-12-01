package strings;

public class OneMoreTime {
    public static void main(String[] args) {
        String q1="I AM PRASANNA";
        String array[] = q1.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:array)
        {
            StringBuilder sb=new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
