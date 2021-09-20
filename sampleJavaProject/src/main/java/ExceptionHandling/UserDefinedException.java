package ExceptionHandling;

public class UserDefinedException extends  Exception{

    String str1;
    public UserDefinedException(String str)
    {
        str1 = str;
    }

   public String toString()
   {
       return("Exception - "+ str1);
   }




}
