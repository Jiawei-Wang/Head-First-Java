public class PhraseOMatic {
    public static void main (String[] args) {
        // string lists
        String[] wordList1 = {"a", "one"};
        String[] wordList2 = {"cat", "dog"};
        String[] wordList3 = {"jumps", "eats"};

        // count length
        int oneLength = wordList1.length;
        int twoLength = wordList2.length;
        int threeLength = wordList3.length;

        // random number
        int rand1 = (int)(Math.random()*oneLength);
        int rand2 = (int)(Math.random()*twoLength);
        int rand3 = (int)(Math.random()*threeLength);

        // combination
        String phrase = wordList1[rand1] + ' ' + wordList2[rand2] + ' ' + wordList3[rand3];

        System.out.println(phrase);
    }
}
