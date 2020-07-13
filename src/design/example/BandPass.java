package design.example;

/**
 * @author baiyunlong
 * @title BandPass
 * @description BandPass
 * @date 2020/6/23 14:37
 */
public class BandPass extends Filter {
    private double lowCutOff;
    private double highCutOff;
    public BandPass(double lowCutOff, double highCutOff) {
        this.lowCutOff = lowCutOff;
        this.highCutOff = highCutOff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}
