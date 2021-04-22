public class MultiplesOfThreeAndFive {
    public int solution(int number) {
        int i;
        int sum = 0;
        for (i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " is a multiple of 3 or 5.");
                sum += i;
            }
        }
        System.out.println("The sum of the multiples of 3 and 5 that are below the number " + number + ", is " + sum + ".");
        return sum;
    }
}
