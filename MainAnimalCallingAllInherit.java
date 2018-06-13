
class Animal {
   String breed;
   String color;

   void speak(){
       System.out.println("Animals Speak...");
   }

}

     class Dog extends Animal{
               
                 void speak(){
                 System.out.println("Dog Bark !!");
                 }
              }

     class Cat extends Animal{
                
                 void speak(){
                 System.out.println("Cat Meow !!");
                 }
              }

public class MainAnimalCallingAllInherit {
	
	public static void main(String args[]) {
		
		Animal obj1=new Animal();
		obj1.speak();
	    Dog obj2=new Dog();
	    obj2.speak();
	    Cat obj3=new Cat();
	    obj3.speak();
		
	}

}
