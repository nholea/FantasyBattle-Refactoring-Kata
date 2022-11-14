package codingdojo;

class Player extends Target {
    private final Inventory inventory;
    private final Stats stats;

    Player(Inventory inventory, Stats stats) {
        this.inventory = inventory;
        this.stats = stats;
    }

    Damage calculateDamage(Target target) {
        int baseDamage = inventory.getBaseDamage();
        float damageModifier = getDamageModifier();
        int totalDamage = Math.round(baseDamage * damageModifier);
        int soak = getSoak(target, totalDamage);
        return new Damage(Math.max(0, totalDamage - soak));
    }

    private int getSoak(Target target, int totalDamage) {
        if (target instanceof SimpleEnemy){
            SimpleEnemy simpleEnemy = (SimpleEnemy) target;
               return simpleEnemy.getSoak();
        }
        return totalDamage;
    }

    private float getDamageModifier() {
        return inventory.getDamageModifier() + stats.getStrengthModifier();
    }
}
