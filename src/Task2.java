public class Task2 {
    public static void main(String[] args) {
        float marsGravity = 0.38f;
        float usersWeight = 73.5f;
        float usersWeightOnMars = usersWeight * marsGravity;
        double weightInKgOnEarthDouble = (double)usersWeight;
        double weightInKgOnMarsDouble = (double)usersWeightOnMars;
        System.out.println("User's weight on Earth FLOAT : " + usersWeight);
        System.out.println("User's weight on Mars FLOAT :  " + usersWeight * marsGravity );
        System.out.println("User's weight on Mars DOUBLE :  " + weightInKgOnMarsDouble);
        System.out.print("User's weight on Mars DOUBLE FOUR DECIMAL : ");
        System.out.printf("%.4f",weightInKgOnMarsDouble);
        System.out.println();
        System.out.println("User's weight on Mars INTEGER : " + (int)weightInKgOnMarsDouble);
        char c = (char)weightInKgOnMarsDouble;
        System.out.println("User's weight on Mars ASCII : " + c);
        int math = c * 4;
        System.out.println("User's weight on Mars MATH ON CHAR : " + math);

    }
}