import java.util.*;
public class pattern2{

// Hollow Rectangle pattern 

     public static void hollow_rectangle(int totRows , int totCols){
        // outer loop 
        for(int i=1; i<= totRows ; i++){
            // inner loop
            for(int j=1; j <= totCols; j++){
                if(i==1 || i == totRows || j == 1 || j == totCols){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        
        }
     }

public static void inverted_rotated_half_pyramid(int n){
    for(int i=1; i<= n; i++){
        //space
        for(int j= 1;j<=n-i; j++){
            System.out.print("   ");
        }
        //star
        for(int j= 1;j<=i; j++){
            System.out.print(" * ");
        }
        System.out.println();

    }

}

public static void inverted_half_pyramid_withNumber(int n){
    for(int i=1; i<=n ; i++){
        for(int j=1; j<= n-i+1; j++){
            System.out.print(" "+ j + " ");
        }
        System.out.println();
    }
}
public static void floydsTriangle(int n){
    int count = 1;
    for(int i=1; i<=n ; i++){
        for(int j=1; j<= i; j++){
            System.out.print(" "+ count + " ");
            count += 1;
        }
        System.out.println();
    }
}
public static void Zero_One_Triangle(int n){
    for(int i=1; i<=n ; i++){
        for(int j=1; j<= i; j++){
            if((i+j) % 2 == 0){
                System.out.print(" 1 ");
            }
            else{
                System.out.print(" 0 ");
            }
        }
        System.out.println();
    }
}


public static void ButterFly(int n) {
    //1st half
    for(int i=1; i<= n; i++){
        // Stars - i
        for(int j=1; j<= i; j++){
           System.out.print(" * ");
        }

        // Space = 2*(n-i)

        for(int j=1 ; j<= 2*(n-i); j++){
            System.out.print("   ");
        }

        // stars - i
         for(int j=1; j<= i; j++){
           System.out.print(" * ");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n; i >= 1; i--){
        // Stars - i
        for(int j=1; j<= i; j++){
           System.out.print(" * ");
        }

        // Space = 2*(n-i)

        for(int j=1 ; j<= 2*(n-i); j++){
            System.out.print("   ");
        }

        // stars - 1
         for(int j=1; j<= i; j++){
           System.out.print(" * ");
        }
        System.out.println();
    }

}


public static void solid_rhombus(int n){
    for(int i=1; i<=n; i++){
        //space
        for(int j =1; j<= (n-i); j++){
            System.out.print("   ");
        }
        for(int j =1; j<= n; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}


public static void Hollow_Rhombus(int n){
    for(int i=1; i<= n ; i++){
        //space
        for(int j=1; j<= (n-i); j++){
            System.out.print("   ");
        }
        //hollow rectangle
        
            for(int j=1; j <= n; j++){
                if(i==1 || i == n || j == 1 || j == n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        
        

    }
}

public static void Diamond(int n){
    // 1st half
    for(int i=1; i<=n; i++){
        //space
        for(int j=1; j<=(n-i); j++){
            System.out.print("   ");
        }
        //star
        for(int j=1; j<= (2*i)-1; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n; i>=1; i--){
        //space
        for(int j=1; j<=(n-i); j++){
            System.out.print("   ");
        }
        //star
        for(int j=1; j<= (2*i)-1; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

}

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

// Hollow Rectangle pattern 
    // hollow_rectangle(5,5);

    // inverted_rotated_half_pyramid(5);
    // inverted_half_pyramid_withNumber(5);
    // floydsTriangle(5);

    // Zero_One_Triangle(5);

    // ButterFly(7);

    // solid_rhombus(7); 
    // Hollow_Rhombus(6);
    Diamond(7);

    }
}