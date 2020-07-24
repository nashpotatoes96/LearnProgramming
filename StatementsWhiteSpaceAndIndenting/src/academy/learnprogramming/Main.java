package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; //Statement

        if (myVariable == 50) {
            System.out.println("statement indented in a statement");
        }
        myVariable++; //Statement
        myVariable--; //Statement
        System.out.println("This is a complete java statement");
        System.out.println("this " +
                "is " +
                "another statement");

        int anotherVariable = 50;myVariable--;System.out.println("Statement 3 this line");
    }
}
