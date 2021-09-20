package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ExceptionHandlingExcercise {

    public static void main(String[] args)
    {
        ExceptionHandlingExcercise  e = new ExceptionHandlingExcercise();
// checked exception
        e.computeValue();

// run time exception
        int i = 0;
        String str = null;


        try {
            i = e.checkLen(str);
        }catch(NullPointerException ne)
        {
            System.out.println("Exception - " +ne.getMessage());

        }
        System.out.println("value of i : "+ i);

// user defined exception

        String abc = "date";

        try {
            String res = e.StringManupulation(abc);
        }catch(UserDefinedException UDE)
        {
            System.out.println(UDE);
        }



    }

    public void readFile()
    {
        try {
            FileReader fl = new FileReader("/");
        }catch(FileNotFoundException e)
        {
            e.getMessage();
        }
    }
//example of checked exceptions
    public int devide(int x) throws IllegalAccessException , ArithmeticException
    {
        int value = 12/x;
        System.out.println("value"+value);

        return value;

    }

    public  void computeValue()
    {
        int x = 0;
        try {
            devide(x);
        }catch(IllegalAccessException e)
        {
            System.out.println("Exception - value is zero");
        }catch (ArithmeticException a)
        {
            System.out.println("Exception - value is zero");
        }

        System.out.println("Printing the values after exception");
    }

    // examples of run time exceptions

    public int checkLen(String str) throws NullPointerException
    {
        if(str == null)
        {
            throw new NullPointerException("Its a null String");
        }

        return str.length();
    }


    // User defined exception


    public String StringManupulation(String str) throws UserDefinedException
    {
        String str1 = str;
        str = str+"chaning String";
        if(str != str1)
        {
            throw new UserDefinedException("string value changed");

        }
        return str;
    }


}
