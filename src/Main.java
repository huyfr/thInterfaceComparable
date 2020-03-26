import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle("indigo", false, 3.5);

        System.out.println("Pre-sort:");
        for (ComparableCircle elements : comparableCircles){
            System.out.println(elements.toString());
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sort:");
        for (ComparableCircle elements : comparableCircles){
            System.out.println(elements.toString());
        }
    }
}