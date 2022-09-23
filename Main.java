public class Main {
    public static void main(String[] args) {
        // 1. 결과값 5를 출력
        int var1=5;
        int var2=2;
        double var3=(double) var1/var2;
        int var4=(int)(var3*var2);
        System.out.println("답: " + var4);

        // 2. 증감연산자 출력 (답:31)
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println("답: " + z);

        // 3. while문 사용, 주사위의 합
        while (true) {
            // 주사위 2개
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            System.out.println("(" + dice1 + "," + dice2 + ")");

            if (sum == 5) {
                System.out.println("합이 5가 되었습니다.");
                break;
            }
        }
    }
}