package ru.novikova.seminar4.controller;

import ru.novikova.seminar4.data.Student;
import ru.novikova.seminar4.data.Teacher;
import ru.novikova.seminar4.service.TeacherService;
import ru.novikova.seminar4.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void changeById(Long id, String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        teacherService.changeById(id,firstName,secondName,patronymic,dateOfBirth);
    }

    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void sortBySurname() {
        teacherService.sortBySurname();
    }

    public void sortByFio() {
        teacherService.sortByFio();
    }
}
