package hero.squad;
//import org.junit.*;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        Hero myHero = new Hero("Vick",65,"meme","madem");
        assertEquals(true, myHero instanceof Hero);
    }
    @Test
    public void getName_forHeroesName_String() {
        Hero myHero = new Hero("Vick",65,"meme","madem");
        String expected = "Vick";
        assertEquals(expected, myHero.getName());
    }
    @Test
    public void getAge_forHeroesName_String() {
        Hero myHero = new Hero("Vick",65,"meme","madem");
        int expected = 65;
        assertEquals(expected, myHero.getAge());
    }
    @Test
    public void getWeakness_forHeroesName_String() {
        Hero myHero = new Hero("Vick",65,"meme","madem");
        String expected = "madem";
        assertEquals(expected, myHero.getWeakness());
    }
    @Test
    public void getPower_forHeroesName_String() {
        Hero myHero = new Hero("Vick",65,"meme","madem");
        String expected = "meme";
        assertEquals(expected, myHero.getPower());
    }
    @Test
    public void getId_forHeroesName_int() {
        Hero.clear();
        Hero myHero = new Hero("Vick",65,"meme","madem");
        assertEquals(1, myHero.getId());
    }

}

