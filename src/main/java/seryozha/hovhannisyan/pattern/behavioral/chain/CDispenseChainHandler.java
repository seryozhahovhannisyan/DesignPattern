package seryozha.hovhannisyan.pattern.behavioral.chain;

/**
 * Created by Serozh on 7/8/2017.
 */
public interface CDispenseChainHandler {

    void setNextChain(CDispenseChainHandler nextChain);

    void dispense(CCurrency cur);

}
