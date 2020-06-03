package seryozha.hovhannisyan.pattern.behavioral.chain;

import java.util.Scanner;

/**
 * Created by Serozh on 7/8/2017.
 */
public class CATMDispenseChain {

    private CDispenseChainHandler c1;

    public CATMDispenseChain() {
        // initialize the chain
        this.c1 = new CDollar50DispenserHandler();
        CDispenseChainHandler c2 = new CDollar20DispenserHandler();
        CDispenseChainHandler c3 = new CDollar10DispenserHandler();

        // set the chain of responsibility
        System.out.println("c1");
        c1.setNextChain(c2);
        System.out.println("c2");
        c2.setNextChain(c3);
        System.out.println("c3");
    }

    public static void main(String[] args) {
        CATMDispenseChain atmDispenser = new CATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new CCurrency(amount));
        }

    }

}
