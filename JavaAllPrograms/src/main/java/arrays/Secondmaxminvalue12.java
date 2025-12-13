package arrays;

public class Secondmaxminvalue12 {
    public static void main(String[] args) {
        int array[]={12,34,45,-1,-2,3,4,5};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondmax=max;
        int secondmin=min;
        for(int a:array)
        {
            if(a>max)
            {
                secondmax=max;
                max=a;

            }
            else if(a>secondmax && a!=max)
            {
                secondmax=a;
            }
        }
        for(int b:array)
        {
            if(b<min)
            {
                secondmin=min;
                min=b;
            }
            else if(b<secondmin && b!=min)
            {
                secondmin=b;
            }
        }
        System.out.println("The second maximum number is "+secondmax);
        System.out.println("The second minimum number is "+secondmin);

    }
}
