package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

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
        Student Ed = new Student("Ed", "Sheeran", "10/18/1990", "Math",  "Guitar");
        Student Charlie = new Student("Charlie", "Puth", "02/21/2007", "Math",  "Piano");
        Student Shawn = new Student("Shawn", "Mendes", "02/21/1991", "Math",  "Vocal");
        course1.addAttendee(Ed);
        course1.addAttendee(Charlie);
        course1.addAttendee(Shawn);
        int expected = 3;
        int observed = course1.getNumberOfAttendees();
        assertEquals(expected, observed);
    }
}
