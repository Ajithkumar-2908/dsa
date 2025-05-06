public class Solution3 {
    public String reverseVowels(String s) {
        // TODO: Write your code here
    /*
    int i = 0;
    int j = s.length() - 1;
    char c1;
    char c2;
    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');
    char[] s1 = s.toCharArray();
    while(i<j) {
      c1 =s1[i];
      c2 = s1[j];
      while(!vowels.contains(c1) && i < j) {
        i++;
        c1 = s1[i];
      }
      while(!vowels.contains(c2) && i < j) {
        j--;
        c2 = s1[j];
      }
      System.out.println("i is: "+ i);
      System.out.println("j is: "+ j);
      s1[i] = c2;
      s1[j] = c1;
      i++;
      j--;
    }
    return new String(s1);
    */

        int i = 0;
        int j = s.length() - 1;
        char c1;
        char c2;
        char[] s1 = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');


        while (i < j) {


            c1 = s1[i];

            while (!vowels.contains(c1) && (i < j)) {
                i++;
                c1 = s1[i];
            }

            if (i >= j) {
                break;
            }

            c2 = s1[j];
            while (!vowels.contains(c2) && (j > i)) {
                j--;
                c2 = s1[j];
            }

            if (j <= i) {
                break;
            }

            s1[i] = c2;
            s1[j] = c1;
            i++;
            j--;


        }

        return new String(s1);
    }
}
