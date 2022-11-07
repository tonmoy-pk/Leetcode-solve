import java.util.*;

public class ArrayRecovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] d = new int[n];
            int a[] = new int[n];
            for(int j=0;j<n;j++){
                d[j]  = sc.nextInt();
            }
            cal(d);

            
        }
    }

    public static void cal(int arr[]){
        int a[]= new int[arr.length];
        a[0] = arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>a[j-1] || arr[j]==0){
                a[j] = a[j-1]+arr[j];
            }
            else{
                System.out.println(-1);
                return;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        
    }
}
