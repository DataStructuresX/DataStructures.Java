/*
 * ArrayStack
 * API:
 *  vacant() -- check whether stack is vacant
 *  push(G x) -- put an item onto the stack
 *  pop() -- pop out the top item from the stack
 *  size() -- current number of items on the stack
 *
 * Note: when initializing the stack, the client must
 * place a zero-value object of the target data type. 
 * This object will always stay at the bottom of the stack.
 * The client is not expected to use this "housekeeping" item.
 * However, if he/she accidentally does, the program will not crash.
 * Returning NULL will violate the strong type
 *   constraint and is bad practice.
 * Tips: put a unique value as the first item
 *    of the stack, so that if this item is popped,
 *    then the client should know this is the last item.
 */

public class
ArrayStack<G>
{   private G[] storage;
    private int _capacity_;
    private int i_head; // index of the current head

    public
    ArrayStack(int user_defined_capacity, G zeroObj)
    {   _capacity_ = user_defined_capacity;
        storage= (G[]) new Object[_capacity_]; 
        storage[0] = zeroObj;
        i_head = 0;
    }

    public boolean
    vacant() { return i_head < 0; }

    public int
    size() { return i_head; }

    public void
    push(G x) 
    {   if ( i_head < (_capacity_ - 1) ) 
        {   i_head = i_head + 1;
            storage[i_head] = x; 
        }
        else { }
    }

    public G
    pop() 
    {   G output = storage[i_head];
        if (i_head > 0 ) { i_head = i_head - 1; }
        else { }
        return output;
    }
}