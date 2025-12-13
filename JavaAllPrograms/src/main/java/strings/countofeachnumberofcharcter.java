package strings;

public class countofeachnumberofcharcter {
    public static void main(String[] args) {

        String s ="prasanna".toLowerCase();
        //nan ivaga ee string na char array convert madtini api

        char ch[]=s.toCharArray();
        // next en andru ondu madu paaa

        int freq[]=new int[256];
        for(char c:ch)
        {
            freq[c]++;
        }

        for(int i=0;i<= freq.length;i++)
        {
            if(freq[i]>=1)
            {
                System.out.println((char)i+""+freq[i]);
            }

        }

    }
}
