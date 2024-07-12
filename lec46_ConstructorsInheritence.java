package OOPS; 

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

//This and super keyword
class EkClass{ 
    int a; 
    public int getA() { 
    return a; 
    } 
    EkClass(int a){ 
    this.a = a;
     } 
    public int returnone(){
     return 1; 
    } 
    } 
    class DoClass extends EkClass{ DoClass(int c){ super(c); 
    System.out.println("I am a constructor"); } 
    } 
    

public class lec46_ConstructorsInheritence {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 v = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        //ChildOfDerived xyz = new ChildOfDerived(12, 13, 15);

        //This and super keyword
        EkClass e = new EkClass(65); 
DoClass d = new DoClass(5); 
System.out.println(e.getA()); 
System.out.println(d.getA());
    }
}
