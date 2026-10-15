import java.util.*;
public class Starr{
public static void main(String[]rags){
int k=5;
for(int i=0;i<k;i++)
{
for(int j=0;j<k;j++)
if(i==0||j==0||j==k-1||i==k-1||i==j){
System.out.println("*"+" ");
}else{
System.out.println(" ");
}
System.out.println();
}}}