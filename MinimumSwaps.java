class MinimumSwaps {
  public static void main(String[] args) {
    int[] arr = {1,3,5,2,4,6,7};
    System.out.println(minimumSwaps(arr));
  }

 static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int compVal = 0;
        for(int i = 0; i<arr.length; i++){
            compVal = arr[i];
            if(compVal!=i+1){
                arr[i] = arr[compVal-1];
                arr[compVal-1] = compVal;
                swaps++;
                i--;
            }
        }
        return swaps;
    }
}