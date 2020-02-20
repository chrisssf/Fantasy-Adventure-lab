package players.magic;

import players.Player;
import players.magic.creatures.Creature;

public abstract class MagicPlayer extends Player {

    private Spell spell;
    private Creature creature;

    public MagicPlayer(String name, Spell spell, Creature creature){
        super(name);
        this.spell = spell;
        this.creature = creature;

    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCreature() {
        return creature;
    }
}