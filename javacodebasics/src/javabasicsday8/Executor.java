package javabasicsday8;

public class Executor {

	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodpublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodpublic();
		
		System.out.println(b1 instanceof Base);
				
	}

}
