public class Main {
    public static void main(String[] args) {
        //int num = 120;
        int num = 1534236469;
        System.out.println(reverseNumber(num));

    }

    public static int reverseNumber(int num) {
        int reversal = 0;
        boolean isNegative = num < 0;


        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;

            // Check for overflow before multiplying and adding
            //This will give the max value  the reversal can have before adding and multiplying
            if (reversal > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            reversal = reversal * 10 + digit;
            num /= 10;
        }

        return isNegative ? -reversal : reversal;


    }
}