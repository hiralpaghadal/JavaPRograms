
interface Animals{
	void sleep();
	void breathe();
}

class Dogs implements Animals {
	@Override
   public void sleep() {
      System.out.println("Dogs sleep.");
   }

	@Override
	public void breathe() {
    System.out.println("Dogs breathe.");
 		}
	}

class Cat implements Animals {
		@Override
	   public void sleep() {
	      System.out.println("Cats sleep.");
	   }

		@Override
		public void breathe() {
	    System.out.println("Cats breathe.");
	 	}
}

class RunTimePolymorphism {
   public static void main(String[] args) {
	   Animals a1 = new Dogs();
	   a1.sleep();
       a1.breathe();
	   
       Animals a2 = new Cat();
       a2.sleep();
       a2.breathe();
     
   }
}
