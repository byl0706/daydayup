/**
 * @author baiyunlong
 * @title ExceptionTest
 * @description TODO
 * @date 2020/6/30 16:25
 */
public class ExceptionTest extends Inning implements Storm {

    public ExceptionTest() throws BaseballException {
    }

    @Override
    public void atBat() throws Foul {

    }

    @Override
    public void event() {

    }

    @Override
    public void rainHand() throws RainOut {

    }

    @Override
    public void walk() {
        super.walk();
    }
}

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        System.out.println("Inning:event()");
    }
    public abstract void atBat() throws Foul,Strike;
    public void walk() {}
}

class StormException extends Exception {}
class RainOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainOut;
    void rainHand() throws RainOut;
}