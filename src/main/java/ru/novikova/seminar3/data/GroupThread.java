package ru.novikova.seminar3.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupThread implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int counter;

    public GroupThread() {
        this.studentGroupList = new ArrayList<>();
        this.counter = 0;
    }

    public GroupThread(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        return studentGroupList.get(counter++);
    }

    public void addStudentGroup(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    public void removeStudentGroup(int index){
        studentGroupList.remove(index);
    }

    public void removeStudentGroup(StudentGroup studentGroup){
        studentGroupList.remove(studentGroup);
    }

    public int size(){
        return studentGroupList.size();
    }


}
