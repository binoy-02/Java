class Par
{
 public void disp()
 {
	System.out.println("This is parent class");
 }
 
}
class Child1 extends Par{
	public void disp()
  {
	System.out.println("This is Child1");
  }
 }
 class Child2 extends Par{
	public void disp()
  {
	System.out.println("This is Child2");
  }
 }
 class Child3 extends Par{
	public void disp()
  {
	System.out.println("This is Child3");
  }
 }
public class Inher3
{
 public static void main(String args[])
 {
	Par obj;
	obj = new Par();
	obj.disp();
	obj = new Child1();
	obj.disp();
	obj= new Child2();
	obj.disp();
	obj = new Child3();
	obj.disp();
 }
}