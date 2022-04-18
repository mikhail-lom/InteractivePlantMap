package cell_package;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * cell
 */
public class Cell {
    //fields
    Plant plant;
    Position position;
    ArrayList<String> mostCompatiblePlantsList;
    ArrayList<String> admissiblePlantsList;

    //constructors
    Cell() {
    }

    Cell(Position cellPosition) {
        position = cellPosition;
    }

    Cell(Plant cellPlant) {

    }

    Cell(Plant cellPlant, Position cellPosition) {

    }

    //methods


    //Check the compatibility of previous and current plants at this cell
//    @Override
//    public cell_package.CompatibilityValues isCompatible(cell_package.Plant comparablePlant) {
//        cell_package.CompatibilityValues cellCompatibility = cell_package.CompatibilityValues.BAD;
//        try {
//            switch (comparablePlant.currentPlantCompatibility.isCompatible(plant)) {
//                case GOOD -> {
//                    return cellCompatibility = cell_package.CompatibilityValues.GOOD;
//                }
//                case MIDDLE -> {
//                    return cellCompatibility = cell_package.CompatibilityValues.MIDDLE;
//                }
//                case BAD -> {
//                    return cellCompatibility = cell_package.CompatibilityValues.BAD;
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Something went wrong with cell_package.Cell isCompatible. Check the table of Compatibility");
//            ;
//        }
//        return cellCompatibility;
//
//    }

    void createCell(Plant plant) {

    }

//    void retrieveCell() { //see the solution at https://javarevisited.blogspot.com/2013/02/how-to-get-key-from-value-in-hashtable.html#axzz7QnGf3Flp
//        //generating good compatibility list
//        String key = null;
//        cell_package.CompatibilityValues value = cell_package.CompatibilityValues.GOOD;
//        for (Map.Entry item:
//             plant.currentPlantCompatibility.entrySet()) {
//            if (value.equals(item.getValue())){
//                key = item.getKey().toString();
//                mostCompatiblePlantsList.add(key);
//                break;
//            }
//        }
//        //generating acceptable compatibility list
//        String acceptableListKey = null;
//        cell_package.CompatibilityValues acceptableListValue = cell_package.CompatibilityValues.MIDDLE;
//        for (Map.Entry item:
//                plant.currentPlantCompatibility.entrySet()) {
//            if (value.equals(item.getValue())){
//                acceptableListKey = item.getKey().toString();
//                admissiblePlantsList.add(acceptableListKey);
//                break;
//            }
//        }
//
//    }

    ArrayList<String> retrieveMostCompatiblePlantsList(){

        return mostCompatiblePlantsList;

    }

    void updateCell(Plant plant) {

    }

    void deleteCell(Plant plant) {

    }

}
