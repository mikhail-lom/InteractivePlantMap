package cell_package;

import cell_package.Cell;
import cell_package.Plant;

public class Application {
    public static void main(String[] args) {
        //Generate array of plants names as input from user
        String[] testPlantArray = {"Potato", "Onion/Garlic", "Tomato", "Eggplant", "Pepper", "Cucumber",
                "Carrot", "Beet", "Cabbage", "Vegetable Marrow", "Pumpkin", "Legumes/Beans"};



        //testing cell_package.Cell
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

//        for (Plant item: potato.getCompatibleList(CompatibilityValues.GOOD)) {
//            System.out.print(item.name + " ");
//        }
//        System.out.println();
//        for (Plant item: potato.getCompatibleList(CompatibilityValues.MIDDLE)) {
//            System.out.println(item.name);
//        }

        for (Plant item: potato.getCompatibleListTrghIterator(CompatibilityValues.GOOD)) {
            System.out.println(item.name);;
        }

        System.out.println(potato.getCompatibleListTrghIterator(CompatibilityValues.GOOD));


    }
}
