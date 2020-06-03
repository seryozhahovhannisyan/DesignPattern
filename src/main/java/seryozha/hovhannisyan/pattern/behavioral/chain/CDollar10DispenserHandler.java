package seryozha.hovhannisyan.pattern.behavioral.chain;

/**
 * Created by Serozh on 7/8/1017.
 */
public class CDollar10DispenserHandler implements CDispenseChainHandler {

    private CDispenseChainHandler chain;

    @Override
    public void setNextChain(CDispenseChainHandler nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(CCurrency cur) {
        if (cur.getAmount() >= 10) {
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0) {
                System.out.println("Itself 10$" + num);
                this.chain.dispense(new CCurrency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
