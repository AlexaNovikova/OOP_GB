package ru.novikova.senimar5.controller;


import ru.novikova.senimar5.data.Student;
import ru.novikova.senimar5.data.Type;
import ru.novikova.senimar5.data.User;
import ru.novikova.senimar5.service.DataService;
import ru.novikova.senimar5.service.StudentGroupService;
import ru.novikova.senimar5.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<Student> students = service.getAllStudent();
        for (Student student: students){
            studentView.printOnConsole(student);
        }
    }

//    Создать метод в Контроллере, в котором агрегируются функции получения списка студентов
//            (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;

    public void createStudentGroup(){
        studentGroupService.createStudentGroup(service.getTeacher(), service.getAllStudent());
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }
}