package demopack;

public class Demo_static {

	public static void main(String[] args) {
	
		System.out.println("This is beginning");
		
		
		four t1=new four();
		t1.banglore();
		t1.chennai();
		t1.mumbai();
		
	three t2=new three();
	t2.add(50,70);
		

	}

}
class four
{
public void banglore()	
{
System.out.println("This is banglore");	
}

public void chennai()	
{
System.out.println("This is chennai");	
}
public void mumbai()	
{
System.out.println("This is mumbai");	
}
class three
{
public void add(int a,int b)
{
int c=a+b;
System.out.println("adding a and b:  " +c);
}

}}