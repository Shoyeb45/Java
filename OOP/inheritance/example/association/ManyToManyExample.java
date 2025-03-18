package inheritance.example.association;

public class ManyToManyExample {
    public static void main(String[] args) {
        Project prj1 = new Project(43, "gmail", "Andrew");
        Project prj2 = new Project(43, "chrome", "Pramod");
        Project prj3 = new Project(43, "safari", "Danish");

        Employee emp1 = new Employee(12, "Mitesh", prj1, prj2);
        Employee emp2 = new Employee(13, "Aditya", prj2, prj3);
        Employee emp3 = new Employee(14, "Karthikeya", prj1, prj2, prj3);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}

// Dependent class
class Project {
    private int pid;
    private String pname;
    private String pmgr;

    public Project(int pid, String pname, String pmgr) {
        this.pid = pid;
        this.pname = pname;
        this.pmgr = pmgr;
    }

    public int getPId() {
        return pid;
    }

    public String getPName() {
        return pname;
    }
    public String getPMgr() {
        return pmgr;
    }
}

// Target class
class Employee {
    private int empId;
    private String empName;
    
    // has a variable
    private Project[] projects;


    /**
     * 
     * @param empId
     * @param empName
     * @param projects -> varargs Parameter for variable number of projects
     */
    public Employee(int empId, String empName, Project...projects) {
        this.empId = empId;
        this.empName = empName;
        this.projects = projects;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Emp Id : " + empId);
        System.out.println("Emp Name : " + empName);
        
        System.out.println("Projects Detail:");

        for (Project project: projects) {
            System.out.println("Project Id: " + project.getPId());
            System.out.println("Project Name: " + project.getPName());
            System.out.println("Project Manager: " + project.getPMgr());
        }
    }
}