package strings;

public class Frequencyofeachcharacter55 {
    public static void main(String[] args) {
        String s="Vedanth guleholeyar matad".toLowerCase();
        String result=s.replaceAll(" ","").toLowerCase().toString();
        System.out.println(result);
        int frequency[]=new int[256];
        //IVAGA IROD NA CHAR ARRAY CONVERT MADU FIRST

        char ch[]=result.toCharArray();

        for(char c:ch)
        {
            frequency[c]++;
        }
        // this is the for loop to count occurance of each charcter
        for(int i=0;i< frequency.length;i++)
        {
            if(frequency[i]>=1) {
                System.out.println((char) (i) + "======" + frequency[i]);
            }
        }
        // one more for loop for after findig the first non-repeating charcter and return from the loop


        for(char a:ch)
        {
            if(frequency[a]==1)
            {
                System.out.println("The First Non Repeating charcter is "+a);
                return;
            }
        }



    }
}
