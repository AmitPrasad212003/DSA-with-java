import java.util.*;
public class pt6{
    public static void main(String arg[]){

        //question 1. Print the number of 7’s that are inthe 2d array;

        // int array[][] = {{4,7,8},{8,8,7}};

        // int count = 0;
        // for(int i =0; i<array.length; i++){
        //     for(int j = 0; j<array[0].length; j++){
        //         if(array[i][j] == 7){
        //             count++;
        //         }
        //     }
        // }

        // System.out.println("Count of 7 is : "+ count);

    //     //Question 2. Print out the sum of the numbers inthe second row of the “nums” array;

    //     int  nums [][]= { {1,4,9},
    //                   {11,4,3},
    //                   {2,2,3} };
    //     int sum = 0 ;
        
    //     // sum of 2nd row elements;

    //     for(int j=0; j< nums[0].length; j++){
    //         sum += nums[1][j];
    //     }

    //     System.out.println("Sum is : "+ sum);

    // Question 3. Write a program to FindTransposeofa Matrix
    // Transpose of a matrix is the process ofswapping the rows to columns

    int row =2, column =3;
    int matrix[][] = {{2,3,7},{5,6,9}};

    // Display original matrix

    printMatrix(matrix);

    //Transpose the matrix

    int transpose[][]= new int [column][row];

    for(int i =0; i<row; i++){
        for(int j = 0; j<column; j++){
            transpose[j][i] = matrix[i][j];
        }
    }
     printMatrix(transpose);


    }


    public static void printMatrix(int matrix[][]){

        System.out.println("The matrix is : ");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
    }
    }
}
