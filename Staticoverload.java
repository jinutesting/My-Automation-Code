package demopack;

public class Staticoverload{

	public static void main(String[] args) {
		
		System.out.println("This is beggining");
		
		
		
		eight.add(20,30);
eight.add(10,20,30);
eight.add(50,100,"This is my world");
eight t1=new eight();
t1.bangalore();



	}
}
class eight	

{
public static void add(int a,int b)

{
int c=a+b;
System.out.println("sum of a and b : "+c);

}
public static void add(int a,int b,int c)
{
int d=a+b+c;
System.out.println("adding of three number a,b and c: "+d);
}
public static void add(int a,int b,String msg)

{
int d=a+b;
System.out.println(msg+d);
}

public void bangalore()
{
System.out.println("This my correct program");	
}
}



