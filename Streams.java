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
- Fix lint warnings — iteration 10 (2015)
- Extend coverage — iteration 24 (2015)
- Polish code — iteration 25 (2015)
- Tweak implementation — iteration 26 (2015)
- Extend coverage — iteration 27 (2015)
- Update docs — iteration 36 (2015)
- Fix edge case — iteration 37 (2015)
- Improve error handling — iteration 39 (2015)
- Fix lint warnings — iteration 45 (2015)
