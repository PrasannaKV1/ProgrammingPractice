package strings;
import java.util.*;

public class LongestSubString {
    public static void main(String[] args){
        String s = "abcabcbb";
        int len = s.length();
        int maxLength = Integer.MIN_VALUE;
        String longest= "";
        for(int i=0;i<len;i++){
            Set<Character> hashString = new HashSet<>();
            StringBuilder temp = new StringBuilder();
            for(int j=i;j<len;j++){
                if(hashString.contains(s.charAt(j))){
                    break;
                }
                hashString.add(s.charAt(j));
                temp.append(s.charAt(j));
            }
            if(hashString.size()>maxLength){
                longest = temp.toString();
            }
            maxLength=Math.max(maxLength,hashString.size());

        }
        System.out.println("Max Lenght " + maxLength);
        System.out.println("longest string "+ longest);
    }
}
