public class StaticBlockDemo
{
    // Static variable
    static int count;
 
    // Static block - executes before main()
    static
    {
        System.out.println("Inside static block...");
        count = 10;
        System.out.println("Static variable initialized to: " + count);
    }
 
    // Constructor
    StaticBlockDemo()
    {
        System.out.println("Constructor called creating object...");
    }
 
    public static void main(String[] args)
    {
        System.out.println("Inside main method...");
 
        // Access static variable without creating object
        System.out.println("Value of count: " + count);
 
        // Create object
        StaticBlockDemo obj = new StaticBlockDemo();
    }
}
