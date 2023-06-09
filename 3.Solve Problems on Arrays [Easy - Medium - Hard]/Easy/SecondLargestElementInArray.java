class SecondLargestElementInArray {
    static int secondLargest(int arr[], int n)
    {
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE; //for handling -ve array elements
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    static int secondSmallest(int arr[], int n)
    {
        int smallest=arr[0];
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,800};
        System.out.println(secondLargest(arr,arr.length));
        System.out.println(secondSmallest(arr,arr.length));
    }
}
/*
Time Complexity - O(N)
Space Complexity - O(1)
Status - Optimal
 */
