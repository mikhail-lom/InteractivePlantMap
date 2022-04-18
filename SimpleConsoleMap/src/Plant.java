import java.util.HashMap;
import java.util.Hashtable;

public class Plant {
    //fields
    String name;
    HashMap<String,CompatibilityValues> currentPlantCompatibility = new HashMap<String,CompatibilityValues>();


    //constructors
    Plant(String plantName) {
        name = plantName;
        currentPlantCompatibility.put(plantName,CompatibilityValues.BAD);
    }

    //methods

    //Check values in compatibility table
    public void setPlantCompatibility(String comparablePlantName, CompatibilityValues val) {
        if (currentPlantCompatibility.containsKey(comparablePlantName)) {
            System.out.println("Plant is already in the table!");
        }else{
            currentPlantCompatibility.put(comparablePlantName,val);
        }


    }
}
