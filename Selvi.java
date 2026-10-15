import java.util.*;
public class Selvi{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int oddsum=0;
int evensum=0;
for(int i=0;i<=num;i++)
{
if(i%2==0)
{
evensum=evensum+i;
}
else
{
oddsum=oddsum+i;
}}
System.out.println("evensum is:"+evensum);
System.out.println("oddsum is:"+oddsum);
}
}