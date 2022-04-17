import java.util.Hashtable;

public class Plant {
    //fields
    String name;
    Hashtable<Plant, Integer> plantCompatibility;

    //constructors
    Plant(String plantName) {
        name = plantName;
        plantCompatibility = new Hashtable<>();
    }

    //methods
    void createPlant(String newPlantName) {
        new Plant(newPlantName);
    }

    void retrievePlant() {

    }

    void updatePlant() {
        if (!plantCompatibility.containsKey(name)) {

        }
    }

    void deletePlant() {

    }
}
