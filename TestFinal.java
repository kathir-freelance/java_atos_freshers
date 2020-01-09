	//1. final variable cannot change its value
	//2. final class cannot be inherited
	//3. final mmethod cannot be overridden

	//final 
	class A // final class in java API -String
	{
		public final void display()
		{
		}
	}

	class B extends A
	{
		public void display()
		{
		}

	}

	class TestFinal
	{
		public static void main()
		{
			final float PI=3.14f;	//const
			System.out.println("pi value "+PI);
			//++PI;  //not supported
		}		
	}






		