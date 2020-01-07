class TestTypeConversions{

	public static void main(String ar[]){
	
		char a='A';
		float f=2.3f;
		double d=3.456d;
		short s=1300;
		//byte b=(byte)129;
		long l=9876523445L;
		int data=0B1_1_01;	//from java 7

		//\u000dSystem.out.println("this is sample conversion");
		System.out.println("binary equivalent of data "+data);
		
		System.out.println("char data "+a);
		System.out.println("float data "+f);
		System.out.println("double data "+d);
		System.out.println("short data "+s);		
		System.out.println("long data "+l);
		//System.out.println("byte data "+b);

		int d1='a';//implicit conversions
		System.out.println("conversion1 "+d1);
		d1=(int)2.7877f;
		System.out.println("conversion2 "+d1);
		int y=(int)2.5f/5;
		System.out.println("conversion 3 "+y);
		


	}


}



