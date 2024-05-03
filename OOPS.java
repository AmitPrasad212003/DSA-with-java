public class OOPS{
    public static void main(String args[]){

        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // // p1.setColor("yellow");
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());


        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Kundan";
        // // myAcc.password = "2312#23";
        // myAcc.setPassord("23242@42");




    //  constructors 

    // Student1 s1 = new Student1("Amit");

    // System.out.println(s1.name);
    // Student1 s1 = new Student1();
    // Student1 s2 = new Student1("Amit prasad");
    // Student1 s3 = new Student1(123);
    // Student1 s4 = new Student1("aman",123); not execute no constructor is these type

    // Student1 s1 = new Student1();
    // s1.name = "Amit";
    // s1.roll =17342;
    // s1.password = "xyzwd";
    // s1.marks[0] = 100;
    // s1.marks[1] = 90;
    // s1.marks[2] = 80;

    // Student1 s2 = new Student1(s1);
    // s2.password = "Adwoed";

    // s1.marks[2] = 100;

    // for(int i=0; i<3; i++){
    //     System.out.println(s2.marks[i]);
    // }

// inheritance;

    // Fish sharks = new Fish();
    // sharks.eat();

    // Dog dobby = new Dog();
    // dobby.eat();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);

    // method overloading 

    // Calculator calc = new Calculator();
    // System.out.println(calc.sum(1,3));
    // System.out.println(calc.sum((float)1.5,(float)3.4));
    // System.out.println(calc.sum(1,3,6));

    Deer d = new Deer();
    d.eat();

    Animal a = new Animal();
    a.eat();


    }
}

// method Overriding;
class Animal{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}


// Method Overloading 

class Calculator {

    int sum(int a , int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c ) {
        return a+b+c;
    }

}



class Student1{
    String name;
    int roll;
    String password;
    int marks[];

    Student1(int roll){
        this.roll = roll;
        marks = new int[3];


    }
    // parameterized constructors.
    Student1(String name){
        marks = new int[3];
        this.name = name;
    }
    // non-parameterized constructors.
    Student1(){
        marks = new int[3];
        System.out.println("Construtor is called...");

    }
    // shallow copy constructor
    // Student1(Student1 s1){
    //      marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor

    Student1(Student1 s1){
         marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }



}

class BankAccount{
    public String username;
    private String password;

    public void setPassord(String pwd){
        password = pwd;
    }
}







class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor (String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
       this.tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}


// inheritance

// Base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }
//     void breathe(){
//         System.out.println("Breathes");
//     }
// }

// Derived class // subclass 

// class Fish extends Animal{

//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

// multi - level inheritance

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String bread;
// }

// Hierarchial Inheritance

// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("swim");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }

