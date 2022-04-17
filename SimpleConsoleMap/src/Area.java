import java.util.List;

public class Area implements PlantCompatibility{
    //fields
    List<Cell> cells;

    //constructors
    Area(List<Cell> cells){

    }

    //methods
    @Override
    public boolean isCompatible(Plant currentPlant, Plant comparablePlant) {
        return false;
    }

    void addNewCell(Cell newCell){

    }

    void removeCell(){

    }


}
