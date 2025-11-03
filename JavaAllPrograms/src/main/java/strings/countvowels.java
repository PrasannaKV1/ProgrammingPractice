package strings;

public class countvowels {

    public static void main(String[] args) {
        String s1="Prasanna Pallagatte Matad".toLowerCase();
        int count=0;
        for(char c:s1.toCharArray())
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:break;
            }
        }
        System.out.println("The number of vowels in the string "+count);
    }
}
