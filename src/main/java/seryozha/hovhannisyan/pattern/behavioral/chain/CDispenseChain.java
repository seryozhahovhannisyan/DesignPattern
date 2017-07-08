package seryozha.hovhannisyan.pattern.behavioral.chain;

/**
 * Created by Serozh on 7/8/2017.
 */
public interface CDispenseChain {

    void setNextChain(CDispenseChain nextChain);

    void dispense(CCurrency cur);

}
