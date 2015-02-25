package dcll.lleg;

/**
 * Created by 21105790 on 25/02/2015.
 */
public class MySimpleStack implements SimpleStack {

    private Item [] stack;
    private int nbItems;
    /**
     * Tests if this stack is empty
     */

    public MySimpleStack() {
        this.stack = new Item [10];
        this.nbItems = 0;
    }
    public boolean isEmpty() {
        return(this.nbItems == 0);
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {
        return this.nbItems;
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
        this.stack[nbItems] = item;
        nbItems++;
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.

     */
    public Item peek()  {
        return this.stack[0];
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function. if this stack is empty.
     */
    public Item pop() {
        Item itemreturned = this.stack[0];
        for(int i = 0 ; i<nbItems-1;i++) {
            this.stack[i] = this.stack[i+1];
        }
        return itemreturned;
    }
}
