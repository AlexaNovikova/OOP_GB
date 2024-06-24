package ru.novikova.seminar6.view;

import ru.novikova.seminar6.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());
    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }
}
