package ru.novikova.seminar6.service;

import ru.novikova.seminar6.data.Student;
import ru.novikova.seminar6.data.StudentGroup;
import ru.novikova.seminar6.data.Teacher;

import java.util.List;

public interface StudentGroupService {

    //для соблюдения принципа dependency injection - создали интерфейс
    void createStudentGroup(Teacher teacher, List<Student> students);
    StudentGroup getStudentGroup();
    Student getStudentFromStudentGroup(String firstName, String secondName);
    List<Student> getSortedStudentGroup();
    List<Student> getSortedByFIOStudentGroup();
}
