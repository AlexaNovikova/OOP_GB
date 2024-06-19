package ru.novikova.seminar4;

import ru.novikova.seminar4.controller.TeacherController;
import ru.novikova.seminar4.data.Teacher;
import ru.novikova.seminar4.data.TeacherComparator;
import ru.novikova.seminar4.view.TeacherView;

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
    }
}
