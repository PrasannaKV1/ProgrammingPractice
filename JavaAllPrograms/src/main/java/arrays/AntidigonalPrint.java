package arrays;

public class AntidigonalPrint {

    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        int length= array.length;

        // now im gonna find the antidiagonal elements

        for(int i=0;i< array.length;i++)
        {
            for (int j = 0; j <array[0].length ; j++) {
                if(i+j== array.length-1)
                {
                    System.out.println(array[i][j]);
                }

            }

        }
    }
}
