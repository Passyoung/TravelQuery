package src.algorithm;

public class TravelPlan {
    private int fromCity;
    private int toCity;
    private int startTime;
    private int timeLimit;
    private double moneyLimit;
    private int strategy; //旅行策略，选择最少金钱或最短时间方案 0为金钱最少，1为时间最短，2为同时考虑

    //选择策略0时的构造器
    public TravelPlan(int fromCity, int toCity, int startTime, double moneyLimit, int strategy) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.startTime = startTime;
        this.moneyLimit = moneyLimit;
        this.strategy = strategy;
    }

    //选择策略1时的构造器
    public TravelPlan(int fromCity, int toCity, int startTime, int timeLimit, int strategy) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.startTime = startTime;
        this.timeLimit = timeLimit;
        this.strategy = strategy;
    }

    //选择策略2时的构造器
    public TravelPlan(int fromCity, int toCity, int startTime, int timeLimit, double moneyLimit, int strategy) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.startTime = startTime;
        this.timeLimit = timeLimit;
        this.moneyLimit = moneyLimit;
        this.strategy = strategy;
    }

    public int getFromCity() {
        return fromCity;
    }

    public int getToCity() {
        return toCity;
    }


    public int getStartTime() {
        return startTime;
    }


    public int getTimeLimit() {
        return timeLimit;
    }


    public double getMoneyLimit() {
        return moneyLimit;
    }

    public int getStrategy() {
        return strategy;
    }

}
