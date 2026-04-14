import java.util.Arrays;
public class SortArray{
    // Sort elements in ascending/descending order  
  public static void main(String[] args) {
         int [] arr={1,5,2,4,6,2,45,1,4,5};
            for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
              }
            }
             for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                  int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
              }
            }
            System.out.println("Descending Order Arrays"+Arrays.toString(arr));
            for(int i=arr.length-1;i>=0;i--){
              System.out.print(arr[i]+" ,");
            }
            System.out.println();
             System.out.println("Easy and Quick use sort Method :");
            Arrays.sort(arr);
            System.out.println("Sort Method"+Arrays.toString(arr));
            
      }

}