package codingdojo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {

  private final int DAMAGE_SOAK = 5;

  private final int STRENGTH = 0;

  @ParameterizedTest
  @CsvSource({"10, 1.0f,5", "10,2.4f,19", "10, 2.5f,20", "10, 3.7f,32", "10,5.1f,46"})
  void calculatesDamageWhenPlayerIsEquippedWithFlashySwordOfDangerInHisRightHandAndOtherItems(int baseDamage, float damageModifier,
    int expectedDamage) {
    Inventory inventory = mock(Inventory.class);
    Stats stats = mock(Stats.class);
    SimpleEnemy target = mock(SimpleEnemy.class);
    when(inventory.getBaseDamage()).thenReturn(baseDamage);
    when(inventory.getDamageModifier()).thenReturn(damageModifier);
    when(stats.getStrength()).thenReturn(STRENGTH);
    when(target.getSoak()).thenReturn(DAMAGE_SOAK);

    Damage damage = new Player(inventory, stats).calculateDamage(target);

    assertEquals(expectedDamage, damage.getAmount());
  }

  @ParameterizedTest
  @CsvSource({"20, 1.5f,25", "20,2.9f,53", "20, 3.0f,55", "20, 4.2f,79", "20,5.6f,107"})
  void calculatesDamageWhenPlayerIsEquippedWithExcaliburInHisRightHandAndOtherItems(int baseDamage, float damageModifier,
    int expectedDamage) {
    Inventory inventory = mock(Inventory.class);
    Stats stats = mock(Stats.class);
    SimpleEnemy target = mock(SimpleEnemy.class);
    when(inventory.getBaseDamage()).thenReturn(baseDamage);
    when(inventory.getDamageModifier()).thenReturn(damageModifier);
    when(stats.getStrength()).thenReturn(STRENGTH);
    when(target.getSoak()).thenReturn(DAMAGE_SOAK);

    Damage damage = new Player(inventory, stats).calculateDamage(target);

    assertEquals(expectedDamage, damage.getAmount());
  }
}
