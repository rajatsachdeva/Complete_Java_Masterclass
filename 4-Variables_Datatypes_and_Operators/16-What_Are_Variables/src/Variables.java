public class Variables {

    public static void main( String[] args) {
        System.out.println("Variables");

        int myFirstNumber   = 5;
        System.out.println("myFirstNumber = " +  myFirstNumber);

        myFirstNumber       = 10;
        System.out.println("myFirstNumber = " +  myFirstNumber);

        myFirstNumber       = 5 + 10;
        System.out.println("myFirstNumber = " +  myFirstNumber);

        myFirstNumber       = (5 + 10) + (2 * 10);
        System.out.println("myFirstNumber = " +  myFirstNumber);

        int mySecondNumber  = 12;
        int myThirdNumber   = 6;

        int myTotal         = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("myTotal = " + myTotal);

        myThirdNumber       = myFirstNumber * 2;
        myTotal             = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("myTotal = " + myTotal);

        int myDiff      = 1000 - myTotal;
        System.out.println("difference = " + myDiff);
    }
}
