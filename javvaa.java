import java.util.*;
public class Javvaa{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=1234;
int reverse=0;
for(int i=n;i>0;i/=0)
{
reverse=reverse+10;
reverse+=1%10;
}
System.out.println(reverse);
}
}
