//ST10441810

package ice3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ICE3Test {
    
    String s1 = "{}{)}";
    String s2 = "";
    String s3 = "{[}]";
    String s4 = "()";
    String s5 = "({[]})";
    
    public ICE3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ICE3.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ICE3.main(args);
    }

    /**
     * Test of isValid method, of class ICE3.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        ICE3.isValid(s1);
        ICE3.isValid(s2);
        ICE3.isValid(s3);
        ICE3.isValid(s4);
        ICE3.isValid(s5);
    }

    /**
     * Test of odd_squares_sum method, of class ICE3.
     */
    @Test
    public void testOdd_squares_sum() {
        System.out.println("odd_squares_sum");
        ICE3.odd_squares_sum();
    }

    /**
     * Test of greatest_common_divisor method, of class ICE3.
     */
    @Test
    public void testGreatest_common_divisor() {
        System.out.println("greatest_common_divisor");
        int numA = 10;
        int numB = 15;
        ICE3.greatest_common_divisor(numA, numB);
    }
    
}
