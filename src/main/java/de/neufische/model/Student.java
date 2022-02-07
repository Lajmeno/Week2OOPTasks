package de.neufische.model;

public class Student {

    private int age ;
    private String fistName;
    private String subject;

    Student(String firstName, int age){
        this.fistName = firstName;
        this.age = age;
    }

    Student(){

    }

    public String toString(){
        String result = this.fistName + ", " + this.age + ", " + this.subject;
        return result;
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

    public static void main(String[] args) {
        var student = new Student();
        System.out.println(student.toString());
    }

}
