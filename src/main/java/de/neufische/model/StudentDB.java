package de.neufische.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {

    public List<Student> studentArray;


    StudentDB(List<Student> studentArray){

        this.studentArray = studentArray;


    }


    public String getRandomStudent(){
        double rand = (Math.random() * (studentArray.size()));
        return studentArray.get((int) rand).toString();
    }



    public void addStudent(Student student){
        studentArray.add(student);
//        List<Student> newArray =  new ArrayList<>(studentArray.size() + 1);
//        for (int i = 0; i < studentArray.size(); i++) {
//            newArray.add(studentArray.get(i));
//        }
//        newArray.add(student);
//        this.studentArray = newArray;

    }

    public void removeStudent(Student student){
        studentArray.remove(student);
//        int indexToDelete = 0;
//        for (int i = 0; i < studentArray.size(); i++) {
//            if (student.equals(studentArray.get(i))){
//                indexToDelete = 1;
//            }else {
//                if(!(i == studentArray.size() - 1 && indexToDelete == 0)){
//                    newArray[i-indexToDelete] = studentArray[i];
//                }
//            }
//        }
//        if (!(indexToDelete == 0)) {
//            this.studentArray = newArray;
//        }

//        System.arraycopy();

    }


    @Override
    public String toString() {
        return "StudentDB{"+ studentArray +
                '}';
    }
}
