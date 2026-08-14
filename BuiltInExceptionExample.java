class BuiltInExceptionExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            int a = 10, b = 0;
            int c = a / b;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception occured ");
            e.printStackTrace();
        }

        try 
        {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out Of Bounds: ");
            e.printStackTrace();
        }

        try 
        {
            String s = null;
            System.out.println(s.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Null Pointer Exception: ");
            e.printStackTrace();
        }
    }
}