package arrays;

public class SecondMax {
    public static void main(String[] args) {

        // Nan ond array declare madtini
        int array[]={1,2,3,4,5};
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        // nan ivaga for each loop use madtini
        for(int a :array)
        {
            if(a>first)
            {
                second=first;
                first=a;
            }
            else if(a>second && a!=first)
            {
                second=a;
            }
        }
        System.out.println(first+" "+second);
    }
}
