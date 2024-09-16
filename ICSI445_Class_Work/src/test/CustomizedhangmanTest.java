package test;

import org.junit.jupiter.api.*;
import sut.CustomizedHangman;         // update this line based on where your program under test is

import static org.junit.jupiter.api.Assertions.*;

class CustomizedHangmanTest
{
    private CustomizedHangman jimmy;

    @BeforeEach
    void setUp() throws Exception {
        jimmy = new CustomizedHangman("Jimmy", 0);
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    @DisplayName("Testing Get Stick At Zero")
    void testGetStickSRemainingZero() {
        assertEquals(0, jimmy.getSticksRemaining());
    }

    @Test
    @DisplayName("Testing Set and Get Name")
    void testingSetAndGetName(){
        jimmy.setName("James");
        assertEquals("James", jimmy.getName());
    }

    @Test
    @DisplayName("Getting Name")
    void testGetName(){
        assertEquals("Jimmy", jimmy.getName());
    }

    @Test
    @DisplayName("Check Is Dead")
    void testIsDead(){
        assertEquals(true, jimmy.isDead());
    }

    @Test
    @DisplayName("Lost Stick Zero Test")
    void testLostStickZero(){
        jimmy.lostStick();
        assertEquals(-1, jimmy.getSticksRemaining());
    }

}
