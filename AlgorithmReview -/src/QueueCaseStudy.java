import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("P001");
        queue.offer("P002");
        queue.offer("P003");
        queue.offer("P004");
        queue.offer("P005");

        System.out.println("Queue เริ่มต้น");
        System.out.println(queue);

        System.out.println("\nเรียกผู้ป่วย 2 คน");

        if (!queue.isEmpty())
            System.out.println("รับบริการ : " + queue.remove());

        if (!queue.isEmpty())
            System.out.println("รับบริการ : " + queue.remove());

        queue.offer("P006");
        queue.offer("P007");

        System.out.println("\nผู้ป่วยคนถัดไป = " + queue.peek());

        System.out.println("จำนวนผู้ป่วยที่รอ = " + queue.size());

        System.out.println("\nQueue ปัจจุบัน");
        System.out.println(queue);

        System.out.println("Queue ว่างหรือไม่ : " + queue.isEmpty());

        System.out.println("\nFIFO (First In First Out)");
        System.out.println("คนที่เข้าคิวก่อนจะได้รับบริการก่อน");

        System.out.println("\nTime Complexity");
        System.out.println("offer = O(1)");
        System.out.println("remove = O(1)");
        System.out.println("peek = O(1)");
    }
}