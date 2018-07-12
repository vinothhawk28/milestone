package guvi;
import java.util.*;
public class reverse {
public static void main(String[] args) {
	String a,s;
	Scanner in=new Scanner(System.in);
	a=in.nextLine();
	StringBuffer sb=new StringBuffer(a);
	 s=sb.reverse().toString();
	 System.out.println(s);
}
}
