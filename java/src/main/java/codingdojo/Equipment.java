package codingdojo;


import java.util.List;

class Equipment {
    private final Item leftHand;
    private final Item rightHand;
    private final Item head;
    private final Item feet;
    private final Item chest;

    Equipment(Item leftHand, Item rightHand, Item head, Item feet, Item chest) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.head = head;
        this.feet = feet;
        this.chest = chest;
    }

    List<Item> getAllItems() {
        return List.of(leftHand, rightHand, head, feet, chest);
    }

    public int getBaseDamage(){
        return getAllItems()
          .stream()
          .mapToInt(Item::getBaseDamage)
          .sum();
    }
}
