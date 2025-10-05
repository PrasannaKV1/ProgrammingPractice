package arrays;

public class TransposeofMatrix {
    public static void main(String[] args) {


        // now i'm gonna fin the transpose of matrix


        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int rows = array.length;
        int cols = array[0].length;

        int transpose[][] = new int[cols][rows];
        //now I will transpose and store the values

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
                transpose[j][i]=array[i][j];
            }
        }

        // now after transposing will be fetching the values
        for (int k = 0; k < transpose.length ; k++) {
            for (int l = 0; l < transpose[0].length; l++) {
                System.out.print(transpose[k][l]);
            }
            System.out.println();

        }
    }


}
