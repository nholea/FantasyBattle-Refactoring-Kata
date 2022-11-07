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


    public int getBaseDamage(){
        return equipment.allItems().stream().mapToInt(Item::getBaseDamage).sum();
    }


    public float getDamageModifier(){return (float) equipment.allItems().stream().mapToDouble(Item::getDamageModifier).sum();}


    }

