package de.neufische.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void shouldList2Students(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alfred", 1));
        students.add(new Student("Olli", 2));

        var studentDB = new StudentDB(students);

        assertEquals("StudentDB{[Alfred, 1, Olli, 2]}", studentDB.toString());

    }

    @Test
    void shouldList2StudentsAgain(){

        Student student0 = new Student("alfred", 13);


        List<Student> students = new ArrayList<>();
        students.add(new Student("Alfred", 1));
        students.add(new Student("Olli", 2));

        var studentDB = new StudentDB(students);

        assertEquals("StudentDB{[Alfred, 1, Olli, 2]}", studentDB.toString());

    }


    @Test
    void shouldAddToMakeArrayOfThreeStudents(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alfred", 1));
        students.add(new Student("Olli", 2));

        var studentDB = new StudentDB(students);

        var student2 = new Student("Gabi", 3);
        studentDB.addStudent(student2);

        assertEquals("StudentDB{[Alfred, 1, Olli, 2, Gabi, 3]}", studentDB.toString());

    }

    @Test
    void shouldRemoveToMakeArrayOf2Students(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alfred", 1));
        students.add(new Student("Olli", 2));
        students.add(new Student("Gabi", 3));

        var studentDB = new StudentDB(students);

        var student2 = new Student("Olli", 2);
        studentDB.removeStudent(student2);

        assertEquals("StudentDB{[Alfred, 1, Gabi, 3]}", studentDB.toString());

    }

    @Test
    void shouldNotRemoveWhenStudentNotContained(){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alfred", 1));
        students.add(new Student("Olli", 2));
        students.add(new Student("Gabi", 3));

        var studentDB = new StudentDB(students);

        var student2 = new Student("Andres", 4);
        studentDB.removeStudent(student2);

        assertEquals("StudentDB{[Alfred, 1, Olli, 2, Gabi, 3]}", studentDB.toString());

    }


}