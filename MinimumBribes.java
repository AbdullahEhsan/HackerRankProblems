class MinimumBribes {
  public static void main(String[] args) {
    int[] arr1 = {5,1,2,3,7,8,6,4};
    int[] arr2 = {1,2,5,3,7,8,6,4};
    minimumBribes(arr1);
    minimumBribes(arr2);
  }

 static void minimumBribes(int[] q) {
    int bribes = 0;
    for(int i = q.length-1;i>=0; i--){
      if (q[i]-i-1>2){
        bribes= -1;
        break;
      }
      for(int j = Math.max(0, q[i]-2); j<i;j++){
        if(q[i]<q[j]) bribes++;
      }
    }
    String output = bribes>=0 ? bribes+"" : "Too chaotic";
    System.out.println(output);
  }
}