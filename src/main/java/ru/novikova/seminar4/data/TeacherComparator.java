package ru.novikova.seminar4.data;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }

    @Override
    public Comparator<Teacher> thenComparing(Comparator<? super Teacher> other) {
        return Comparator.super.thenComparing(other);
    }
}
