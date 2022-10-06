import java.lang.*;
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    { 
        super(str);  
    }  
}  
public class ExceptionClass
{  
    void divide(int a,int b)
    {
    	int res;
    	try
    	{
    		res=a/b;
    		System.out.println(res);
    	}
    	catch(ArithmeticException ae)
    	{
    		System.out.println(ae);
    	}
    }
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
    	   throw new InvalidAgeException("age is not valid to vote");    
       }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }     
    public static void main(String args[])  
    {  
    	ExceptionClass ec=new ExceptionClass();
    	ec.divide(10, 0);
        try  
        {    
            validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {   
            System.out.println(ex);  
        }   
    }  
}  
