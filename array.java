public class array
{
 public static void main(String args[])
 {
 String[] s={"Car","Bus","Semi truck","Jeep"};
  System.out.println(s[0]+" ,"+ s[2]);
 int[] arr={1,2,3,4};

  System.out.println(arr[1]+""+arr[2]);
  System.out.println(arr.length);
  for(int i=0;i<s.length;i++)
  {
     System.out.println(s[i]);
  }
  int dl[][] ={{1,2,3,4},{5,6,7,8}};
  System.out.println(dl[1][3]);
 }
}