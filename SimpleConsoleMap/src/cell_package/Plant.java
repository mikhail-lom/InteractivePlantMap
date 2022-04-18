package cell_package;

import java.util.*;
import java.util.stream.Collectors;

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
//        Iterator<Plant> iterator = currentPlantCompatibility.entrySet();
//        do {
//            if (currentPlantCompatibility.containsKey(iterator) && currentPlantCompatibility.containsValue(val)) {
//
//            }
//        } while (iterator.hasNext());

        //get values and keys as pairs
        //see https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
        for (Map.Entry<Plant,CompatibilityValues> item:
             currentPlantCompatibility.entrySet()) {
            if (item.getValue() == val) {
                compatibleList.add(item.getKey());
            }
        }

//        Map<CompatibilityValues, List<Plant>> reverseMap = currentPlantCompatibility.entrySet()
//                        .stream()
//                .collect(Collectors.groupingBy(Map.Entry::getValue,
//                        Collectors.mapping(
//                                Map.Entry::getKey,
//                                Collectors.toList())));
        return compatibleList;
    }
}
