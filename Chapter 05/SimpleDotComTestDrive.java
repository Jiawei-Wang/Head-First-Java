class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits ++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}


// code for testing before implementation
public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        // initialize an object of SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4}; // initialize location list
        dot.setLocationCells(locations); // use setter from dot

        String userGuess = "2"; // an example of guess
        // use method and give example data
        String result = dot.checkYourself(userGuess);
        System.out.println(result);

/*        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed"; // need "hit" to pass test
        }
        System.out.println(testResult); // print test result
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); // turn string to int
        String result = "miss";

        for (int cell : locationCells) { // for every block
            if (guess == cell) {
                result = "hit";
                numOfHits ++;
                break;
            }
        }

        // check if the ship has beed killed after every loop
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result; // return result */
    }
}
