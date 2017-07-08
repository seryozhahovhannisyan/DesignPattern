package seryozha.hovhannisyan.pattern.behavioral.visitor;

/**
 * Created by Serozh on 6/7/2017.
 */
public interface VShoppingCartVisitor {
    int visit(VBook book);
    int visit(VFruit fruit);
}
