package strings;

public class PrintAllphabets {

    public static void main(String[] args) {
        //now i will generate all the alphabets
         int count=0;
        for(char i='A';i<='Z';i++)
        {
            System.out.println(i);
            count++;
        }
        System.out.println("the total number of letters from A to Z is "+count);
    }
}
