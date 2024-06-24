package ru.novikova.seminar5.service;

import ru.novikova.seminar5.data.Student;
import ru.novikova.seminar5.data.StudentGroup;
import ru.novikova.seminar5.data.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
        return studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }


}
