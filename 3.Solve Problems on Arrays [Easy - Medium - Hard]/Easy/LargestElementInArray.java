class LargestElementInArray{
    public static int largest(int arr[], int n)
    {
        int largest=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>largest) largest=i;
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,800};
        System.out.println(largest(arr,arr.length));
    }
}

/*
Time Complexity - O(N)
Space Complexity - O(1)
Status - Optimal
 */