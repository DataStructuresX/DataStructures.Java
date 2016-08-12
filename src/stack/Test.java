public class 
Test
{
    public static void
    main(String args[])
    {
        Stack<String> s = new Stack<String>();
        s.push("a1");
        s.push("a2");
        System.out.println(s.pop());
        System.out.format("size %d\n", s.size());
        System.out.format("vacant? %s\n", s.vacant());

        System.out.println(s.pop());
        System.out.format("size %d\n", s.size());
        System.out.format("vacant? %s\n", s.vacant());

        System.out.println(s.pop());
        
    }
}