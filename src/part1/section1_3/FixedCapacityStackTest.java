package part1.section1_3;
import java.util.Iterator;

public class FixedCapacityStackTest {
    public static void main(String[] args) {
        FixedCapacityStack s = new FixedCapacityStack();
        System.out.println("isEmpty: " + s.isEmpty());
        s.push("1fsd11");
        s.push("12dff12");
        s.push(321);
        s.push(true);
        s.push(1223);
        s.push(new String[]{"ww", "cve", "dfd", "oin"});
        System.out.println("size: " + s.size());
        String[] sa;
        sa = (String[]) s.pop();
        System.out.println(sa[1]);
        System.out.println(s.isEmpty());
        
        for (Iterator<?> it = s.iterator(); it.hasNext(); ) {
             System.out.println("val: " + it.next());
        }

        s.forEach(item -> System.out.println("item: " + item));
    }
}
