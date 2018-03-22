package OOPS;

public interface InterfaceOne
{
   public void intfcmethod();
   
   public default void intfcmethodOne()
   {
	 System.out.println("This is intfcmethodOne");   
   }
   
   public static  void intfcmethodTwo()
   {
	   System.out.println("This is intfcmethodTwo");   
   }
  
   
}
