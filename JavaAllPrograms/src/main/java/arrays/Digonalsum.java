package arrays;

public class Digonalsum {
    public static void main(String[] args) {
        int array[][]={{2,3,4},{3,5,6},{9,8,1}};
        System.out.println("the sum of digonal elements "+ generate(array));


    }

    public static int generate(int array[][])
    {

        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                if(i==j)
                {
                    sum+=array[i][j];
                }

            }
        }
        return sum;
    }
}
