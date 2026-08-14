class Add
{
	
	int add(int x, int y)
	{
	 return(x+y);	
	}
        double add(float x, int y, double z)
	{
	 return(x+y+z);	
	}
	float add(float x, float y, int z, int w)
	{
	 return(x+y+z+w);	
	}
}
class MethOverload
{
	public static void main(String arg[])
	{
		Add ad = new Add();
                System.out.println("Addition of 2 num is "+ad.add(40,2));
		System.out.println("Addition of 3 num is "+ad.add(4.4f,7,39.6));
		System.out.println("Addition of 4 num is "+ad.add(28.5f,4.5f,42,52));
	}
}