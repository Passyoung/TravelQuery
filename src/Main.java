package src;

import src.algorithm.BestStrategy;
import src.algorithm.BestStrategyByTime;
import src.algorithm.Schedule;
import src.algorithm.TransMap;
import src.algorithm.BestStrategyByAll;


public class Main {

    public static void main(String[] args) {
        TransMap transMap = new TransMap(11);
        Schedule[] timetables = transMap.loadTimetable();
        for (Schedule timetable : timetables) {
            transMap.addPath(timetable);
        }

        BestStrategyByAll bestStrategy = new BestStrategyByAll(transMap,10,6,24,2);
        System.out.println("the least price from chengdu to nanjing is " + bestStrategy.getDistTo(8)[0]+" and time consume is "+(int)bestStrategy.getDistTo(8)[1]);
        for (Schedule path : bestStrategy.pathTo(8)) {
            System.out.print("fromCity:" + path.getFromCity()+" ");
            System.out.print("toCity:" + path.getToCity()+" ");
            System.out.print("startTime:" + path.getStartTime()+" ");
            System.out.print("arrivetime:" + path.getArriveTime()+" ");
            System.out.print("price:" + path.getPrice()+" ");
            System.out.println("trainNumber:" + path.getIdNumber()+" ");
        }
    }
}
