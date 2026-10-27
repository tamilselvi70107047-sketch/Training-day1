import java.util.*;
public class missing{
public static void main (String args[]){
int[]arr={6,1,0,2,9,5,6,3,7,4};
int missing=1;
for(int i=0;i<arr.length;i++){
Boolean found=false;
for(int j=0;j<arr.length;j++){
if(arr[j]==missing){
found=true;
break;
}
}
if(!found){
break;}
missing++;
}
System.out.println("first missing positive number="+missing);
}}