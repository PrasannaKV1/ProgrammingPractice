package strings;

public class FirstNonRrepatingCharcter {
    public static void main(String[] args) {
        String s ="Prasanna".toLowerCase();
        char ch[] =s.toCharArray();
        int frequency[] =new int[256];
        for(char a:ch)
        {
            frequency[a]++;
        }
        for (int i = 0; i < frequency.length ; i++) {

            if (frequency[i]==1)
            {
                System.out.println((char) (i)+"======"+frequency[i]);
                break;
            }
        }


    }
}





