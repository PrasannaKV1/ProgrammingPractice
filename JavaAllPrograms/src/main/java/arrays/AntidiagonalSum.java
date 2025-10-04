package arrays;

public class AntidiagonalSum {
    public static void main(String[] args) {
        // ond array declare madkoo
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};

        int sum=0;
        //nan ivaga antidigonal sum find madbeku
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[0].length; j++) {
              if(i+j== array.length-1)
              {
                  sum+=array[i][j];
              }
            }

        }

        System.out.println("The sum of anti-diagonal elements are "+sum);
    }
}
