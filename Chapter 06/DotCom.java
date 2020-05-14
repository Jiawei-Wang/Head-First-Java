import java.util.ArrayList;

public class DotCom {

    // use ArrayList instead of list
    private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
