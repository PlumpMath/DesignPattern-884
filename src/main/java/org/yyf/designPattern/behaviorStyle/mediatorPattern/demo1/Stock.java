package org.yyf.designPattern.behaviorStyle.mediatorPattern.demo1;

/**
 * Created by tobi on 16-9-9.
 */
public class Stock {
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;
    AbstractMediator mediator;

    public Stock(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    //库存增加
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为:" + COMPUTER_NUMBER);
    }

    //库存降低
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为:" + COMPUTER_NUMBER);
    }

    //获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    //存货压力大了,就要通知采购人员不要采购,销售人员要尽快销售
    public void clearStock() {
        System.out.println("清理存货数量为:" + COMPUTER_NUMBER);
        mediator.execute("stock.clear");
    }
}
