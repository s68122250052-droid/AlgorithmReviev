public class ArrayCaseStudy {

    public static void main(String[] args) {

        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int pass = 0;

        System.out.println("คะแนนนักศึกษา");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " = " + scores[i]);

            sum += scores[i];

            if (scores[i] > max)
                max = scores[i];

            if (scores[i] < min)
                min = scores[i];

            if (scores[i] >= 7)
                pass++;
        }

        double average = (double) sum / scores.length;

        System.out.println("\nผลลัพธ์");
        System.out.println("คะแนนรวม = " + sum);
        System.out.println("คะแนนเฉลี่ย = " + average);
        System.out.println("คะแนนสูงสุด = " + max);
        System.out.println("คะแนนต่ำสุด = " + min);
        System.out.println("นักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป = " + pass + " คน");

        System.out.println("\nนักศึกษาที่ควรได้รับการทบทวน");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.println("Student " + (i + 1) + " คะแนน = " + scores[i]);
            }
        }

        System.out.println("\nTime Complexity : O(n)");
    }
}