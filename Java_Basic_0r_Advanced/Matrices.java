import java.util.*;
public class Matrices{

    public static boolean search(int matrix[][], int key){
         for(int i = 0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println(key + "is found at cell ( "+i + ","+j+" )");
                    return true;
                }
            }
        }
        System.out.println("Key not Found.");
        return false;
    }


    public static void main(String arg[]){
        int matrix[][] = new int [3][3];
        int n = matrix.length, m= matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrices elements : ");
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ") ;
            }
            System.out.println();
        }

    search(matrix, 5);

    }
}