public class Wizard extends Character {
    public Wizard() {
        super("Wizard", new CreateMagic(), new CastSpell());
    }

    public void changeDefenseStrategy(DefenseStrategy defenseStrategy) {
        setDefenseStrategy(defenseStrategy);
    }

    public void changeAttackStrategy(AttackStrategy attackStrategy) {
        setAttackStrategy(attackStrategy);
    }
}
