import java.util.ArrayList;
import java.util.Iterator;

public class FishArrayList {
    public static void main(String[] args) {
        Fish fish1 = new Fish("SwordFish", "Gray", "North", "SaltWater");
        Fish fish2 = new Fish("Pomfret", "White", "West", "LakeWater");
        Fish fish3 = new Fish("Mackerel", "WhiteGray", "South", "SaltWater");
        Fish fish4 = new Fish("BombayDuck", "White", "East", "SaltWater");
        Turtle t1 = new Turtle(100, "SeaTurtle");
        Turtle t2 = new Turtle(200, "Soft shell Turtle");
        Turtle t3 = new Turtle(300, "SnappingTurtle");
        Frog frog1 = new Frog("True Frog", "brown");
        Frog frog2 = new Frog("Grass Frog", "green");
        Frog frog3 = new Frog("South American", "brown");
        Frog frog4 = new Frog("Pond Frog", "red");
        Frog frog5 = new Frog("Poison dart", "yellowish black");
        Dragonfly dragonfly1 = new Dragonfly("Darners", "greenish black");
        Dragonfly dragonfly2 = new Dragonfly("Skimmers", "red");
        Dragonfly dragonfly3 = new Dragonfly("Macromia", " black");


        ArrayList myFishPond = new ArrayList();
        myFishPond.add(fish1);
        myFishPond.add(fish2);
        myFishPond.add(t1);
        myFishPond.add(fish3);
        myFishPond.add(t2);
        myFishPond.add(fish3);
        myFishPond.add(t3);
        myFishPond.add(frog1);
        myFishPond.add(frog2);
        myFishPond.add(frog3);
        myFishPond.add(frog4);
        myFishPond.add(frog5);
        myFishPond.add(dragonfly1);
        myFishPond.add(dragonfly2);
        myFishPond.add(dragonfly3);
        myFishPond.add(dragonfly1);

        System.out.println("myFishPondList contains: " + myFishPond);

        Iterator myIterator = myFishPond.iterator();
        while (myIterator.hasNext()) {

            Object obj = myIterator.next();

            if (obj instanceof Turtle) {
                Turtle t = (Turtle) obj;
                System.out.println("The Turtle : " + t);
            } else if (obj instanceof Fish) {
                Fish theFish = (Fish) obj;
                System.out.println("Fish is : " + theFish);
            } else if (obj instanceof Frog) {
                Frog theFrog = (Frog) obj;
                System.out.println("Frog is : " + theFrog);
            }
            else{
                Dragonfly theDragonfly = (Dragonfly) obj;
                System.out.println("Dragonfly is : " + theDragonfly);
            }
        }

        System.out.println("=================================================================");

        t1.start();
        t2.start();
        t3.start();
        fish1.start();
        fish2.start();
        fish3.start();
        frog1.start();
        frog2.start();
        frog3.start();
        frog4.start();
        frog5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            fish1.join();
            fish2.join();
            fish3.join();
            frog1.join();
            frog2.join();
            frog3.join();
            frog4.join();
            frog5.join();

        }

        catch (InterruptedException e){
            System.out.println("Some problem :" + e.getMessage());
        }

    }

    static class Turtle extends Thread{
        int age;
        String turtleType;

        public Turtle(int age, String turtleType) {
            this.age = age;
            this.turtleType = turtleType;
        }

        @Override
        public String toString() {
            return "Turtle{" +
                    "age=" + age +
                    ", turtleType='" + turtleType + '\'' +
                    '}';
        }
        void swim(){
            System.out.println("All the species of turtle can swim .");
        }

        public void run(){
            swim();
        }
    }

    static class Fish extends Thread {
        String fishName;
        String color;
        String swimDirection;
        String waterType;

        public Fish(String fishName, String color, String swimDirection, String waterType) {
            this.fishName = fishName;
            this.color = color;
            this.swimDirection = swimDirection;
            this.waterType = waterType;
        }

        @Override
        public String toString() {
            return "Fish{" +
                    "fishName='" + fishName + '\'' +
                    ", color='" + color + '\'' +
                    ", swimDirection='" + swimDirection + '\'' +
                    ", waterType='" + waterType + '\'' +
                    '}';
        }
        void swim(){
            System.out.println("All the species of fish can swim.");
        }
        public void run(){
            swim();
        }
    }

    static class Frog extends Thread {
        String frogType;
        String color;

        public Frog(String frogType, String color) {
            this.frogType = frogType;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Frog{" +
                    "frogType='" + frogType + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        void swim(){
            System.out.println("All the species of frog can swim under water and live on land.");
        }
        public void run(){
            swim();
        }
    }

    static class Dragonfly{
        String dragonflyName;
        String dragonflyColor;

        public Dragonfly(String dragonflyName, String dragonflyColor) {
            this.dragonflyName = dragonflyName;
            this.dragonflyColor = dragonflyColor;
        }

        @Override
        public String toString() {
            return "Dragonfly{" +
                    "dragonflyName='" + dragonflyName + '\'' +
                    ", dragonflyColor='" + dragonflyColor + '\'' +
                    '}';
        }
    }
}




