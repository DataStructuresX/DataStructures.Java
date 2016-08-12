public class Test 
{
    public static void 
    main(String args[])
    {
        Node n1 = new Node<String>("a101", null);
        Node n2 = new Node<String>("a102", n1);
        System.out.println(n2.data);
        System.out.println(n2.next.data);
    }
}