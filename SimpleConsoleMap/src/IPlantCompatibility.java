import java.util.List;

public interface IPlantCompatibility {
    default String isCompatible(Plant currentPlant, Plant comparablePlant){
        return "Default value in method isCompatible";
    }
    default CompatibilityValues isCompatible(Plant comparablePlant){
        CompatibilityValues cV = CompatibilityValues.BAD;
        return cV;
    }
    default List<Plant> getCompatiblePlants(Plant plant){
        return null;
    }

}
