package PACKAGE_NAME; //I don't know what this is, so I left it here
public class Main {
    public static void main(String[] args) {
       int resultOne = add(2,3);
       /*System.out.println(resultOne);*/ //Just testing stuff
       String resultTwo = greeting("Theo");
       /*System.out.println(resultTwo);*/
       int resultThree = add(1, 2, 3, 4);
       /*System.out.println(resultThree);*/
       printMe("It worked!");
    }
    public static int add(int numOne, int numTwo) {
        return numOne+numTwo;
    }
    public static String greeting(String name) {
        return "Bonjour, "+name;
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int onePlusTwo = add(numOne, numTwo);
        int threePlusFour = add(numThree,numFour);
        return add(onePlusTwo, threePlusFour);
    }
    public static void printMe(String userStringInput) {
        System.out.println(userStringInput);
    }

}
