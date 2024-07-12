package OOPS;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
    //whichever class implements bicycle has two compulsory use these two methods to avoid errors
}

interface HornBicycle{
    public int x = 45; //45 is fixed
    void blowHornK3g(); //its okay not to use public as its default 
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{ //notice its implements not extends
    //public int x = 5; -->error as 45 was fixed in x
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum:");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa :");
    }
}

public class lec54_Interface {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(Bicycle.a);
        System.out.println(HornBicycle.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
