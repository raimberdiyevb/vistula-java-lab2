import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int bricks = random.nextInt(50,101);
        if(bricks % 2 == 0) bricks++;
        int containerCapacity = random.nextInt(5,11);
        if(containerCapacity % 2 != 0) containerCapacity++;
        System.out.println("Bricks     : " + bricks);
        System.out.println("Containers : " + containerCapacity);
        System.out.println("Full Containers : " + bricks/containerCapacity);
        System.out.println("All Containers  : " + ((bricks/containerCapacity) + 1));
        System.out.println("Remaining Blocks: " + bricks % containerCapacity);

    }
}
