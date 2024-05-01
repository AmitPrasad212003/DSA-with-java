
import java.util.*;
public class Shorest_path{

    public static float getShorestPath(String path){
        int x= 0 , y=0;
        for (int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                y++;
            }
            //East
            else{
                x++;
            }

        }
        int  x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String arg[]){

        String path = "WEENESENNN";

        System.out.println(getShorestPath(path));

    }
}