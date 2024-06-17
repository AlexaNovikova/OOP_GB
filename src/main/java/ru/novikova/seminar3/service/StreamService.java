package ru.novikova.seminar3.service;

import ru.novikova.seminar3.data.GroupThread;

import java.util.List;

public class StreamService {
    public static void sort(List<GroupThread> groupThread){
        groupThread.sort(new StreamComparator());
    }
}
