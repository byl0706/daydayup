package design;

import design.example.*;

/**
 * @author baiyunlong
 * @title AdapterMode
 * @description 适配器模式
 * @date 2020/6/23 14:23
 */
public class AdapterMode {
    public static void main(String[] args) {
        WaveForm waveForm = new WaveForm();
        StrategyMode.process(new FilterAdapter(new LowPass(1.0)), waveForm);
        StrategyMode.process(new FilterAdapter(new HighPass(2.0)), waveForm);
        StrategyMode.process(new FilterAdapter(new BandPass(3.0, 4.0)), waveForm);
    }
}

class FilterAdapter implements Processor {
    private Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public WaveForm process(Object input) {
        return filter.process((WaveForm) input);
    }
}
