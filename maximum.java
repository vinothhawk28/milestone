import java.util.Scanner;
public class largest {
public static void main(String[] args) {
	int a,b;
	int c=0;
	int max=0;
	int i,temp=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	int arr[]=new int[a];
	for(i=0;i<a;i++){
		arr[i]=in.nextInt();
	}
	for( i=0;i<a;i++){
		max=arr[0];
			if(arr[i]>max){
				max=arr[i];
				temp=max;
			}
		}
	System.out.print(temp);}
}

