package org.yyf.designPattern.behaviorStyle.mediatorPattern.demo1;

/**
 * Created by tobi on 16-9-9.
 */
public class Sale {
    AbstractMediator mediator;

    public Sale(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
