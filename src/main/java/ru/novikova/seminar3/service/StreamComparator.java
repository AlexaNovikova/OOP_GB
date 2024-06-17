package ru.novikova.seminar3.service;

import ru.novikova.seminar3.data.GroupThread;

import java.util.Comparator;

public class StreamComparator implements Comparator<GroupThread> {
    @Override
    public int compare(GroupThread o1, GroupThread o2) {
        return o1.size() - o2.size();
    }
}
