package design.example;

/**
 * @author baiyunlong
 * @title HighPass
 * @description HighPass
 * @date 2020/6/23 14:32
 */
public class HighPass extends Filter {
    private double cutOff;
    public HighPass(double cutOff) {
        this.cutOff = cutOff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}
