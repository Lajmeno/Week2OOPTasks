package de.neufische.studentint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistoryStudentTest {

    @Test
    void shouldReadBooksToStudy(){
        var student = new HistoryStudent();
        assertEquals("Read history books!", student.study());
    }

    @Test
    void shouldLearnProgrammingToStudy(){
        var student = new ComputerScienceStudent();
        assertEquals("Learn programming!", student.study());
    }

}