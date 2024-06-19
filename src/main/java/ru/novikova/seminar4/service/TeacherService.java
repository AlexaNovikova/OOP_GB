package ru.novikova.seminar4.service;

import ru.novikova.seminar4.data.Student;
import ru.novikova.seminar4.data.Teacher;

import java.time.LocalDate;
import java.util.*;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return Collections.unmodifiableList(teachers);
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    public void changeById(Long id, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        for (int i = 0; i < teachers.size(); i++) {
            if(id.equals(teachers.get(i).getTeacherId())){
                teachers.get(i).setFirstName(firstName);
                teachers.get(i).setSecondName(secondName);
                teachers.get(i).setPatronymic(patronymic);
                teachers.get(i).setDateOfBirth(dateOfBirth);
            }
        }
    }

    public void sortBySurname() {
        teachers.sort(new Teacher.TeacherSurnameComparator());
    }

    public void sortByFio() {
        Comparator<Teacher> teacherFioComparator = Comparator.comparing(Teacher::getSecondName)
                .thenComparing(Teacher::getFirstName)
                .thenComparing(Teacher::getPatronymic);
        teachers.sort(teacherFioComparator);
    }
}
