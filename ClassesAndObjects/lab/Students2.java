package ClassesAndObjects.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        boolean isFrom(String city) {
            return this.city.equals(city);
        }

        String getInfo() {
            return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
        }

        String getFirstName() {
            return this.firstName;
        }

        String getLastName() {
            return this.lastName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] studentParameter = line.split(" ");
            String firstName = studentParameter[0];
            String lastName = studentParameter[1];
            int age = Integer.parseInt(studentParameter[2]);
            String city = studentParameter[3];

            int index = indexOfStudent(students, firstName, lastName);
            if (index == -1) {
                students.add(new Student(firstName, lastName, age, city));
            }else{
                students.set(index, new Student(firstName, lastName, age, city));
            }


            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }
    }

    private static int indexOfStudent(List<Student> students, String firstName, String lastName) {
        int y = -1;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                y += 1;
            }
        }
        return y;
    }
}