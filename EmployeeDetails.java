
public class EmployeeDetails {
	
	    int id;  
	    String name;  
	    int age;  
	     
	    EmployeeDetails(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    
	    
	    EmployeeDetails(int id,String name,int age){  
	    this.id = id;  
	    this.name = name;  
	    this.age = age;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+age);
	    	
	    }  
	   
	    public static void main(String args[]){ 
	    	
	    EmployeeDetails e1 = new EmployeeDetails(101, "Jill" );  
	    EmployeeDetails e2 = new EmployeeDetails(112, "Jack" ,30);  
	    e1.display();  
	    e2.display();  
	   }  
	} 
