package org.Lab4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestClassroom {

    Classroom classroom;

    @BeforeEach
    void setUp() {classroom = new Classroom(); }

    @Test
    @DisplayName("Name should be set")
    void testSetName() {
        assertEquals("Julia", classroom.setName("Julia"), "Should work for any name");
    }
    @Test
    @DisplayName("Surname should be set")
    void testSetSname() {
        assertEquals("Smith", classroom.setName("Smith"), "Should work for any surname");
    }
    @Test
    @DisplayName("Class number should be set")
    void testSetClassNumber() {
        assertEquals(5, classroom.setClassNumber(5), "Should work for any age");
    }


    @Test
    @DisplayName("Email should be set")
    void testSetEmail() {
        assertEquals("julia123@gmail.com", classroom.setEmail("julia123@gmail.com"), "Should work for any email address");
    }

    @Test
    @DisplayName("Favourite subject should be set")
    void testSetFavSubject() {
        assertEquals(favouriteSubject.PHYSICS, classroom.setFavSubject(favouriteSubject.PHYSICS), "Favourite subject have to be set for one of the three given subjects");
    }
}

