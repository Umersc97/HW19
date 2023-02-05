public class cATester {

    public static void main(String[] args) {

        cA objA = new cA();
        objA.printA();

        cB objB = new cB();
        objB.printA();
        objA.printA();

        cC objC = new cC();
        objC.printA();
        objC.printB();
        objC.printC();

    }
}
