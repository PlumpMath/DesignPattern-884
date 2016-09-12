package org.yyf.designPattern.behaviorStyle.mediatorPattern.demo1;

/**
 * Created by tobi on 16-9-9.
 */
public class Purchase {
    AbstractMediator mediator;

    public Purchase(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    //采购IBM电脑
    public void buyIBMcomputer(int number) {
        mediator.execute("purchase.buy", number);
    }

    //不再采购IBM电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
