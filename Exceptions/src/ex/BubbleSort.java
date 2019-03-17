package ex;

public class BubbleSort {

    static void myBubblesort(int[] arr) {

        int n = arr.length;
        int temp = 0;

        for(int i = 0; i<=n; i++){
            for (int j = 1; j<=(n-1); j++){
                if (arr[j-1] >= arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }




    public static void main(String[] args) {

        int arr[] = {34, 45, -76, 786, 45, 23, 7, 1, 0, 90, -232, -999,567,56,87};

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        myBubblesort(arr);

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }
}