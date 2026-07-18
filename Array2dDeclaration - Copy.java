import java.util.Arrays;
public class Array2dDeclaration {
    public static void main(String[] args) {
        
        int[][] array1={ 
                     {1,2},
                      {2,3}
    };

      /*    System.out.println(array1[0][0]);
        System.out.println(array1[0][1]);
           System.out.println(array1[1][1]);

            for (int[] row : array1) {
    for (int value : row) {
        System.out.print(value + " ");

    }
}
*/

System.out.println(Arrays.deepToString(array1));
    }}