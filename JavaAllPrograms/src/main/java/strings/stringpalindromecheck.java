package strings;

public class stringpalindromecheck {
    public static void main(String[] args) {
        String s1="A man, a plan, a canal: Panama";
        String modified = s1.trim().replaceAll("[^a-zA-Z]","").toLowerCase();
        System.out.println(modified);
        StringBuilder sb=new StringBuilder(modified);
        boolean result=modified.equals(sb.reverse().toString());
        System.out.println("the two string are palindrome ? : "+ result);
    }
}
