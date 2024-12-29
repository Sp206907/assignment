import modules.Person;
import modules.School;
import modules.Student;
import modules.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();
        File file = new File("C:\\Users\\ernar\\IdeaProjects\\Myapplication\\src\\students.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String firstName = words[0];
            String lastName = words[1];
            int age = Integer.parseInt(words[2]);
            boolean gender = Boolean.parseBoolean(words[3]);
            Student student = new Student(firstName, lastName, age, gender);
            int length = words.length;
            for (int i = 4; i < length; i++) {
                student.addGrade(Integer.parseInt(words[i]));
            }
            school.addMember(student);
        }
        sc.close();

        File teacherFile = new File("C:\\Users\\ernar\\IdeaProjects\\Myapplication\\src\\teachers.txt");
        Scanner teacherScanner = new Scanner(teacherFile);
        while (teacherScanner.hasNext()) {
            String line = teacherScanner.nextLine();
            String[] words = line.split(" ");
            String firstName = words[0];
            String lastName = words[1];
            int age = Integer.parseInt(words[2]);
            boolean gender = Boolean.parseBoolean(words[3]);
            String subject = words[4];
            int yearsOfExperience = Integer.parseInt(words[5]);
            int salary = Integer.parseInt(words[6]);
            Teacher teacher = new Teacher (firstName, lastName, age, gender, subject, yearsOfExperience, salary);
            if (teacher.getYearsOfExperience()>=10){
                teacher.giveRaise(10);
            }
            school.addMember(teacher);
        }
        teacherScanner.close();
        System.out.println(school);

    }


}
