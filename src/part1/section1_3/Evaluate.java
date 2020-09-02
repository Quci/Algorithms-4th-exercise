package part1.section1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()) {
            // if read string is operator , push it onto ops
            String s = StdIn.readString();
            if (s.equals("(")) {

            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                ops.push(s);
            } else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                }
                vals.push(v);
            } else if(s.equals("end")) {
                break;
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
