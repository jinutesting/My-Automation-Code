package demopack;

public class Democonstructionoverload {

	public static void main(String[] args) {
	
		
		System.out.println("This is my Democonstructionoverload");
		
	nine n1=new nine();
	nine n2=new nine(60,30);
	nine n3=new nine(10,20,30);
	n2.Kerala();
	
		
		

	}

}
class nine{
	nine()
	{
		System.out.println("This is nine project constructionoverload");
	}
	
	nine(int a,int b)
	{
		int d=a+b;
		System.out.println("sum of a,b  ;"+d);
		
		
	}
nine(int a,int b,int c)

{
	
int e=a+b+c;

System.out.println("sum of a,b,c  ;"+e);

}

public void Kerala()
{
	System.out.println("iam from kerala");	
}

}