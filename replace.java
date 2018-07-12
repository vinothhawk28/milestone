package guvi;
import java.util.Scanner;
public class same {
public static void main(String[] args) {
String s,t=null;
Scanner in=new Scanner(System.in);
s=in.nextLine();
int l=s.length();
String arr[]=new String [l];
for(int i=0;i<l;i++){
	arr[i]=Character.toString(s.charAt(i));
}
if(l%2==0){
for(int i=1;i<l;i+=2){
 t=arr[i]+arr[i-1];
System.out.print(t);}
}
if(l%2==1){
	for(int i=1;i<l;i+=2){
		 t=arr[i]+arr[i-1];
		System.out.print(t);}
		System.out.print(arr[l-1]);}
			
}
}
