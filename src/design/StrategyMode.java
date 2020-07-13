package design;

/**
 * @author baiyunlong
 * @title StrategyMode
 * @description 策略模式
 * @date 2020/6/22 19:13
 */
public class StrategyMode {
    public static String s = "Strategy Mode";
    public static void process(Processor processor, Object s) {
        System.out.println(processor.name());
        System.out.println(processor.process(s));
    }
    public static void main(String[] args) {
        Processor upCase = new UpCase();
        Processor lowCase = new LowCase();
        Processor stringLength = new StringLength();
        process(upCase, s);
        process(lowCase, s);
        process(stringLength, s);
    }
}

interface Processor {
    String name();

    Object process(Object input);
}

abstract class AbstractProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input);
}

/**
 * @description 策略一
 * @author baiyunlong
 * @date 2020/6/22 19:18
 **/
class UpCase extends AbstractProcessor {
    @Override
    public String process(Object input) {
        return input.toString().toUpperCase();
    }
}

/**
 * @description 策略二
 * @author baiyunlong
 * @date 2020/6/22 19:18
 **/
class LowCase extends AbstractProcessor {
    @Override
    public String process(Object input) {
        return input.toString().toLowerCase();
    }
}

/**
 * @description 策略三
 * @author baiyunlong
 * @date 2020/6/22 19:18
 **/
class StringLength extends AbstractProcessor {
    @Override
    public Integer process(Object input) {
        return input.toString().length();
    }
}


