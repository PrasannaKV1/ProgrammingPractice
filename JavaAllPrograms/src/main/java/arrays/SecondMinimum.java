package arrays;

public class SecondMinimum {

    public static void main(String[] args) {

        // first array na declare madkondini
        int array[] ={-1,1,2,4,5,6};
        int firstm=Integer.MAX_VALUE,secondm=Integer.MAX_VALUE;
        for(int b:array)
        {
            if(b<firstm)
            {
                secondm=firstm;
                firstm=b;
            }
            else if (b<secondm && b!=firstm)
            {
                secondm=b;

            }
        }
        System.out.println("The first minimum value is "+firstm);
        System.out.println("the second minimum value is "+secondm);

    }
}
