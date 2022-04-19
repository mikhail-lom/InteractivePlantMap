package cell_package;

import java.util.*;

public class Plant {
    //fields
    String name;
    HashMap<Plant, CompatibilityValues> currentPlantCompatibility = new HashMap<Plant, CompatibilityValues>();


    //constructors
    Plant() {
    }

    Plant(String plantName) {
        name = plantName;
        currentPlantCompatibility.put(new Plant(), CompatibilityValues.BAD);
    }

    //methods

    //Check values in compatibility table
    public void setPlantCompatibility(String comparablePlantName, CompatibilityValues val) {
        if (currentPlantCompatibility.containsKey(comparablePlantName)) {
            System.out.println("cell_package.Plant is already in the table!");
        } else {
            currentPlantCompatibility.put(new Plant(comparablePlantName), val);
        }


    }

    public List<Plant> getCompatibleList(CompatibilityValues val) {
        List<Plant> compatibleList = new ArrayList<>();
        //get values and keys as pairs
        //see https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
        for (Map.Entry<Plant, CompatibilityValues> item :
                currentPlantCompatibility.entrySet()) {
            if (item.getValue() == val) {
                compatibleList.add(item.getKey());
            }
        }
        return compatibleList;
    }

    public List<Plant> getCompatibleListTrghIterator(CompatibilityValues vl) {
        List<Plant> compatibleListIterable = new ArrayList<>();
        Iterator<Map.Entry<Plant, CompatibilityValues>> iter = currentPlantCompatibility.entrySet().iterator();
        do {
            var item = iter.next();
            if (item.getValue() == vl) {
                compatibleListIterable.add(item.getKey());
            }
        }while(iter.hasNext());
        return compatibleListIterable;
    }
}
