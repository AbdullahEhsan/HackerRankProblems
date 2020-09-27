class CountingValleys {
  public static void main(String[] args) {
    System.out.println(countingValleys(8, "UDDDUDUU"));
  }

public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int currentLevel = 0;
        for(int i = 0; i<path.length();i++){
            if(path.charAt(i)==('D')){
                currentLevel--;
            }
            if(path.charAt(i)==('U')){
                currentLevel++;
                if(currentLevel==0) valleys++;
            }
        }
        return valleys;
    }
}
