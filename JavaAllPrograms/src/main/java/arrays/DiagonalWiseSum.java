package arrays;

public class DiagonalWiseSum{

    public static void main(String[] args) {
        int array[][]={{2,3,4},{5,6,7},{5,1,3}};

        //now i wanna print

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(i==j)
                {
                    System.out.println(array[i][j]);
                }

            }

        }



    }



}
