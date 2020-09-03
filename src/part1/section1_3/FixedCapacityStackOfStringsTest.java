package part1.section1_3;

public class FixedCapacityStackOfStringsTest {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        System.out.println(s.isEmpty());
        s.push("wwe");
        s.push("fr");
        s.push("123");
        s.push("4444");
        s.push("tyu");
        System.out.println(s.size());
        System.out.println(s.pop());

    }
}
