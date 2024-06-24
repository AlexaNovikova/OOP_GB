package ru.novikova.seminar6.controller;

import ru.novikova.seminar6.data.Student;
import ru.novikova.seminar6.data.Teacher;
import ru.novikova.seminar6.service.StudentGroupService;
import ru.novikova.seminar6.service.StudentGroupServiceImpl;
import ru.novikova.seminar6.view.StudentGroupView;
import ru.novikova.seminar6.view.StudentView;
import ru.novikova.seminar6.view.UserView;

import java.util.Collections;
import java.util.List;

public class StudentGroupController {

    // dependency injection
    private final StudentGroupService studentGroupService = new StudentGroupServiceImpl();
    private final StudentGroupView studentGroupView = new StudentGroupView();
    private final UserView<Student> studentUserView = new StudentView();

    // single responsibility - разделим метод на два (create и print)
    public void createStudentGroup(Teacher teacher, List<Student> students) {
        studentGroupService.createStudentGroup(teacher, students);
//        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void printStudentGroup() {
        studentGroupView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }


    public void getStudentInStudentGroup(String firstName, String secondName) {
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentUserView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup() {
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentUserView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup() {
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentUserView.sendOnConsole(students);
    }
}
