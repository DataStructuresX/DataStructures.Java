import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;

public class
Test_ArrayStack
{
    static void 
    println(String s)
    {
        System.out.println(s);
    }

    public static void
    main(String args[])
    {   println("hello");
        int capacity = 50; // stack capacity
        ArrayStack<String> stack = new ArrayStack<String>(capacity, "DO NOT USE THIS ITEM");
        Scanner scanner = new Scanner(System.in);
        InputStream stream = new InputStream();
        if ( !stream.available() )
        {
            println("WARNING: no input found!");
            System.exit();
        }
        while ( scanner.hasNext() )
        {
            String x = scanner.next();
            if (!x.equals("-")) { stack.push(x); }
            else {
                if ( !stack.vacant() ) { println(stack.pop() + " "); }
                else { }
            }
        }
        println(String.format("[%d] items left.", stack.size()));
    }
}