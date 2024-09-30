package PokemonType;

import Abstract.Pokemon;

public class WaterPokemon extends Pokemon {
    private String Wish;
    private String Protect;
    private String Scald;
    private String Toxic;

    //constructor
    public WaterPokemon(String name, String Wish, String Protect, String Scald, String Toxic) {
        super(name, "Water");
        this.Wish = Wish;
        this.Protect = Protect;
        this.Scald = Scald;
        this.Toxic = Toxic;
    }

    //methods
    @Override
    public void attack(Pokemon pokemon) {
        switch (pokemon.getType()) {
            case "Fire":
                System.out.println(getName() + " uses Scald! It's Super Effective! ");
                break;
            default:
                System.out.println(getName() + " uses Toxic! ");
                break;
        }
    }

    public void wish() {
        System.out.println(getName() + " uses Wish! ");
    }

    public void protect() {
        System.out.println(getName() + " uses Protect! ");
    }

    public void scald() {
        System.out.println(getName() + " uses Scald! ");
    }

    public void toxic() {
        System.out.println(getName() + " uses Toxic! ");
    }

    //getters & setters
    public String getWish() {
        return Wish;
    }

    public void setWish(String Wish) {
        this.Wish = Wish;
    }

    public String getProtect() {
        return Protect;
    }

    public void setProtect(String Protect) {
        this.Protect = Protect;
    }

    public String getScald() {
        return Scald;
    }

    public void setScald(String Scald) {
        this.Scald = Scald;
    }

    public String getToxic() {
        return Toxic;
    }

    public void setToxic(String Toxic) {
        this.Toxic = Toxic;
    }
}