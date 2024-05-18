public class Interface{
    public static void main(String args[]){

        // Queen q = new Queen();
        // q.moves();

        // MultiInheritance 

        // Bear br = new Bear();
        // br.eat();
        // br.grass();
        // br.meat();
        // br.live();

        // Student s1 = new Student();
        // s1.schoolName = "Kvs";

        // System.out.println(s1.schoolName);
        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        // Student s3 = new Student();
        // System.out.println(s3.schoolName);
         
        // Student s4 = new Student();
        // s4.schoolName = "Binnag";

        // System.out.println(s1.schoolName);
        // System.out.println(s2.schoolName);
        // System.out.println(s3.schoolName);
        // System.out.println(s4.schoolName);

        Horse h = new Horse();
        System.out.println(h.color);






    }
}

 class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor called");
    }
 }
 class Horse extends Animal{
    Horse(){
        super.color = "Black";
        System.out.println("Horse constructor called");
    }
 }

// Static keywords

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName (String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    static int returnPercentage(int phy, int chem, int math){
        return (math + phy + chem)/3;
    }
}












// multiInhertance
interface Herbivores{
    void eat();
    void grass();
}
interface Carnivores{
    void meat();
    void live();
}

class Bear implements Herbivores,Carnivores{
    public void eat(){
        System.out.println("Bears Eats");
    }
    public void grass(){
        System.out.println("Bears grass");
    }
    public void meat(){
        System.out.println("Bears Meat");
    }
    public void live(){
        System.out.println("Bears live");
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("UP ,DOWN , LEFT , RIGHT, DIAGONAL(IN ALL 4 DIRECTION)");
        
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("UP ,DOWN , LEFT , RIGHT");

    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("UP ,DOWN , LEFT , RIGHT, DIAGONAL (IN 1 STEPS)");

    }
}