package inheritance.example.association;

public class ManyToOneEx {
    public static void main(String[] args) {
        // Dependent object
        Branch br = new Branch(12, "SKLM");

        // target object
        Employee emp1 = new Employee(18, "Sachin", br);
        Employee emp2 = new Employee(24, "Virat", br);
        Employee emp3 = new Employee(42, "Zabi", br); 
        
        emp1.disp();
        emp2.disp();
        emp3.disp();
    }
}

// Dependent class
class Branch {
    public int bId;
    public String bLoc;

    public Branch(int bId, String bLoc) {
        this.bId = bId;
        this.bLoc = bLoc;
    }

    public int getBId() {
        return bId;
    } 

    public String getBLoc() {
        return bLoc;
    } 
}


// Target class
class Employee {
    private int empId;
    private String empName;

    // has-a variable
    private Branch branch;

    
    // Performing constructor injection
    public Employee(int empId, String empName, Branch branch) {
        this.empId = empId;
        this.empName = empName;
        this.branch = branch;
        
    }
    public void disp() {
        System.out.println("Employee Details");
        System.out.println("Employeed ID: " + empId);
        System.out.println("Employeed Name: " + empName);
        
        System.out.println("Branch Details");
        System.out.println("Branch Id: " + branch.getBId());
        System.out.println("Branch Loc: " + branch.getBLoc());
    }
}