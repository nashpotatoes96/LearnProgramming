public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count !=6) {
            System.out.println("Count is " + count);
            count++;
        }

        System.out.println("***********");

        for (int i=1; i!=6; i++) {
            System.out.println("Count is " + i);
        }

        System.out.println("***********");

        count = 1;
        while (true) {
            if (count ==6) {
                break;
            }
            System.out.println("Count is " + count);
            count++;
        }

        System.out.println("***********");

        count = 1;
        do {
            System.out.println("Count is " + count);
            count++;
        } while (count != 6);

        System.out.println("***********");

        int number = 4;
        int finishNumber = 20;
        int challengeCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            challengeCount++;
            System.out.println("Even number " + number);
            if (challengeCount >= 5)
                break;
        }
        System.out.println("Total number of even numbers found is " + challengeCount);

        System.out.println("***********");

    }

    public static boolean isEvenNumber (int number) {
        return (number % 2 == 0);
    }
}
