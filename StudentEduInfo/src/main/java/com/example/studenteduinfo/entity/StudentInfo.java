package com.example.studenteduinfo.entity;


import org.springframework.boot.autoconfigure.domain.EntityScan;




public class StudentInfo {




    private int id;
    private String Name;
    private String Age;
    private  String Grade;
    private String Address;

    public StudentInfo() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public StudentInfo(int id, String name, String age, String grade, String address) {
        this.id = id;
        Name = name;
        Age = age;
        Grade = grade;
        Address = address;
    }
}
