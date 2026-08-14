import java.io.*;
class InvalidAgeException extends Exception
{
 InvalidAgeException(String s)
 {
  super(s);
 }
}
class CustomException
{
 static void validate(int age) throws InvalidAgeException
 {
  if(age<18)
  {
   throw new InvalidAgeException("not eligible to vote");
  }
  else
  {
   System.out.println("eligible to vote");
  }
 }
 public static void main(String args[])
 {
  try
  {
   validate(13);
  }
  catch(InvalidAgeException e)
  {
   System.out.print(e.getMessage());
  }
 }
}