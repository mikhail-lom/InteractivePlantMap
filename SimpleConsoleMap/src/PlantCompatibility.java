//import java.util.Hashtable;
//import java.util.IdentityHashMap;
//
//public class PlantCompatibility implements IPlantCompatibility {
//    //Table of plant compatibility for crop rotation
//    public IdentityHashMap<String, cell_package.CompatibilityValues> plantCompatibility;
//
//    PlantCompatibility(cell_package.Plant plant){
//        plant.currentPlantCompatibility.plantCompatibility.put(plant.name, cell_package.CompatibilityValues.BAD);
//    }
//
//    @Override
//    public cell_package.CompatibilityValues isCompatible(cell_package.Plant comparablePlant) {
//
//        return plantCompatibility.get(comparablePlant.name);
//    }
//}
