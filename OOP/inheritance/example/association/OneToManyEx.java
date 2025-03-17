package inheritance.example.association;


public class OneToManyEx {
    public static void main(String[] args) {
        
        // Creating dependent objects
        Employee emp1 = new Employee(18, "Sachin");
        Employee emp2 = new Employee(24, "Virat");
        Employee emp3 = new Employee(42, "Zabi");

        // Creating an array to perform one-to-many association
        Employee[] e = new Employee[3];
        e[0] = emp1;
        e[1] = emp2;
        e[2] = emp3;

        // Target object using constructor injection
        Department dept = new Department(143, "BCCI", "Dubai", e);
        dept.disp();
    }
}

// Dependent class
class Employee {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

// Target Class
class Department {
    private int deptId;
    private String deptName;
    private String deptLoc;

    // has-a variable
    Employee[] employees;

    // Performing constructor injection
    public Department(int deptId, String deptName, String deptLoc, Employee[] employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptLoc = deptLoc;
        this.employees = employees;
    }

    public void disp() {
        System.out.println("Department Details");
        System.out.println(deptId);
        System.out.println(deptName);
        System.out.println(deptLoc);
        
        System.out.println("Employee Details");

        for (Employee emp: employees) {
            System.out.println(emp.getEmpId());
            System.out.println(emp.getEmpName());
        }
    }
}

