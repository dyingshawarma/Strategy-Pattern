public abstract class Character {
    private String type;
    private DefenseStrategy defenseStrategy;
    private AttackStrategy attackStrategy;

    public Character(String type, DefenseStrategy defenseStrategy, AttackStrategy attackStrategy) {
        this.type = type;
        this.defenseStrategy = defenseStrategy;
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }

    public String getType() {
        return type;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
