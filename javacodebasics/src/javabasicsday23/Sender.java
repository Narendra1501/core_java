package javabasicsday23;

public class Sender<T> 
    {
	   private T message;
	   public Sender() {}
	   
	   public Sender ( T message )
	   { 
		   this.setMessage(message);
		   
	   }

	   public void setMessage(T message) {
		this.message = message;
	   }
	   
	   public void sendMessage()
	   {
		   System.out.println(message);
	   }

	   
    
   }
