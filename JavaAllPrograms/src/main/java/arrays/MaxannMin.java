package arrays;

public class MaxannMin {

    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int evensum=0;
        for(int a:array)
        {
            if(a%2==0)

            {
                evensum+=a;
            }
        }
        System.out.println(evensum);
    }
}
