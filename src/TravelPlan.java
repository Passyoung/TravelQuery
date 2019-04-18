public class TravelPlan {
    private int FromCity;
    private int ToCity;
    private int Strategy; //旅行策略，选择最少金钱或最短时间方案

    public void setFromCity(int PlanFromCity) {
        FromCity = PlanFromCity;
    }
    public int getFromCity(){
        return FromCity;
    }
    public void setToCity(int PlanToCity){
        ToCity = PlanToCity;
    }
    public int getToCity() {
        return ToCity;
    }
    public void setStrategy(int PlanStrategy) {
        Strategy = PlanStrategy;
    }
    public int getStrategy(){
        return Strategy;
    }
}
