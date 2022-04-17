import java.util.List;

/**
 *  cell
 *
 */
public class Cell implements PlantCompatibility {
    //fields
    Plant plant;
    List<Cell> neighbours;

    //constructors
    Cell(){
    }

    Cell(Plant plant){

    }

    //methods
    @Override
    public boolean isCompatible(Plant currentPlant, Plant comparablePlant) {
        return false;
    }

    void createCell(Plant plant) {

    }

    void retrieveCell(Plant plant) {

    }

    void updateCell(Plant plant) {

    }

    void deleteCell(Plant plant) {

    }

}
