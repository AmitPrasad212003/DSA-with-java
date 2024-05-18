import java.util.*;
public class pattern{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 

    // for (int line = 1; line<=10 ; line++ ){
    //     for(int star=1; star<= line; star++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }

//  *  *  *  * 
//  *  *  * 
//  *  * 
//  * 
    // int n=4;

    //  for (int i = 1; i<=n ; i++ ){
    //     for(int star=1; star<= (n-i+1); star++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println(); 
    // }


//  1 
//  1  2
//  1  2  3
//  1  2  3  4

//  int n = 4;
// for(int line = 1; line <= n; line ++){
//     // number print
//     for(int number =1 ; number <= line; number ++)
//     {
//         System.out.print(" "+ number + " ");
//     }
//     System.out.println();
// }

int n= 4;
char ch = 'A';

for(int line =1 ; line<= n; line++){
    for(int chars =1 ; chars <= line; chars++){
        System.out.print(" "+ch+ " ");
        ch++;
    }
    System.out.println();
}

    }
}