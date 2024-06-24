package ru.novikova.seminar6.controller;



import ru.novikova.seminar6.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{

    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    void printAll();
}
