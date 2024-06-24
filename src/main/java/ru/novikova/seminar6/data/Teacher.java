package ru.novikova.seminar6.data;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }
    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getSecondName().compareTo(o.getSecondName());
    }


    public static class TeacherSurnameComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getSecondName().compareTo(o2.getSecondName());
        }
    }

    public static class TeacherNameComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    public static class TeacherPatronymicComparator implements Comparator<Teacher> {
        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getPatronymic().compareTo(o2.getPatronymic());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getTeacherId(), teacher.getTeacherId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeacherId());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
