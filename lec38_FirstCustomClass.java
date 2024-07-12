package OOPS;

class Employee{
    int id, salary;
    String name;
    //Adding method
    public void printDetails() {
        System.out.println("My name is "+ name);  //if static void then name gives error
        System.out.println("My ID is " + id);
    }

    public int getSalary() {
        return salary;
    }
    
}

public class lec38_FirstCustomClass {
    
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        System.out.println();
        Employee tasneem = new Employee();  // Instantiating a new Employee Object
        Employee BTS = new Employee();

        // Setting Attributes for tasneem
        tasneem.id = 12;
        tasneem.name = "Tasneem";
        tasneem.salary = 45000;

        // Setting Attributes for BTS
        BTS.id = 7;
        BTS.name = "BTS";
        BTS.salary = 70000;

        // Printing the Attributes
        System.out.println("The name is " +tasneem.name);
        System.out.println("The id is "+BTS.id);
        System.out.println();

        //Printing the same when done with printDetails
        tasneem.printDetails();  // prints both the details as its there in the method
        System.out.println();
        BTS.printDetails();
        System.out.println();
        int salary = tasneem.getSalary();
        System.out.println("The salary is " +salary);

    }
}
