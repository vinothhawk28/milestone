package guvi;
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
int b,c=1,temp=0;
Scanner in=new Scanner(System.in);
b=in.nextInt();
for(int i=1;i<=b;i++){
c=c*i;
temp=c;
}
System.out.println(temp);
}
}
