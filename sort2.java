import java.util.Arrays;
import java.util.Scanner;
public class sort {
public static void main(String[] args) {
int b;
Scanner in=new Scanner(System.in);
b=in.nextInt();
int arr1[]=new int[b];
for(int i=0;i<b;i++){
	arr1[i]=in.nextInt();
}
Arrays.sort(arr1);
System.out.println(Arrays.toString(arr1));
}
}
