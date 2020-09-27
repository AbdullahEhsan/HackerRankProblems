import java.util.Arrays;

class SockMerchant {
  public static void main(String[] args) {
    int[] socks = {1,1,3,1,2,1,3,3,3,3};
    System.out.println(sockMerchant(10, socks));
  }

  static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int matches = 0;
        for(int i = 0; i<ar.length-1; i++){
        if(ar[i]==ar[i+1]){
            matches++;
            i++;
        }
    }
    return matches;
  }
}
