import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}