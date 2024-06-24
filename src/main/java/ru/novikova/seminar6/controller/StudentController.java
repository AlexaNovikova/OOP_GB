package ru.novikova.seminar6.controller;



import ru.novikova.seminar6.data.Student;
import ru.novikova.seminar6.service.StudentService;
import ru.novikova.seminar6.service.UserService;
import ru.novikova.seminar6.view.StudentView;
import ru.novikova.seminar6.view.UserView;

import java.time.LocalDate;

public class StudentController implements UserController<Student> {


    //dependency injection - модули низкого уровня не должны зависеть от модулей низкого уровня
    // и те и другие должны зависеть от абстракций( чтобы можно было при необходимости поменять реализацию)
    private final UserService<Student> dataService = new StudentService();

//    private final StudentGroupService studentGroupService = new StudentGroupService();
//    private final StudentView studentView = new StudentView();

    private final UserView<Student> studentView = new StudentView();
    // Single responsibility - разделим метод на два - create и printAll
//    @Override
//    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
//        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        studentView.sendOnConsole(dataService.getAll());
//    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    @Override
    public void printAll() {
        studentView.sendOnConsole(dataService.getAll());
    }

    // single responsibility - уберем все методы по работе с группами в отдельный класс - StudentGroupController
//
//    public void createStudentGroup(Teacher teacher, List<Student> students){
//        studentGroupService.createStudentGroup(teacher, students);
//        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
//    }
//
//    public void getStudentInStudentGroup(String firstName, String secondName){
//        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
//        studentView.sendOnConsole(Collections.singletonList(student));
//    }
//
//    public void getSortedListStudentFromStudentGroup(){
//        List<Student> students = studentGroupService.getSortedStudentGroup();
//        studentView.sendOnConsole(students);
//    }
//
//    public void getSortedListByFIOStudentFromStudentGroup(){
//        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
//        studentView.sendOnConsole(students);
//    }


}
