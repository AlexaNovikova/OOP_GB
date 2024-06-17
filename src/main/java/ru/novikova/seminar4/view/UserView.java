package ru.novikova.seminar4.view;


import java.util.List;
import ru.novikova.seminar4.data.User;
public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
