package PokemonType;

import Abstract.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private String knockOff;
    private String sludgeBomb;
    private String gigaDrain;
    private String synthesis;

    //constructor
    public GrassPokemon(String name, String knockOff, String sludgeBomb, String gigaDrain, String synthesis) {
        super(name, new ArrayList<>(List.of("Grass", "Poison")));
        this.knockOff = knockOff;
        this.sludgeBomb = sludgeBomb;
        this.gigaDrain = gigaDrain;
        this.synthesis = synthesis;
    }

    //methods
    @Override
    public void attack(Pokemon pokemon) {
        switch (pokemon.getType()) {
            case "Water":
                System.out.println(getName() + " uses Giga Drain! It's Super Effective! ");
                break;
            default:
                System.out.println(getName() + " uses Knock Off! ");
                break;
        }
    }

    public void knockOff() {
        System.out.println(getName() + " uses Giga Drain! ");
    }

    public void sludgeBomb() {
        System.out.println(getName() + " uses Sludge Bomb! ");
    }

    public void gigaDrain() {
        System.out.println(getName() + " uses Giga Drain! ");
    }

    public void synthesis() {
        System.out.println(getName() + " uses Synthesis! ");
    }

    //getters & setters
    public String getKnockOff() {
        return knockOff;
    }

    public void setKnockOff(String knockOff) {
        this.knockOff = knockOff;
    }

    public String getSludgeBomb() {
        return sludgeBomb;
    }

    public void setSludgeBomb(String sludgeBomb) {
        this.sludgeBomb = sludgeBomb;
    }

    public String getGigaDrain() {
        return gigaDrain;
    }

    public void setGigaDrain(String gigaDrain) {
        this.gigaDrain = gigaDrain;
    }

    public String getSynthesis() {
        return synthesis;
    }

    public void setSynthesis(String synthesis) {
        this.synthesis = synthesis;
    }
}