package strings;

public class CheckWhetherPalindromeornot {
    public static void main(String[] args) {
        String s="a man a plan a canal panama";
        String result=s.replaceAll(" ","").toLowerCase();
        System.out.println(result);

        StringBuilder sb =new StringBuilder(result);
        boolean answer =sb.reverse().toString().equals(result);
        System.out.println(answer);


    }
}
