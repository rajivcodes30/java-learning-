public class MergeSort {
    
    public static void mergesort(int[] array, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergesort(array, left, mid);
            mergesort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }
    public static void merge(int[] array, int left, int mid, int right) {
       int i = left;
       int j = mid + 1;
         int k = 0;

         int[] temp = new int[right - left + 1];

         while(i <= mid && j <= right) {
             if(array[i] <= array[j]) {
                 temp[k++] = array[i++];
             } else {
                 temp[k++] = array[j++];
             }
         }
        while(i <= mid) {
            temp[k++] = array[i++];
        }
        while(j <= right) {
            temp[k++] = array[j++];
        }

        for(i = left, k = 0; i <= right; i++, k++) {
            array[i] = temp[k];
        }
    }

      public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        mergesort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");

        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}