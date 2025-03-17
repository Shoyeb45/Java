package inheritance.example.association;

public class OneToOneSetter {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpId(0326);
        e.setEmpName("Anjali");
        e.setEmpAddr("Mandya");

        Account a = new Account();
        a.setAccNo(1212);
        a.setAccType("Savings");
        a.setAccName("Anjali");
        
        e.setacc(a);
        e.disp();
    }
}

// Target class
class Employee {
    private int empId;
    private String empName;
    private String empAddr;

    // Has a variable
    private Account acc;

    // Performing setter injection to inject values
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpAddr(String empAddr) {
        this.empAddr = empAddr;
    }

    public void setacc(Account acc) {
        this.acc = acc;
    }

    public void disp() {
        System.out.println("Employee Details");
        System.out.println("Employeed ID: " + empId);
        System.out.println("Employeed Name: " + empName);
        System.out.println("Employeed Address: " + empAddr);
        System.out.println("Account details:");
        System.out.println("Account Number: " + acc.getAccNo());
        System.out.println("Account Type: " + acc.getAccType());
    }
}

// Dependent class
class Account {
    private int accNo;
    private String accType;
    private String accName;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccType() {
        return accType;
    }

    public String getAccName() {
        return accName;
    }
}
