
public class ArrayEvenOdd{
    public static void main(String args[]) {
    
    int sum=0, even=0, odd=0;
        int arr[ ]={23,45,67,78,90,65,33,22};
        for(int i=0;i<arr.length;i++){
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
           // sum=sum+arr[i];
            
        }
        System.out.println("sum of even array is:" +even);
        System.out.println("sum of even array is:" +odd);

    }
}
       