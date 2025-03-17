package myproject1;

class InstanceCounter 
	{
	    static int count = 0;
	    public InstanceCounter()
	    {
	        count++;
	    }
	    public static int getInstanceCount() 
	    {
	        return count;
	    }
	}
public class instances 
{
    public static void main(String[] args) 
    {
   
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();
        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
    }
}