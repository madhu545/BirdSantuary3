public class BirdFactory {
    public static Bird getBird(String birds,String name){
        Bird bird = null;
        switch (birds){
            case"paroot":
                return new Parrot(name);
            case "duck":
                return new Duck(name);
            case "Crow":
                return new Crow(name);
            case "penguin":
                return new Penguin(name);
            default:
                return null;
        }
    }
}