package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByteTestValue = 10;
        short myShortTestValue = 20;
        int myIntTestValue = 50;

        long myLongTestValue = 50_000L + 10L * (myByteTestValue + myShortTestValue + myIntTestValue);
        System.out.println("The Final Long Value is: " + myLongTestValue);

        //Casting better as doesn't allow over/underflow 
        short shortTotal = (short) (1000 + 10 * (myByteTestValue + myShortTestValue + myIntTestValue));
        System.out.println("The Final Short Value is: " + shortTotal);
    }
}
