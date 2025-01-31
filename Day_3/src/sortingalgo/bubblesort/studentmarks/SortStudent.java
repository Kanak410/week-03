package sortingalgo.bubblesort.studentmarks;

public class SortStudent {
     public static void swap(int arr[],int i,int j){
         arr[i]=arr[i]^arr[j];
         arr[j]=arr[i]^arr[j];
         arr[i]=arr[i]^arr[j];
     }
      public static int[] sortStudentMarks(int []arr){
          for(int i=0;i<arr.length;i++){
              boolean ans=false;
              for(int j=0;j< arr.length-i-1;j++){
                  if(arr[j]>arr[j+1]){
                      swap(arr,j,j+1);
                      ans=true;
                  }

              }
              if(!ans){
                  return arr;
              }

          }
          return arr;
      }

}
