import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int regNo;
        while (true) {
            System.out.print("Enter the Student Reg No: ");
            String regNoStr = scanner.nextLine();
            try {
                regNo = Integer.parseInt(regNoStr);
                if (regNo <= 0) {
                    System.out.println("Invalid registration number. Please enter a positive integer.");
                    continue;
                }
                break; // If input is valid, break the loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid registration number. Please enter a positive integer.");
            }
        }

        System.out.print("Enter the Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the Course/Programme (BSc/BCA): ");
        String course = scanner.nextLine();
        if (!course.equals("BSc") && !course.equals("BCA")) {
            System.out.println("Invalid course. Please enter either 'BSc' or 'BCA'.");
            return;
        }

        COURSE student = new COURSE(regNo, name, course);
        student.calculate();
        student.display();
    }
}


class COURSE {
    int regNo;
    String name;
    String course;
    int[] marks;

    COURSE(int regNo, String name, String course) {
        this.regNo = regNo;
        this.name = name;
        this.course = course;
        this.marks = new int[course.equals("BSc") ? 5 : 6]; // Set marks array size based on course
    }

    void calculate(int subCount) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter marks for %d Subjects:\n", marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Subject %d: ", i + 1);
            marks[i] = scanner.nextInt();
        }
    }
    void calculate() {
        if (marks.length == 5) {
            calculate(5); // Call the overloaded method for BSc
        } else {
            calculate(6); // Call the overloaded method for BCA
        }
    }

    void display() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double percentage = (double) total / marks.length;

        System.out.println("----------------------------------");
        System.out.println("Student Details");
        System.out.println("----------------------------------");
        System.out.println("REG NO : " + regNo);
        System.out.println("NAME : " + name);
        System.out.println("COURSE : " + course);
        System.out.println("TOTAL : " + total);
        System.out.printf("PERCENTAGE : %.4f\n", percentage);
        System.out.println("----------------------------------");
    }
}

