package codingdojo;

public class Inventory {
    private Equipment equipment;

    public Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    Equipment getEquipment() {
        return equipment;
    }


    public int getBaseDamage(){
        return equipment.getAllItems().stream().mapToInt(Item::getBaseDamage).sum();
    }


    public float getDamageModifier(){return (float) equipment.getAllItems().stream().mapToDouble(Item::getDamageModifier).sum();}


    }

