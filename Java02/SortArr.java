import java.io.*;
public class SortArr
{
public static void main(String arg[])
{
int a[]={12,23,89,10,29,30};
int i,t,j;
System.out.println("Array before sorting");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
for(i=0;i<6;i++)
{
for(j=i+1;j<6;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Array after sorting");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
}
}
