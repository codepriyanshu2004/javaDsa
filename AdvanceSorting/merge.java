public class merge{

    public static void merge2(int [] a,int [] b,int []c){

        int i=0;
        int j=0;
        int k=0;

        while (i<a.length && j<b.length) {

            if (a[i]<=b[j]) {
                c[k++] =a[i++];
            }else{
                c[k++] = b[j++];
            }
            
        }

        while (j<b.length) {
            c[k++]=b[j++];
        }

        while (i<a.length) {
            c[k++] = a[i++];
        }
    }


    static void mergeSort(int [] arr){
        int n = arr.length;
        if (n==1) {
            return;
        }

        // create two Array of n/2 size;

        int [] a = new int[n/2];
        int [] b = new int[n-n/2];

        //copy pasting

        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }

        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }

        //magic recurive call
        mergeSort(a);
        mergeSort(b);

        //merge these a and b
        merge2(a, b, arr);
    }

    public static void main(String[] args) {

        // int [] a = {40,50,60,70};
        // int [] b = {10,20,30};

        // int c[] = new int[a.length+b.length];
        // merge2(a,b,c);

        // for(int i=0;i<c.length;i++){
        //     System.out.print(c[i]+" ");
        // }

        int [] arr = {80,30,50,20,60,10,70,40};
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        mergeSort(arr);
System.out.println();
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}