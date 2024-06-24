package ru.novikova.seminar6.controller;

import ru.novikova.seminar6.data.Teacher;
import ru.novikova.seminar6.service.TeacherService;
import ru.novikova.seminar6.view.TeacherView;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    @Override
    public void printAll() {
        teacherView.sendOnConsole(teacherService.getAll());
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
