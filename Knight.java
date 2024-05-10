public class Knight extends Character {
    public Knight() {
        super("Knight", new Shield(), new SwingSword());
    }

    public void changeDefenseStrategy(DefenseStrategy defenseStrategy) {
        setDefenseStrategy(defenseStrategy);
    }

    public void changeAttackStrategy(AttackStrategy attackStrategy) {
        setAttackStrategy(attackStrategy);
    }
}
