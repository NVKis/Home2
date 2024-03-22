import database.objiects.Animals;
import database.tablies.AnimalTable;

import java.util.ArrayList;

public class Main {  public static void main(String[] args) {

    AnimalTable animalsTable = new AnimalTable();
    ArrayList<Animals> animals = animalsTable.selectAll();
    if(animals.isEmpty()) {
        animalsTable.insert(new Animals("кошка", "Барсик", "Белый", 12, 5));
        animalsTable.insert(new Animals("собака", "Тузик", "Черный", 15, 4));
        animalsTable.insert(new Animals("утка", "Утя", "Желтый", 3, 3));
        animals = animalsTable.selectAll();
    }

    for (Animals tmp:animals) {
        System.out.println(tmp.toString());
    }

    animals.get(3).setName("Силя");
    animalsTable.update(animals.get(3));

    System.out.println();
    animals = animalsTable.selectAll();
    for (Animals tmp:animals) {
        System.out.println(tmp.toString());
    }

    animalsTable.delete(5);

    System.out.println();
    animals = animalsTable.selectAll();
    for (Animals tmp:animals) {
        System.out.println(tmp.toString());

    }
   // ArrayList<Animals> animals = animalsTable.selectByType();


}
}
