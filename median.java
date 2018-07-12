import java.util.Arrays;
import java.util.Scanner;
public class median {
public static void main(String[] args) {
int a;
Scanner in=new Scanner(System.in);
a=in.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++){
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
int y=a/2;
System.out.println(arr[y]);
}
}
