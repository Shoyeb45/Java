package inheritance.example.association;

public class OneToOneConstructor {
    public static void main(String[] args) {
        Account acc = new Account(1, null, null);
    }
}

class Employee {
    private int empId;
    private String empName;
    private String empAddr;
    private Account acc;

    public Employee(int empId, String empName, String empAddr, Account acc) {
        this.empId = empId;
        this.empName = empName;
        this.empAddr = empAddr;
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

class Account {
    private int accNo;
    private String accType;
    private String accName;

    public Account(int accNo, String accType, String accName) {
        this.accNo = accNo;
        this.accType = accType;
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
