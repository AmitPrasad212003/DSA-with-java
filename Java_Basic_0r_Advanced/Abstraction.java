public class Abstraction{
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eats();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eats();
        // c.walk();

        // Animal a = new Animal(); Animal is abstract; cannot be instantiated

        Mustang myh = new Mustang();
        // Animal -> horse -> Mustang;


    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor called");
    }

    // Animal(){
    //     color = "brown";
    // }
    void eats(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
       color = "yellow red"  ;
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
     void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
