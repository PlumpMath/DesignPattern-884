package org.yyf.designPattern.behaviorStyle.statePattern;

/**
 * Created by tobi on 16-9-19.
 */
public class CloseState extends State{
    @Override
    public void open() {
        System.out.println("打开");
//        super.context.setLiftState(Context.openningState); //置为敞门状态
//        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        
    }

    @Override
    public void stop() {

    }
}
