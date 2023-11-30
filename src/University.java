public class University {
    String name;
    void batch() {
        System.out.println("Batch 22");
    }
}
class Collage extends University {
    int grade;
    @Override
    void batch() {
        System.out.println("Grade 13 Batch");
    }
}
class testRun {
    public static void main(String[] args) {
        University a = new Collage();
        a.name = "UOC";
        Collage c = (Collage) a ;
        c.grade = 13;
        System.out.println(c.name);
        System.out.println(c.grade);
        c.batch();
    }
}
