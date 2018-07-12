package guvi;
import java.util.Scanner;
public class camel {
public static void main(String[] args) {
	String a;
	String c=null;
	Scanner in=new Scanner(System.in);
	a=in.nextLine();
	String t[]=a.split(" ");
	for(int i=0;i<t.length;i++){
		c=t[i];
	
	String r=c.substring(0,1);
	String n=r.toUpperCase()+c.substring(1);
	System.out.print(n+" ");
}}
}
