package ru.novikova.seminar6.view;


import ru.novikova.seminar6.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
