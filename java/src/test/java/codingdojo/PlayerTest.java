package codingdojo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {

    // choose this one if you are familiar with mocks
    @Test
    void damageCalculationsWithMocks() {
        Inventory inventory = mock(Inventory.class);
        Stats stats = mock(Stats.class);
        SimpleEnemy target = mock(SimpleEnemy.class);
        Armor armor = mock(Armor.class);
        Equipment equipment = mock(Equipment.class);
        Item item = mock(Item.class);
        Item rightHandItem = mock(Item.class);

        when(inventory.getEquipment()).thenReturn(equipment);
        when(inventory.getEquipment().getLeftHand()).thenReturn(item);
        when(inventory.getEquipment().getRightHand()).thenReturn(rightHandItem);
        when(inventory.getEquipment().getHead()).thenReturn(item);
        when(inventory.getEquipment().getFeet()).thenReturn(item);
        when(inventory.getEquipment().getChest()).thenReturn(item);
        when(inventory.getEquipment().getRightHand().getBaseDamage()).thenReturn(10);
        when(inventory.getEquipment().getRightHand().getDamageModifier()).thenReturn(1.0f);
        when(stats.getStrength()).thenReturn(0);
        when(armor.getDamageSoak()).thenReturn(5);
        when(target.getArmor()).thenReturn(armor);

        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(5, damage.getAmount());
    }

    // choose this one if you are not familiar with mocks
    @Disabled("Test is not finished yet")
    @Test
    void damageCalculations() {
        Inventory inventory = new Inventory(null);
        Stats stats = new Stats(0);
        SimpleEnemy target = new SimpleEnemy(null, null);
        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(10, damage.getAmount());
    }
}
