package de.neufische.model;

import java.util.Arrays;

public class StudentDB {

    public Student[] studentArray;


    StudentDB(Student[] studentArray){

        this.studentArray = studentArray;


    }


    public String getRandomStudent(){
        double rand = (Math.random() * (studentArray.length));
        return studentArray[(int) rand].toString();
    }



    public void addStudent(Student student){
        Student[] newArray =  new Student[studentArray.length + 1];
        for (int i = 0; i < studentArray.length; i++) {
            newArray[i] = studentArray[i];
        }
        newArray[studentArray.length - 1] = student;
        this.studentArray = newArray;

    }


    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alfred", 1);
        students[1] = new Student("Olli", 2);
        students[2] = new Student("Gabi", 3);


        var studentDB = new StudentDB(students);
        System.out.println(studentDB.getRandomStudent());
        System.out.println((int) (Math.random()*3));
    }

    @Override
    public String toString() {
        return "StudentDB{" + Arrays.toString(studentArray) +
                '}';
    }
}
