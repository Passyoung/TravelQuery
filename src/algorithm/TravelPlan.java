package algorithm;
public class TravelPlan {
    private int fromCity;
    private int toCity;
    private int strategy; //旅行策略，选择最少金钱或最短时间方案

    public void setFromCity(int PlanFromCity) {
        fromCity = PlanFromCity;
    }

    public int getFromCity() {
        return fromCity;
    }

    public void setToCity(int PlanToCity) {
        toCity = PlanToCity;
    }

    public int getToCity() {
        return toCity;
    }

    public void setStrategy(int PlanStrategy) {
        strategy = PlanStrategy;
    }

    public int getStrategy() {
        return strategy;
    }

    public void strategyLeastMoney() {//花最少钱策略
        assert true;//待开发
    }
}
