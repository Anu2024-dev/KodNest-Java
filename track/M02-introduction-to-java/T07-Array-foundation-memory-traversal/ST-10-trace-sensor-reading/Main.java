
public class Main {

    public static void main(String[] args) {
        int[] reading = {18, 21, 20, 24, 19};
        int correctionIndex = 2;
        int correction = 3;
        System.out.println("Reading count: " + reading.length);
        System.out.println("Before correction: " + reading[correctionIndex]);
        reading[correctionIndex] = correction;
        System.out.println("After correction: " + reading[correction]);
        System.out.println("Last valid index: " + (reading.length - 1));
    }
}
