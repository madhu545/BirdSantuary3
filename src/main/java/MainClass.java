public class MainClass {
    public static void main(String args[])throws Exception{
        BirdSanctuaryManager birdSanctuarymanager = BirdSanctuaryManager.getInstance();
        BirdFactory birdFactory = new BirdFactory();

        Bird parrot = birdFactory.getBird("paroot", "p");
        Bird parrot1 = birdFactory.getBird("paroot", "p1");
        Bird parrot2 = birdFactory.getBird("paroot", "p2");
        Bird duck = birdFactory.getBird("duck", "d");
        Bird penguin = birdFactory.getBird("penguin", "p");
        Bird crow = birdFactory.getBird("crow" , "c");


        birdSanctuarymanager.add(null);
        birdSanctuarymanager.add(parrot);
        birdSanctuarymanager.add(parrot1);
        birdSanctuarymanager.add(parrot2);
        birdSanctuarymanager.add(duck);
        birdSanctuarymanager.add(penguin);
        birdSanctuarymanager.add(crow);

        System.out.println("Total birds =" + birdSanctuarymanager.getAllCount());

        birdSanctuarymanager.printSwimable();
        birdSanctuarymanager.printEatable();
        birdSanctuarymanager.printFlyable();

        System.out.println("parrots are " + parrot.getCount());
        System.out.println("penguin are " + penguin.getCount());
        System.out.println("duck are " + duck.getCount());
        System.out.println("crow are " + crow.getCount());
        System.out.println("Total birds =" + birdSanctuarymanager.getAllCount());
    }
}
