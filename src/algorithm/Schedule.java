package src.algorithm;

import com.google.gson.Gson;

//记录路径
//城市编号 北京：0 上海：1 南京：2 杭州：3 广州：4 武汉：5 成都：6 西安：7 哈尔滨：8 呼和浩特：9 乌鲁木齐：10
public class Schedule {
    private int fromCity;
    private int toCity;
    private int startTime;
    private int arriveTime;
    private int timeTaken;
    private double price;
    private String idNumber;

    public Schedule(int fromCity, int toCity, int startTime, int arriveTime, int timeTaken, double price, String idNumber) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.startTime = startTime;
        this.arriveTime = arriveTime;
        this.timeTaken = timeTaken;
        this.price = price;
        this.idNumber = idNumber;
    }
//
//    public void setFromCity(int fromCity) {
//        this.fromCity = fromCity;
//    }
//
//    public void setToCity(int toCity){
//        this.toCity = toCity;
//    }
//
//    public void setStartTime(int startTime) {
//        this.startTime = startTime;
//    }
//
//    public void setArriveTime(int arriveTime) {
//        this.arriveTime = arriveTime;
//    }
//
//    public void setTimeTaken(int timeTaken) {
//        this.timeTaken = timeTaken;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setIdNumber(String idNumber) {
//        this.idNumber = idNumber;
//    }

    public int getFromCity() {
        return fromCity;
    }

    public int getToCity() {
        return toCity;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getArriveTime() {
        return arriveTime;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public double getPrice() {
        return price;
    }

    public String getIdNumber() { return idNumber; }
}
