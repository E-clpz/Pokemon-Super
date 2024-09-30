package PokemonType;

import Abstract.Pokemon;

public class FirePokemon extends Pokemon {
    private String fireBlast;
    private String weatherBall;
    private String energyBall;
    private String hypnosis;

    //constructor
    public FirePokemon(String name, String fireBlast, String weatherBall, String energyBall, String hypnosis) {
        super(name, "Fire");
        this.fireBlast = fireBlast;
        this.weatherBall = weatherBall;
        this.energyBall = energyBall;
        this.hypnosis = hypnosis;
    }

    //methods
    @Override
    public void attack(Pokemon pokemon) {
        switch (pokemon.getType()) {
            case "Grass":
                System.out.println(getName() + " uses Fire Blast! It's Super Effective! ");
                break;
            default:
                System.out.println(getName() + " uses Weather Ball! ");
                break;
        }
    }

    public void fireBlast() {
        System.out.println(getName() + " uses Fire Blast! ");
    }

    public void weatherBall() {
        System.out.println(getName() + " uses Weather Ball! ");
    }

    public void energyBall() {
        System.out.println(getName() + " uses Energy Ball! ");
    }

    public void hypnosis() {
        System.out.println(getName() + " uses Hypnosis! ");
    }

    //getters & setters
    public String getFireBlast() {
        return fireBlast;
    }

    public void setFireBlast(String fireBlast) {
        this.fireBlast = fireBlast;
    }

    public String getWeatherBall() {
        return weatherBall;
    }

    public void setWeatherBall(String weatherBall) {
        this.weatherBall = weatherBall;
    }

    public String getEnergyBall() {
        return energyBall;
    }

    public void setEnergyBall(String energyBall) {
        this.energyBall = energyBall;
    }

    public String getHypnosis() {
        return hypnosis;
    }

    public void setHypnosis(String hypnosis) {
        this.hypnosis = hypnosis;
    }
}