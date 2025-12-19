package strings;

public class Longestword {
    public static void main(String[] args) {
        String s="I LOVE AUTOMATION TESTING";
        String words[]=s.split(" ");
        String length="";
        for(String w:words)
        {
            if(w.length()>length.length())
            {
                length=w;
            }
        }
        System.out.println("The longest word in the string is "+length);
    }
}
