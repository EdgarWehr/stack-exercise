public class Stack
{
    private int[] data; //Declaration
    private int top;
    
    public Stack()
    {
        data = new int[10];
        top = 0;
    }
    
    public boolean isEmpty()
    {
        if(data[0] == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void push(int data)
    {
        this.data[0] = data;
    }
    
    public int pop()
    {
        return this.data[0];
    }
}