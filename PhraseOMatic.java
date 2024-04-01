public class PhraseOMatic {
    public static void main(String[] args) {
        // Create 3 set of words
        String[] wordListOne = {
                "dog", "cat", "tiger", "croc", "panda"
        };
        String[] wordListTwo = {
                "sticky", "oriented", "distributed", "clustered", "branded"
        };
        String[] wordListThree = {
                "process", "solution", "architecture", "solution", "strategy"
        };

        // Find the total number of each word list
        int wordOneNum = wordListOne.length;
        int wordTwoNum = wordListTwo.length;
        int wordThreeNum = wordListThree.length;

        // Pick a random number from total number of each list
        int randOne = (int) (Math.random() * wordOneNum);
        int randTwo = (int) (Math.random() * wordTwoNum);
        int randThree = (int) (Math.random() * wordThreeNum);

        // Consist a phrase from each of worl list
        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        // Print the result of combined phrase
        System.out.println("What we need is => " + phrase);
    }
}