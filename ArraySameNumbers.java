public class ArraySameNumbers{
    public static void main(String args[]) {
    
    int count=1;
        int arr[ ]={23,45,67,78,90,23,45,23,65,33,22};
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 
                 if(arr[i]==arr[j])
                 {
                     count++;
                     arr[j]=0;
                 }
                 
             }
             //If u need to get only unique numbers o/p simply give
             //if(arr[i]!=0 && count==1) use this instead of if(arr[i]!=0) below
             if(arr[i]!=0){
                 System.out.println(arr[i]+ ": " +count);
             }
                 count=1;
                 
             }
    }
}