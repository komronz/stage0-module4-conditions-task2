package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        boolean check = from1UpTo1000 > 500;
        if (check){
            System.out.println("Tail");
        }else {
            System.out.println("Eagle");
        }
    }
}
