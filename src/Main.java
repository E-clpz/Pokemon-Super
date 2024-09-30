import PokemonType.ElectricPokemon;
import PokemonType.FirePokemon;
import PokemonType.WaterPokemon;
import PokemonType.GrassPokemon;

public class Main {
    public static void main(String[] args) {

        GrassPokemon ivysaur = new GrassPokemon("Ivysaur", "Knock Off", "Sludge Bomb", "Giga Drain", "Synthesis");
        ElectricPokemon pichu = new ElectricPokemon("Pichu", "Fake Out", "Volt Tackle", "Giga Drain", "Synthesis");
        FirePokemon vulpix = new FirePokemon("Vulpix", "Fire Blast", "Weather Ball", "Energy Ball", "Hypnosis");
        WaterPokemon vaporeon = new WaterPokemon("Vaporeon", "Wish" , "Protect", "Scald", "Toxic");

        vulpix.describe();
        vulpix.attack(ivysaur);
        vulpix.attack(vaporeon);
        vulpix.attack(pichu);
        vulpix.fireBlast();
        vulpix.weatherBall();
        vulpix.energyBall();
        vulpix.hypnosis();

        vaporeon.describe();
        vaporeon.attack(ivysaur);
        vaporeon.attack(pichu);
        vaporeon.attack(vulpix);
        vaporeon.wish();
        vaporeon.protect();
        vaporeon.scald();
        vaporeon.toxic();

        ivysaur.describe();
        ivysaur.attack(vulpix);
        ivysaur.attack(pichu);
        ivysaur.attack(vaporeon);
        ivysaur.knockOff();
        ivysaur.sludgeBomb();
        ivysaur.gigaDrain();
        ivysaur.synthesis();

        pichu.describe();
        pichu.attack(vaporeon);
        pichu.attack(ivysaur);
        pichu.attack(vulpix);
        pichu.fakeOut();
        pichu.voltTackle();
        pichu.voltSwitch();
        pichu.ironTail();
    }
}
