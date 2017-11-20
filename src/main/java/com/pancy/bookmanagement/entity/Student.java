package com.pancy.bookmanagement.entity;

public class Student {
    private long studentId;
    private long password;

    public Student() {
    }

    public Student(long studentId, long password) {

        this.studentId = studentId;
        this.password = password;
    }

    public long getStudentId() {

        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", password=" + password +
                '}';
    }
}
