import java.util.Arrays;
import java.util.Scanner;
public class sort {
public static void main(String[] args) {
int a;
Scanner in=new Scanner(System.in);
a=in.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++){
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
}
}
