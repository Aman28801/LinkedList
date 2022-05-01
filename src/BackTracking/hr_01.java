package BackTracking;
import java.sql.SQLOutput;
import java.util.*;

public class hr_01 {
    public static void MergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i=0,j=0,k=0;
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j]) {
                arr3[k++] = arr1[i++];
            }
            else
                arr3[k++]=arr2[j++];
        }
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while (j<n2){
            arr3[k++]=arr2[j++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of First Array");
        int m = sc.nextInt();
        int[] num1 = new int[m];
        for (int i = 0; i<num1.length; i++) {
            System.out.println("Element"+i);
            num1[i] = sc.nextInt();
        }
        System.out.println("Length of Second Array");
        int n = sc.nextInt();
        int[] num2 = new int[n];
        for (int j = 0; j<num2.length; j++) {
            System.out.println("Element"+j);
            num2[j] = sc.nextInt();
        }
        int[] arr3 =new int[m+n];
        MergeArrays(num1,num2,m,n,arr3);
        System.out.println(arr3[(m+n)/2]);
    }
}
