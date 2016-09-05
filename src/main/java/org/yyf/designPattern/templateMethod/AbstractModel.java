package org.yyf.designPattern.templateMethod;

/**
 * Created by tobi on 16-9-5.
 */
public abstract class AbstractModel {
    /**
     * 待子类去实现的方法
     */
    protected abstract void method1();

    private final void method2() {
        System.out.println("执行method2");
    }

    protected abstract void method3();

    /**
     * 待子类去实现的钩子方法
     *
     * @return 表明某个方法是否应该执行
     */
    protected abstract boolean canExecute();

    /**
     * 这是总的调用方法，决定其他小方法的组合逻辑,一般final，防止子类篡改逻辑
     */
    public final void run() {
        method1();
        if (canExecute()){
            method2();
        }
        method3();
    }
}
