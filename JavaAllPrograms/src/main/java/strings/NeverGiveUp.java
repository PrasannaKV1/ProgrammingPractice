package strings;

public class NeverGiveUp {

    public static void main(String[] args) {
        String s1="Prasanna pallagatte matad";

        String result=s1.replaceAll(" ","").toLowerCase();
        System.out.println(result);
        // nan ivaga en madtini andre adun reverse madtini

        StringBuilder sb=new StringBuilder(result);
        boolean res=result.equals(sb.reverse().toString());
        System.out.println(res);
    }
}
