package OOPS;

class Base{
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I'm in base and setting x now");
        this.x = x;
    }
    public void printMe() {
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("I'm in Derived setting y");
        this.y = y;
    }
}
public class lec45_Inheritence {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d= new Derived();
        d.setY(43);
        System.out.println(d.getY());

        //using base condition from derived
        Derived c = new Derived();
        c.setX(7);
        System.out.println(c.getX());

        c.printMe();
    }
}
