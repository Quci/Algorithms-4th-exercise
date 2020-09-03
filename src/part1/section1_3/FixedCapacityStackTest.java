package part1.section1_3;

public class FixedCapacityStackTest {
    public static void main(String[] args) {
        FixedCapacityStack s = new FixedCapacityStack(100);
        System.out.println(s.isEmpty());
        s.push("111");
        s.push(321);
        s.push(true);
        s.push(1223);
        s.push(new String[]{"ww", "cve", "dfd", "oin"});
        System.out.println(s.size());
        String[] sa;
        sa = (String[]) s.pop();
        System.out.println(sa[1]);
        System.out.println(s.isEmpty());
    }
}
