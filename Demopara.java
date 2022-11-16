package demopack;

public class Demopara {

	public static void main(String[] args) {
		System.out.println("This is Begining");
   
		three t1=new three();
		t1.add(20,30);
		

	}

}
class three
{
public void add(int a,int b)
{
int c=a+b;
System.out.println("adding a and b:  " +c);
}

public void city(String cityname)    //(strong city name)
{
System.out.println(cityname);
}

}
