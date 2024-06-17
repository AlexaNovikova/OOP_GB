package ru.novikova;


import ru.novikova.seminar3.data.GroupThread;
import ru.novikova.seminar3.data.Student;
import ru.novikova.seminar3.data.StudentGroup;
import ru.novikova.seminar3.data.Teacher;
import ru.novikova.seminar3.service.StreamService;
import ru.novikova.seminar3.service.StudentGroupService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", "Носов", "Викторович",
                LocalDate.of(1989, 7, 22)));
        students.add(new Student("Петр", "Носов", "Сергеевич",
                LocalDate.of(1987, 1, 2)));
        students.add(new Student("Виктория", "Носова", "Викторовна",
                LocalDate.of(1983, 7, 22)));
        students.add(new Student("Родион", "Бабкин", "Викторович",
                LocalDate.of(1997, 4, 22)));
        students.add(new Student("Екатерина", "Иванова", "Александровна",
                LocalDate.of(1994, 6, 5)));
        StudentGroup studentGroup1= new StudentGroup(
                new Teacher
                        ("Сергей", "Сидоров", "Викторович",
                                LocalDate.of(1980, 7, 28)),
                students);
        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Иван", "Носов", "Викторович",
                LocalDate.of(1989, 7, 22)));
        students2.add(new Student("Петр", "Носов", "Сергеевич",
                LocalDate.of(1987, 1, 2)));
        students2.add(new Student("Виктория", "Носова", "Викторовна",
                LocalDate.of(1983, 7, 22)));
        StudentGroup studentGroup2= new StudentGroup(
                new Teacher
                        ("Лев", "Дорофеев", "Петрович",
                                LocalDate.of(1976, 7, 28)),
                students2);

        List<Student> students3 = new ArrayList<>();
        students3.add(new Student("Лев", "Татарченко", "Викторович",
                LocalDate.of(1989, 7, 22)));
        students3.add(new Student("Михаил", "Носов", "Сергеевич",
                LocalDate.of(1987, 1, 2)));
        students3.add(new Student("Кирилл", "Носова", "Викторовна",
                LocalDate.of(1983, 7, 22)));
        students3.add(new Student("Юлия", "Носова", "Ивановна",
                LocalDate.of(1989, 7, 22)));
        students3.add(new Student("Петр", "Носов", "Сергеевич",
                LocalDate.of(1987, 1, 2)));
        students3.add(new Student("Александра", "Носова", "Викторовна",
                LocalDate.of(1983, 7, 22)));
        students3.add(new Student("Виктор", "Носов", "Викторович",
                LocalDate.of(1989, 7, 22)));
        students3.add(new Student("Петр", "Носов", "Сергеевич",
                LocalDate.of(1987, 1, 2)));
        students3.add(new Student("Виктория", "Носова", "Викторовна",
                LocalDate.of(1983, 7, 22)));
        StudentGroup studentGroup3= new StudentGroup(
                new Teacher
                        ("Федор", "Дорофеев", "Петрович",
                                LocalDate.of(1976, 7, 28)),
                students3);

        List<StudentGroup> studentGroupList1 = new ArrayList<>();
        studentGroupList1.add(studentGroup1);
        studentGroupList1.add(studentGroup2);
        studentGroupList1.add(studentGroup3);

        List<StudentGroup> studentGroupList2 = new ArrayList<>();
        studentGroupList2.add(studentGroup1);
        studentGroupList2.add(studentGroup2);

        List<StudentGroup> studentGroupList3 = new ArrayList<>();
        studentGroupList3.add(studentGroup1);


        GroupThread groupThread1 = new GroupThread(studentGroupList2);
        GroupThread groupThread2 = new GroupThread(studentGroupList3);
        GroupThread groupThread3 = new GroupThread(studentGroupList1);

        List<GroupThread> groupThreads = new ArrayList<>();
        groupThreads.add(groupThread1);
        groupThreads.add(groupThread2);
        groupThreads.add(groupThread3);


        while (groupThread1.hasNext()){
            System.out.println(groupThread1.next());
        }

        StreamService.sort(groupThreads);

        for (GroupThread groupThread: groupThreads){
            System.out.println(groupThread.size());
        }
    }
}