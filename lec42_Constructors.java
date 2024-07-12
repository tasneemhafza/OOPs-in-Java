package OOPS;
class MyMainEmployee{
    private int id;  //lec 41 example
    private String name;

    public MyMainEmployee(){  //A constructor becuz for how many times you can do setid getid set this get that
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){ //Constructor overloading, if two input with same datatypes then this will execute
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){ //same here and remember with same name as class
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class lec42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);  //created + constructor
        //MyMainEmployee harry = new MyMainEmployee(); //only created
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
