package arrays;

public class ArraySecondmaxandminimumnumber {
    public static void main(String[] args) {

        int array[] ={1,2,-1,-2,3,5,6};
        int max=Integer.MIN_VALUE;
        int secondmax=max;
        for(int a:array)
        {
            if(a>max)
            {
                secondmax=max;
                max=a;
            } else if (a>secondmax && a!=max) {
                 secondmax=a;
            }
        }
        System.out.println(secondmax);
    }
}
