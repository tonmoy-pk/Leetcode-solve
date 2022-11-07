import java.util.LinkedList;

public class DesignStream {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,1};
        int a[]= {0,1,2,3,4};
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(arr[i], a[i]);
        }
        int ar[]= new int[list.size()];
        for(int i=0;i<arr.length;i++){
            ar[i]= list.get(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(ar[i]);
        }

    }
    
}
