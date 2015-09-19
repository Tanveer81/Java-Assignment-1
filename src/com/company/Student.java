package com.company;

/**
 * Created by Tanveer on 18-09-15.
 */

public class Student {
    private  String studentName;
    private String studentNo;
    Room room;

    public Student(){
        //do noting
    }
    public Student(String name, String no, Room r) {
        studentName = name;
        studentNo = no;
        room = r;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }
    public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String no){
        studentNo = no;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room r){
        room = r;
    }
    public void print(){
        //cout << "Student No: " << getStudentNo() << ", " << getStudentName() << ", resides on " << room.getHallName() << " Hall, Room no, " << room.getRoomNo() << endl;
        System.out.print("Student No: " + getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName() + " Hall, Room no, " + room.getRoomNo());
    }
}
