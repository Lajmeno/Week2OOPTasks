package de.neufische.model;

import java.util.Objects;

public class Student {

    private int id;
    private int age ;
    private String fistName = "abdullah";
    private String subject;

    Student(String firstName, int id){
        this.fistName = firstName;
        this.id = id;
    }


    Student(){

    }

    public void printThis(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        String result = this.fistName + ", " + this.id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(fistName, student.fistName) && Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, fistName, subject);
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }



}
