package ru.novikova.seminar6.view;

import ru.novikova.seminar6.data.StudentGroup;

import java.util.logging.Logger;

public class StudentGroupView {

    Logger logger = Logger.getLogger(StudentView.class.getName());
    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }
}
