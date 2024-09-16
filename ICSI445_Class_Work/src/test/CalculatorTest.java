package test;
import sut.Calculator;       // update this line based on where your subject under test is

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// These are needed for data driven test
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;


class CalculatorTest {

    Calculator calc = new Calculator();
    int x = 2;
    int y = 3;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        calc = new Calculator(); // Resets it
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    @DisplayName("Simple A + B Positive Values")
    void testAddPositive() {
        assertEquals(5, calc.add(x,y) , "");
//        assertEquals(105, calc.add(10,5) , ""); //This will fail because it is just wrong
        assertEquals(50, calc.add(25,25) , ""); // This will not execute since above fail
    }

    //BETTER SYNTAX FOR MULTIPLE TESTS BUT STILL NOT BEST PRACTICE UNLESS THERE IS PURPOSE!
    @Test
    @DisplayName("Simple A + B Positive Values")
    void testAddPositiveAssertAll() {
        assertAll(
                () -> assertEquals(5, calc.add(x,y) , ""),
                () -> assertEquals(105, calc.add(10,5) , ""),
                () -> assertEquals(500, calc.add(25,25) , "")
        );
    }


    @Test
    @DisplayName("Simple A - B Negative Values")
    void testAddNegative() {
        assertEquals(-11, calc.add(-1,-10) , "");
    }

    @Test
    @DisplayName("Simple A - B Zero Values")
    void testAddZero() {
        assertEquals(0, calc.add(0,0) , "");
    }

    // Learned about Regression testing, make sure changes didn't bork old stuff
    // Learned about data driven
    // 1. Collection of tests
    // 2. Load Test Case, method, report

    //Collection of test cases
    static Collection<Object[]> calcValues(){
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {3,0,2},// Will Fail!
                {3,-2,1},
                {-2,0,-2},
                {-2,-2,-4},
        });
    }

    @ParameterizedTest
    @MethodSource("calcValues")
    void testCalWithDataDriven(int a, int b, int sum){
        assertTrue(sum == calc.add(a,b));
    }


}
