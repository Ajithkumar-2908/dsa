class Solution2 {
    public boolean checkIfPangram(String sentence) {
        // TODO: Write your code here

        sentence = sentence.toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {

            if (sentence.indexOf(i) == -1) {
                return false;
            }

        }

        return true;

    }
}
