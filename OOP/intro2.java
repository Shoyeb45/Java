class Student {
    String name;
    int age;

    // Method to print info
    public void printInfo() {
        StringBuilder output = new StringBuilder("The name of student is ").append(this.name).append(" and age is ").append(this.age);
        System.out.println(output);
    }
}
public class intro2 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Shoyeb";
        std1.age = 19;
        std1.printInfo();
    }
}
