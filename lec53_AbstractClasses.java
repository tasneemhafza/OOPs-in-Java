package OOPS;

abstract class Parent2{  //whole class is abstract..cannot make obj of these
    public Parent2(){ //constructor
        System.out.println("I'm Parent2 constructor.");
    }
    public void sayHello(){ //simple method
        System.out.println("Hello");
    }
    abstract public void greet();  //abstract method
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){  // abstract greet() is used
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am Tasneem");
    }
}


public class lec53_AbstractClasses {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error becuz obj of an abstract class
        //Child3 c3 = new Child3(); -- error same reason
        Child2 c = new Child2(); //concrete class that uses abstract methods
        c.greet2(); //but throws error when used inside sout
        

    }
}