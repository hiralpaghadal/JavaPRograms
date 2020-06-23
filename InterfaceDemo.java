
interface Animal {
	  public void animalSound(); 
	  public void sleep(); 
	  public void eat();
	}

	
	class Dog implements Animal 
	{
	  @Override
	  public void animalSound() {
	    System.out.println("The dog bark");
	  }
	  
	  @Override
	  public void sleep() {
	    System.out.println("The dogs sleep");
	  }
	  
	  @Override
	  public void eat() {
	    System.out.println("The dogs eat");
	  }
	  
	}
	
	class Lion implements Animal{
		
		 @Override
		public void animalSound() {
		    System.out.println("The lion roar");
		  }
		 
		 @Override
		  public void sleep() {
		    System.out.println("The lions sleep");
		 }
		 
		   @Override
			 public void eat() {
			 System.out.println("The lions eat");
		  }	
	}

	class InterfaceDemo {
	  public static void main(String[] args) {
	     new Dog().animalSound();
	     new Dog().sleep();
	     new Dog().eat();
	     new Lion().animalSound();
	     new Lion().sleep();
	     new Lion().eat();
	    
	  }
	}