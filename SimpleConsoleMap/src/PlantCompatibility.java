//import java.util.Hashtable;
//import java.util.IdentityHashMap;
//
//public class PlantCompatibility implements IPlantCompatibility {
//    //Table of plant compatibility for crop rotation
//    public IdentityHashMap<String, CompatibilityValues> plantCompatibility;
//
//    PlantCompatibility(Plant plant){
//        plant.currentPlantCompatibility.plantCompatibility.put(plant.name, CompatibilityValues.BAD);
//    }
//
//    @Override
//    public CompatibilityValues isCompatible(Plant comparablePlant) {
//
//        return plantCompatibility.get(comparablePlant.name);
//    }
//}
