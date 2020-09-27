import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println(repeatedString("aba",10));
  }

  static long repeatedString(String s, long n) {
        String justTheAs = "";
        for (String a: s.split("[^a]+")){
            if(a.indexOf('a')>=0) justTheAs += a;
        }
        long lengthOfInput = s.length();
        long numberofAsInInput = justTheAs.length();

        long numberOfTotalAs = numberofAsInInput*(n/lengthOfInput);
        for(int i = 0; i<(n%lengthOfInput);i++){
            if(s.charAt(i)=='a') numberOfTotalAs++;
        }
        return numberOfTotalAs;
    }
}