import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAddmethod {
    @Test
    public void add(){
        BirdSanctuaryManager birdSanctuarymanager =  BirdSanctuaryManager.getInstance();
        Parrot parrot = new Parrot("p");
        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Parrot parrot4 = new Parrot("p4");
        Duck duck = new Duck("d");
        Penguin penguin  = new Penguin("pn");
        Crow crow = new Crow("c");
        Crow crow1 = new Crow("c");

        birdSanctuarymanager.add(null);
        birdSanctuarymanager.add(parrot);
        birdSanctuarymanager.add(parrot1);
        birdSanctuarymanager.add(parrot2);
        birdSanctuarymanager.add(parrot3);
        birdSanctuarymanager.add(duck);
        birdSanctuarymanager.add(penguin);
        birdSanctuarymanager.add(crow);
        birdSanctuarymanager.add(crow1);

        int result = birdSanctuarymanager.getAllCount();
        Assertions.assertEquals(7,result);
    }
}
