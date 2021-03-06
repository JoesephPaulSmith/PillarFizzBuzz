/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillarfizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joexi
 */
public class PillarFizzBuzzTest {
    
    PillarFizzBuzz fizzBuzz;
    
    public PillarFizzBuzzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fizzBuzz = new PillarFizzBuzz();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber(){
        assertEquals("1", fizzBuzz.fizz(1));
    }
    
    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsATwo(){
        assertEquals("2", fizzBuzz.fizz(2));
    }
    
    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
        assertEquals("fizz", fizzBuzz.fizz(3));
        assertEquals("fizz", fizzBuzz.fizz(6));
    }
    
    @Test
    public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz(){
        assertEquals("buzz", fizzBuzz.fizz(5));
        assertEquals("buzz", fizzBuzz.fizz(10));
    }
    
}
