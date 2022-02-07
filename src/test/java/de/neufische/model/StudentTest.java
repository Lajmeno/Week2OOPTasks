package de.neufische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    @Test
    void shouldSetAndGetNameKlaus(){
        Student student = new Student();

        String name = "Klaus";
        student.setFistName(name);

        assertEquals(name, student.getFistName());
    }

    @Test
    void shouldSetAndGetAge25(){
        Student student = new Student();

        int age = 25;
        student.setAge(age);

        assertEquals(age, student.getAge());
    }

    @Test
    void shouldSetAndGetSubjectMath(){
        Student student = new Student();

        String subject = "Math";
        student.setSubject(subject);

        assertEquals(subject, student.getSubject());
    }

    @Test
    void shouldConstructandReturnStudentAsString(){
        var student = new Student("Max", 22);
        student.setSubject("Biology");

        assertEquals("Max, 22, Biology", student.toString());
    }

}