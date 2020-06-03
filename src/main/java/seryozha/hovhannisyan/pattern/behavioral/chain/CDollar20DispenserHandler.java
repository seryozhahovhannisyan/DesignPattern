package seryozha.hovhannisyan.pattern.behavioral.chain;

/**
 * Created by Serozh on 7/8/2017.
 */
public class CDollar20DispenserHandler implements CDispenseChainHandler {

    private CDispenseChainHandler chain;

    @Override
    public void setNextChain(CDispenseChainHandler nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(CCurrency cur) {
        if (cur.getAmount() >= 20) {
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0) {
                System.out.println("Itself 20$" + num);
                this.chain.dispense(new CCurrency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
