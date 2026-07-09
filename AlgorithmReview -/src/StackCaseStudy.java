import java.util.Stack;

public class StackCaseStudy {

    public static void main(String[] args) {

        Stack<String> undo = new Stack<>();

        undo.push("Type Data");
        undo.push("Type Structure");
        undo.push("Delete Structure");
        undo.push("Type Algorithm");
        undo.push("Type Java");

        System.out.println("Stack เริ่มต้น");
        System.out.println(undo);

        System.out.println("\nUndo 2 ครั้ง");

        if (!undo.isEmpty())
            System.out.println("Undo : " + undo.pop());

        if (!undo.isEmpty())
            System.out.println("Undo : " + undo.pop());

        System.out.println("\nStack หลัง Undo");
        System.out.println(undo);

        if (!undo.isEmpty()) {
            System.out.println("\nTop ของ Stack = " + undo.peek());
        }

        System.out.println("Stack ว่างหรือไม่ : " + undo.isEmpty());

        System.out.println("\nLIFO (Last In First Out)");
        System.out.println("ข้อมูลที่เพิ่มล่าสุดจะถูกนำออกก่อน");

        System.out.println("\nTime Complexity");
        System.out.println("push = O(1)");
        System.out.println("pop = O(1)");
        System.out.println("peek = O(1)");
    }
}