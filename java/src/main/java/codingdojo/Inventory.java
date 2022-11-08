package codingdojo;

public class Inventory {
    private final Equipment equipment;

    public Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getBaseDamage(){
        return equipment.getAllItems()
          .stream()
          .mapToInt(Item::getBaseDamage)
          .sum();
    }

    public float getDamageModifier(){
        return (float) equipment.getAllItems()
          .stream()
          .mapToDouble(Item::getDamageModifier)
          .sum();
    }
    }

