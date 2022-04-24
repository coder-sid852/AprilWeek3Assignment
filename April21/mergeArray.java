package April21;

public class mergeArray {
    public static void mergeArrays(int arr1[], int arr2[], int n1,
                             int n2, int arr3[])
    {
    int i = 0, j = 0, k = 0;
 
    // Traverse both array
    while (i<n1 && j <n2)
    {
        if (arr1[i] < arr2[j])
            arr3[k++] = arr1[i++];
        else
            arr3[k++] = arr2[j++];
    }
 
    while (i < n1)
        arr3[k++] = arr1[i++];
 
    while (j < n2)
        arr3[k++] = arr2[j++];
}
public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];

        int[] array1 = {5,8,9};
        int m1 = array1.length;
     
        int[] array2 = {4, 7, 8};
        int m2 = array2.length;
     
        int[] array3 = new int[m1+m2];
         
        mergeArrays(arr1, arr2, n1, n2, arr3);
        mergeArrays(array1, array2, m1, m2, array3);
     
        System.out.println("Array after merging");
        System.out.println("First Example: ");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");

        System.out.println("\n Second Example: ");
        for (int i=0; i < m1+m2; i++)
            System.out.print(array3[i] + " ");
}
}
