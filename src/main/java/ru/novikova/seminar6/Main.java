package ru.novikova.seminar6;

import ru.novikova.seminar6.controller.TeacherController;
import ru.novikova.seminar6.data.Student;
import ru.novikova.seminar6.data.Teacher;
import ru.novikova.seminar6.data.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Сергей", "Сидоров", "Викторович",
                        LocalDate.of(1980, 7, 28));
        teacherController.create("Иван", "Леонов", "Петрович",
                LocalDate.of(1976, 2, 18));
        teacherController.create("Аркадий", "Иванов", "Дмитриевич",
                LocalDate.of(1985, 4, 22));
        teacherController.create("Леонид", "Ложкин", "Иванович",
                LocalDate.of(1988, 2, 28));
        teacherController.printTeachers();
        teacherController.changeById(1L, "Сергей", "Иванов", "Викторович",
                LocalDate.of(1980, 7, 28));
        teacherController.printTeachers();
        teacherController.sortBySurname();
        teacherController.printTeachers();
        teacherController.sortByFio();
        teacherController.printTeachers();


        // принцип подстановки Лисков - можно ссылаться на любой класс (Student и Teacher).
        User user = new Student("Сергей", "Сидоров", "Викторович",
                LocalDate.of(1980, 7, 28));
//        User user = new Teacher("Иван", "Леонов", "Петрович",
//                LocalDate.of(1976, 2, 18));
        System.out.println(user);
    }
}
