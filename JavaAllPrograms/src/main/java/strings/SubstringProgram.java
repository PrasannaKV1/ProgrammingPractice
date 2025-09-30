package strings;

public class SubstringProgram {
    public static void main(String[] args) {
        String input="abc".toLowerCase();

        // now i'm gonna find the all the substrings

        // the formula to find out all the substrings
        // total=(n*(n+1)/2);

        for(int i=0;i<input.length();i++)
        {
            for (int j=i+1;j<=input.length();j++)
            {
                System.out.println(input.substring(i,j));
            }
        }

    }
}
