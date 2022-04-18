import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //Generate array of plants names as input from user
        String[] testPlantArray = {"Potato", "Onion/Garlic", "Tomato", "Eggplant", "Pepper", "Cucumber," +
                "Carrot", "Beet", "Cabbage", "Vegetable Marrow", "Pumpkin", "Legumes/Beans"};

//        //Generate test area 5x5 cells and set each cell the position
//        Cell[][] testArea = new Cell[5][5];
//        for (int i=0; i < 5; i++) {
//            for (int j=0; j < 5; j++){
//                testArea[i][j] = new Cell(new Position(i+1,j+1));
//                System.out.println("X of Cell is: " + testArea[i][j].position.axisX);
//                System.out.println("Y of Cell is: " + testArea[i][j].position.axisY);
//            }
//        }
//
//        //
//        List<Area> testAreaList = new ArrayList<Area>();
//
//        //Generate test List of Plants as DataBase of plants in our application
//        List<Plant> testPlantList = new ArrayList<Plant>();
//        for (String item: testPlantArray) {
//            testPlantList.add(new Plant(item));
//        }
//        //testing DataBase
//        for (Plant item:
//             testPlantList) {
//            Plant plnt = item;
//            System.out.println(plnt.name + " ");
//        }
//
//
//        //test space for checking separate system blocks
//        PlantCompatibility testCompatibility = new PlantCompatibility();

        //testing Cell
        Plant tomato = new Plant(testPlantArray[2]);// creating previous plant
        Plant potato = new Plant(testPlantArray[0]);// creating current plant
        Cell testCell = new Cell(potato, new Position(10,14));// creating test cell

        tomato.setPlantCompatibility(testPlantArray[0], CompatibilityValues.BAD); //setting another plants in compatibility table
        tomato.setPlantCompatibility(testPlantArray[1], CompatibilityValues.GOOD);//for tomatoes

        potato.setPlantCompatibility(testPlantArray[0], CompatibilityValues.BAD);//setting another plants in compatibility table
        potato.setPlantCompatibility(testPlantArray[1], CompatibilityValues.GOOD);//for previous plant at the cell
        potato.setPlantCompatibility(testPlantArray[5], CompatibilityValues.GOOD);
        potato.setPlantCompatibility(testPlantArray[10], CompatibilityValues.MIDDLE);


//        System.out.println(potato.currentPlantCompatibility.values());
//        System.out.println(potato.currentPlantCompatibility.keySet());

        System.out.println(testCell.mostCompatiblePlantsList);
        System.out.println(testCell.admissiblePlantsList);


//        for (String s : testCell.mostCompatiblePlantsList) {
//            System.out.println(s);
//        }


    }
}
