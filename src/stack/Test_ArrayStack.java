import java.util.Scanner;

public class
Test_ArrayStack
{
    static void 
    println(String s)
    {
        System.out.println(s);
    }

    // store values from standard input into a stack container
    static ArrayStack<String> 
    store(int capacity) 
    {
        ArrayStack<String> stack = new ArrayStack<String>(capacity);
        Scanner scanner = new Scanner(System.in);
        while ( scanner.hasNext() )
        {
            String x = scanner.next();
            if (!x.equals("-")) { stack.lay(x); }
            else {
                if ( !stack.vacant() ) { println(stack.pop() + " "); }
                else { }
            }
        }
        return stack;
    }

    public static void
    main(String args[])
    {   println("hello");
        ArrayStack<String> stack = store(50);
        println(String.format("[%d] items left.", stack.size()));
    }
}