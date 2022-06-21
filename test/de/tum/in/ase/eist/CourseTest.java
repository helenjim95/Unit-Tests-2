package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

	// 1: Test getCourseTitle()
    @Test
    void testGetCourseTitle() {
        Course course1 = new Course("Math");
        String expected = "Math";
        String observed = course1.getTitle();
        assertEquals(expected, observed);
    }

	// 2: Test getNumberOfAttendees()
    @Test
    void testNoAttendees() {
        Course course1 = new Course("Math");
        int expected = 0;
        int observed = course1.getNumberOfAttendees();
        assertEquals(expected, observed);
    }

    @Test
    void testThreeAttendees() {
        Course course1 = new Course("Math");
        Student ed = new Student("Ed", "Sheeran", "10/18/1990", "Math",  "Guitar");
        Student charlie = new Student("Charlie", "Puth", "02/21/2007", "Math",  "Piano");
        Student shawn = new Student("Shawn", "Mendes", "02/21/1991", "Math",  "Vocal");
        List<Student> students = new ArrayList<>();
        students.add(ed);
        students.add(charlie);
        students.add(shawn);
        course1.setAttendees(students);
        int expected = 3;
        int observed = course1.getNumberOfAttendees();
        assertEquals(expected, observed);
    }
}
