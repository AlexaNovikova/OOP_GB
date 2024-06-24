package ru.novikova.seminar6.view;



import ru.novikova.seminar6.data.Student;
import ru.novikova.seminar6.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    // single responsibility - уберем этот метод в отдельный класс StudentGroupView
//    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
//        logger.info(studentGroup.toString());
//    }

}
