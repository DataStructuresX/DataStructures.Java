public class 
Stack<G> 
{
    private Node 
    top;

    private int 
    length = 0;

    private class 
    Node
    {
        G data;
        Node next;
        Node(G data1, Node next1) { data = data1; next = next1;}
    }

    public boolean 
    vacant() { return top == null;}

    public int
    size() { return length;}

    public void
    push(G data)
    {
        Node follower = top;
        top = new Node(data, follower);
        length = length + 1;
    }

    public G
    pop()
    {
        if (vacant()) { return null; }
        G output = top.data;
        top = top.next;
        length = length - 1;
        return output;
    }
}