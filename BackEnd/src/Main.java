import school.School;
import school.Schoolroom;
import school.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //JSONParser parser = new JSONParser;
        Scanner sc = new Scanner(System.in);
        System.out.println("Кол-во школ: ");
        int schoolsCount = sc.nextInt();
        ArrayList<School> schools = new ArrayList<>();
        for(int i = 0; i < schoolsCount; i++){
            System.out.println("Введите название школы: ");
            String schoolName = sc.nextLine();
            System.out.println("Введите адрес школы: ");
            String schoolAddress = sc.nextLine();
            System.out.println("Введите телефон школы: ");
            String schoolPhone = sc.next();
            schools.add(new School(schoolName, schoolAddress, schoolPhone));
            System.out.println("Введите кол-во классов в школе: ");
            int classroomCount = sc.nextInt();
            for(int j = 0; j < classroomCount; j++){
                System.out.println("Введите номер класса: ");
                int classroomParallel = sc.nextInt();
                System.out.println("Введите букву класса: ");
                char classroomName = sc.next().charAt(0);
                Schoolroom schoolroom = new Schoolroom(classroomName, classroomParallel);
                System.out.println("Введите кол-во учеников в классе: ");
                int classroomMemberCount = sc.nextInt();
                for(int k = 0; k < classroomMemberCount; k++){
                    System.out.println("Введите ФИО и возраст ученика: ");
                    String studentName = sc.next(), studentLastName = sc.next(), studentParentName = sc.next();
                    int age = sc.nextInt();
                    boolean gender = !(studentParentName.charAt(studentParentName.length() - 1) == 'a');
                    System.out.println("Введите средний балл ученика: ");
                    double avgRating = sc.nextDouble();
                    schoolroom.addStudent(new Student(studentName, studentLastName, studentParentName, age, avgRating, gender));
                }
                schools.get(i).addClassroom(schoolroom);
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1); ar.add(2); ar.add(3); ar.add(4); ar.add(5); ar.add(6); ar.add(7);
        System.out.println(ar.get(0));

    }
}