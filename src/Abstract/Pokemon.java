package Abstract;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private List<String> types;

    //constructor
    public Pokemon(String name, String type) {
        this.name = name;
        this.types = new ArrayList<String>();
        this.types.add(type);
    }

    public Pokemon(String name, List<String> types) {
            this.name = name;
            this.types = types;
    }

    //methods
    public void addType(String type) {
        this.types.add(type);
    }
    public void describe() {
        System.out.println(name + " is a " + types + "-type Pokémon.");
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return types.get(0);
    }

    public void setType(String type) {
        this.types.set(0, type);
    }

    //abstract
    public abstract void attack(Pokemon pokemon);
}

