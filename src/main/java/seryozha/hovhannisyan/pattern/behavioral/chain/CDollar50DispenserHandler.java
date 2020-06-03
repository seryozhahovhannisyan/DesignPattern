package seryozha.hovhannisyan.pattern.behavioral.chain;

/**
 * Created by Serozh on 7/8/2017.
 */
public class CDollar50DispenserHandler implements CDispenseChainHandler {

    private CDispenseChainHandler chain;

    @Override
    public void setNextChain(CDispenseChainHandler nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(CCurrency cur) {
        if (cur.getAmount() >= 50) {
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0) {
                System.out.println("Itself 50$" + num);
                this.chain.dispense(new CCurrency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
