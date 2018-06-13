
public class OverloadPrint {
	
	 static void Print(){
	        System.out.println("This is empty print function with Null arguments");
	    }
	 static void Print(int x){
	        System.out.println("Print passed int argument: " + x);
	    }
	 static void Print(float x){
	        System.out.println("Print passed float argument: " + x);
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadPrint.Print();
		OverloadPrint.Print(55);
		OverloadPrint.Print(5.5f); //TAKE CARE IN FLOAT 5.5f...............
	}

}
