package dcll.lleg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     *
     */

    public AppTest()
    {
        super("MonTest");
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testIsEmpty() {
        MySimpleStack stack = new MySimpleStack();
        this.assertTrue(stack.isEmpty());
    }

    public void testGetSize() {
        MySimpleStack stack = new MySimpleStack();
        char [] nom = {'c','e'};
        stack.push(new Item(nom));
        stack.push(new Item(nom));
        stack.push(new Item(nom));
        this.assertEquals(3,stack.getSize());
    }

}
