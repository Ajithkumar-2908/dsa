class Solution2 {
//Attempt 1
/*
  public boolean find(int num) {
    // TODO: Write your code here
    int slow = num;
    int fast = num;

    do {
      slow = findSquareSum(slow);
      fast = findSquareSum(findSquareSum(fast));
    } while(slow != fast);
    return (slow == 1);
  }

  public int findSquareSum(int num) {
    int squareSum = 0;
    int digit = 0;
    while(num > 0) {
      digit = num % 10;
      squareSum = squareSum + (digit * digit);
      num = num / 10;
    }
    return squareSum;
  }
  */

    //Attempt 2
    public boolean find(int num) {
        // TODO: Write your code here
        int slow = num;
        int fast = num;

        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);
        return (slow == 1);
    }

    public int findSquareSum (int num) {
        int squareSum = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            squareSum = squareSum + (digit * digit);
            num = num / 10;
        }
        return squareSum;
    }
}
