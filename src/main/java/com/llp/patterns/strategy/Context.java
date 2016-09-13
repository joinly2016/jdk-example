package com.llp.patterns.strategy;

/**
 * 作者： Joinly
 * 时间： 2016/7/28
 * 描述： 策略模式（Strategy） 环境角色.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.doSomething();
    }

    public static void main(String[] args) {
        Context context = null;

        context = new Context(new ConcreteStrategyA());
        context.doSomething();

        context = new Context(new ConcreteStrategyB());
        context.doSomething();

        context = new Context(new ConcreteStrategyC());
        context.doSomething();

    }
}
