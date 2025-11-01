package arrays;

public class ArraysPractice23 {
    public static void main(String[] args) {


        int array[] = {-1, 2, 3, 4, 5, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondmax = max;
        int secondmin = min;
        for (int a : array) {
            if(a>max)
            {
                max=a;
            }
            if(a<min)
            {
                min=a;
            }
        }

        System.out.println("The first maximum  number is "+max);
        System.out.println("The first mimimum number is "+min);

        for(int b:array)
        {
            if(b>secondmax && b!=max)
            {
                secondmax=b;
            }
            if(b<secondmin &&b!=min)
            {
                secondmin=b;
            }
        }
        System.out.println("The secondmax element is "+secondmax);
        System.out.println("The secondmin element is "+secondmin);
    }
}
