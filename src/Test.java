import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] list = new ComparableCircle[3];
        list[0] = new ComparableCircle(5);
        list[1] = new ComparableCircle(6);
        list[2] = new ComparableCircle(2, "Black", true);

        System.out.println("Before sort: ");
        for (ComparableCircle x : list){
            System.out.println(x);
        }
        Arrays.sort(list);
        System.out.println("After sort: ");
        for (ComparableCircle x : list){
            System.out.println(x);
        }
    }
}
