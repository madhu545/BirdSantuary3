import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {
    //List<Bird> birdList = new ArrayList<>();
    Set<Bird> birdList = new HashSet<>();
    private static BirdSanctuaryManager instance;
    public static BirdSanctuaryManager getInstance(){
        if (instance == null){
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    private BirdSanctuaryManager() {

    }

    public void add(Bird bird) {
        try {
            if (bird == null) {
                throw new BirdSanctuaryException("null not allowed");
            } else {
                birdList.add(bird);
                bird.incrementCount();
            }
        } catch (BirdSanctuaryException e) {
            e.printStackTrace();
        }
    }

    public void remove(Bird bird) throws BirdSanctuaryException{
        birdList.remove(bird);
        bird.decrement();
    }

    public int getAllCount(){
        return birdList.size();
    }

    public void printSwimable(){
        birdList.stream().filter(bird -> bird instanceof Swimable).forEach(bird -> ((Swimable)bird).swin());
    }

    public void printFlyable(){
        birdList.stream().filter(bird -> bird instanceof Flyable).forEach(bird -> ((Flyable)bird).fly());
    }

    public void printEatable(){
        birdList.stream().forEach(bird -> (bird).eat());
    }


}
