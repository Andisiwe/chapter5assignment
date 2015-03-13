package za.ac.cput.chapter5assignment.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class Student {
    private String name;
    private int studentNo;
    private int mark;
    List<Student> list;

    public Student(String name, int studentNo, int mark){
        this.name = name;
        this.studentNo = studentNo;
        this.mark = mark;
        list = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        list.add(student);
    }

    public List<Student> getStudentList(){
        return list;
    }

    public String toString(){
        return "Name: " + name +"\nStudent No: "+ studentNo+"\nMark: "+mark;
    }
}
