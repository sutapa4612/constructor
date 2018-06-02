class Employee{  
    int id;  
    String name;  
    float salary;  
    Employee(int i, String n, float s) 
	{  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display()
	{
	System.out.println(id+" "+name+" "+salary);
	}  
}  
public class Employeemain
 {  
public static void main(String args[]) 
{  
    Employee e1=new Employee(141031,"sutapa",45000);  
    Employee e2=new Employee(141036,"sonali",25000);  
    Employee e3=new Employee(141039,"tanmoy",55000);      
    e1.display();  
    e2.display();  
    e3.display();  
}  
}  