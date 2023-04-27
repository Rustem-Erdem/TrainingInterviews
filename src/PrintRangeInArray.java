import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintRangeInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(range(1,25)));
    }
    public static int[] range(int a, int b){
        return IntStream.rangeClosed(a,b).toArray();
    }
}
