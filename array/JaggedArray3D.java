package array;

import java.util.*;

public class JaggedArray3D {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter the number of schools:");
        int school = sc.nextInt();
        System.out.println("Enter the number of classroom:");
        int classroom = sc.nextInt();
        System.out.println("Enter the number of students:");
        int stud = sc.nextInt();

        var a = new int[school][classroom][stud];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(
                            "Enter the marks of student-" + (k + 1) + " classroom-" + (j + 1) + " school-" + (i + 1));
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("\nThe marks are");

        System.out.println("School\tClassroom\tStudent\tMarks");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println((i + 1) + "\t" + (j + 1) + "\t\t" + (k + 1) + "\t" + a[i][j][k] + "\n");
                }
            }
        }
    }
}