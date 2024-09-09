package test;

import org.junit.jupiter.api.*;
import sut.ArrayOperations;

import static org.junit.jupiter.api.Assertions.*;

//Assert Equal is much better than assertTrue/False
class ArrayOperationsNumZeroTest
{
    @BeforeAll
    static void setUpBeforeClass() throws Exception
    {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception
    {
    }

    @BeforeEach
    void setUp() throws Exception
    {
    }

    @AfterEach
    void tearDown() throws Exception
    {
    }

    @Test
    void testNumZeroEmptyArray(){
        int[] myArr = {};
        int result = ArrayOperations.numZero(myArr);
        assertEquals(0,result, "TEST EMPTY ARR");
    }
    @Test
    void testNumZeroNoZero(){
        int[] myArr = {1,2,3,4};
        int result = ArrayOperations.numZero(myArr);
        assertEquals(0,result, "TEST EMPTY ARR");
    }

    @Test
    void testNumZeroFirst(){
        int[] myArr = {0,1,2,3,4};
        int result = ArrayOperations.numZero(myArr);
        assertEquals(1,result, "TEST EMPTY ARR");
    }
    @Test
    @DisplayName("Custom Test For Class Boi!")
    void testNumZeroLast(){
        int[] myArr = {1,2,3,4,0};
        int result = ArrayOperations.numZero(myArr);
        assertEquals(1,result, "TEST EMPTY ARR");
    }

}
