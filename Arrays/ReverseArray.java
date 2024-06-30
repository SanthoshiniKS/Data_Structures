import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int m=obj.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++)
		        arr[i][j]=obj.nextInt();
		}
		for(int i=0;i<n;i++){
		    int j=0,k=m-1;
		    while(j<k){
		        int temp=arr[i][j];
		        arr[i][j]=arr[i][k];
		        arr[i][k]=temp;
		        j++;
		        k--;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print("[ ");
		    for(int j=0;j<m;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println("]");
		}
	}
}
/*
Output:
2
2
1 2
3 4
[ 2 1 ]
[ 4 3 ]
*/
