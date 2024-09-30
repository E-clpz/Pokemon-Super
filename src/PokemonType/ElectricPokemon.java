package PokemonType;

import Abstract.Pokemon;

public class ElectricPokemon extends Pokemon {
    private String fakeOut;
    private String voltTackle;
    private String voltSwitch;
    private String ironTail;

    //constructor
    public ElectricPokemon(String name, String fakeOut, String voltTackle, String voltSwitch, String ironTail) {
        super(name, "Electric");
        this.fakeOut = fakeOut;
        this.voltTackle = voltTackle;
        this.voltSwitch = voltSwitch;
        this.ironTail = ironTail;
    }

    //methods
    @Override
    public void attack(Pokemon pokemon) {
        switch (pokemon.getType()) {
            case "Water":
                System.out.println(getName() + " uses Thunder! It's Super Effective! ");
                break;
            default:
                System.out.println(getName() + " uses Tackle! ");
                break;
        }
    }

    public void fakeOut () {
        System.out.println(getName() + " uses Fake Out! ");
    }
    public void voltTackle () {
            System.out.println(getName() + " uses Volt Tackle! ");
    }
    public void voltSwitch () {
            System.out.println(getName() + " uses Volt Switch! ");
    }
    public void ironTail () {
            System.out.println(getName() + " uses Iron Tail! ");
    }

    //getters & setters
    public String getFakeOut() {
        return fakeOut;
    }

    public void setFakeOut(String fakeOut) {
        this.fakeOut = fakeOut;
    }

    public String getVoltTackle() {
        return voltTackle;
    }

    public void setVoltTackle(String voltTackle) {
        this.voltTackle = voltTackle;
    }

    public String getVoltSwitch() {
        return voltSwitch;
    }

    public void setVoltSwitch(String voltSwitch) {
        this.voltSwitch = voltSwitch;
    }

    public String getIronTail() {
        return ironTail;
    }

    public void setIronTail(String ironTail) {
        this.ironTail = ironTail;
    }
}