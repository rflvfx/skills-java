import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        var nums = List.of(1, 2, 3, 4, 5, 6);
        var evens = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        var total = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(evens + " | " + total);
    }
}
- Document usage — iteration 3 (2015)
- Fix edge case — iteration 4 (2015)
- Add example — iteration 5 (2015)
