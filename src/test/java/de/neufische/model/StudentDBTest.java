package de.neufische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void shouldList2Students(){

        Student[] students = new Student[2];
        students[0] = new Student("Alfred", 1);
        students[1] = new Student("Olli", 2);

        var studentDB = new StudentDB(students);

        assertEquals("StudentDB{[Alfred, 1, Olli, 2]}", studentDB.toString());

    }

    @Test
    void shouldList2StudentsAgain(){

        Student student0 = new Student("alfred", 13);


        Student[] students = new Student[2];
        students[0] = new Student("Alfred", 1);
        students[1] = new Student("Olli", 2);


        var studentDB = new StudentDB(students);

        assertEquals("StudentDB{[Alfred, 1, Olli, 2]}", studentDB.toString());

    }


}