package arrays;

public class ColumnWiseSUM {

    public static void main(String[] args) {
        int array [][]={{2,3,4},{5,6,7}};
        // now i wann do column_wise sum
        int answer[] =columnwisesum(array);
        for(int a: answer)
        {
            System.out.println(a);
        }


    }

    public static int[]  columnwisesum(int array[][])
    {
        int col =array[0].length;
        int result[] =new int[col];

        int row= array.length;
        //for loop for column
        for (int i = 0; i <col ; i++) {
            int sum=0;
            //for loop for the row
            for (int j = 0; j < row; j++) {
                sum+=array[j][i];
            }
            result[i]=sum;
        }
        return result;
    }
}
