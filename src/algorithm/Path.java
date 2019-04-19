package algorithm;
//记录路径
public class Path {
    private final String fromCity;
    private final String toCity;
    private final String startTime;
    private final String arriveTime;
    private final String timeTaken;
    private final int price;

    public Path(String fromCity,String toCity,String startTime,String arriveTime,String timeTaken,int price) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.startTime = startTime;
        this.arriveTime = arriveTime;
        this.timeTaken = timeTaken;
        this.price = price;
    }
}
