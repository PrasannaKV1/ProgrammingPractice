package strings;

import java.util.HashMap;

public class FirstNonRepeatingCharcter34 {

    public static void main(String[] args) {
        String s="prasanna".toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);

        }
        System.out.println(map);

        for(char c: map.keySet())
        {
            if(map.get(c)==1)
            {
                System.out.println("First non-repeating character "+c);
                break;
            }
        }
    }
}
