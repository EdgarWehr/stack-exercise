

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StackTest
{
    /**
     * Default constructor for test class StackTest
     */
    public StackTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testEmptyStack()
    {
        Stack stack1 = new Stack();
        assertEquals(true,stack1.isEmpty());
    }
    
    
    @Test
    public void testPushOneData()
    {
        Stack stack1 = new Stack();
        stack1.push(5);
        assertEquals(false, stack1.isEmpty());
    }
    
    @Test
    public void testPopOneData()
    {
        Stack stack1 = new Stack();
        stack1.push(7);
        int result = stack1.pop();
        assertEquals(7, result);
    }
    
    @Test
    public void testPopEmptyStack()
    {
        Stack stack1 = new Stack();
        int result = stack1.pop();
        assertEquals(0, result);
    }
    
    @Test
    public void testPushAndPopMoreThanOne()
    {
        Stack stack1 = new Stack();
        stack1.push(5);
        stack1.push(7);
        assertEquals(7, stack1.pop());

    }
}
