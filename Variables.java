class Variables {
   public static void main(String[] args){
      String name = "Maha";
	int myNum = 15 ;
	String myNum2 = "raja";
	final int number1 = 1 ;
	//number1 = 2 ;
	float myFloatValue1 = 10.5f;
	int myInt = (int)10.5f ;
	int myInt2 = (int) 20.56d ; // narrowing typecasting
	char myChar = 'c',myChar2 = 65 ;
	boolean myBool = true ;
	int __ = 45 , $ = 54 ;
       System.out.println(name);
       System.out.println(myNum);
       System.out.println(myNum2);
	System.out.println(number1);
	System.out.println(myFloatValue1+","+myChar2);
	System.out.println(myChar+","+myBool +","+__ +","+$);
	System.out.println("hello" + name +","+myInt +","+myInt2);
 }

}