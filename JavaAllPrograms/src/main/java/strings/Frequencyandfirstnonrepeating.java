package strings;

public class Frequencyandfirstnonrepeating {
    public static void main(String[] args) {
        String s = "PrasannaPallagatteMatd".toLowerCase();
        // String result =s.trim().replaceAll(" ","").toLowerCase();
        //convert this string to char array

        char ch[] = s.toCharArray();
        int frequency[] = new int[256];
        for(char a:ch)
        {
            frequency[a]++;

        }

        for (int i = 0; i < frequency.length; i++) {
                  if(frequency[i]>=1)
                  {
                      System.out.println((char)i+"===="+frequency[i]);
                  }
        }

        //now im find the first-repeating charcter
        for (char k:ch)
        {
            if(frequency[k]==1)
            {
                System.out.println(k);
                return;
            }
        }
    }
}
