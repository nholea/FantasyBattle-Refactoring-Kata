package codingdojo;

import java.util.List;

public class SimpleEnemy extends Target {

    private final Armor armor;
    private final List<Buff> buffs;

    public SimpleEnemy(Armor armor, List<Buff> buffs) {
        this.armor = armor;
        this.buffs = buffs;
    }

    public int getSoak() {
        return Math.round(
          armor.getDamageSoak() *
            BuffCollections.getSoakModifier(buffs)
        );
    }
}
