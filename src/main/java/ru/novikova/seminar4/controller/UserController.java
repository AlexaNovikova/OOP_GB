package ru.novikova.seminar4.controller;



import ru.novikova.seminar4.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
