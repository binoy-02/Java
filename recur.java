import java.util.*;
public class  recur
{
 static int Recur(int a)
 {
  if(a>0)
  {
   a=a+Recur(a-1);
   
   return a;
  }
  else
  {
   return 0;
  }
}
  public static void main(String args[])
  {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a num");
   int num= s.nextInt();
   int out=Recur(num);
   System.out.println(out);
  }
}