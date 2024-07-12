package OOPS;
class MyEmployee{
    private int id;  //cannot access with harry.name = "CWH"; 
    private String name;  //public, private, default are access Modifiers

    public String getName(){  //thats why taking getter to print setname
        return name;
    }
    public void setName(String n){  //creating setter to take name 
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class lec40_GetterSetter {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");  //setting the name
        System.out.println(harry.getName());  //printing the name
        harry.setId(234);
        System.out.println(harry.getId());
    }    
}
