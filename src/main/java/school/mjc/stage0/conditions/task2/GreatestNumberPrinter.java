package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        boolean biggest = first>second;
        if (biggest){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
}
