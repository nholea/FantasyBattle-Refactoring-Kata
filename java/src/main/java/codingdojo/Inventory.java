package codingdojo;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Equipment equipment;

    public Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    Equipment getEquipment() {
        return equipment;
    }

    public ArrayList<Item> getListOfEquipmentItems(){
        return new ArrayList<>(List.of(getEquipment().getLeftHand(),
                                        getEquipment().getRightHand(),
                                        getEquipment().getHead(),
                                        getEquipment().getFeet(),
                                        getEquipment().getChest()));
    }

    public int getBaseDamage(){
        return getListOfEquipmentItems().stream().mapToInt(Item::getBaseDamage).sum();
    }


    }

