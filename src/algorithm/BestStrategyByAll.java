package src.algorithm;


public class BestStrategyByAll {
    private double[][] distTo;
    private Schedule[] pathTo;
    private IndexMinPQ<Double> pq;
    private int curTime;//现在的时间
    private int timeLimit;
    private int trans;


    public BestStrategyByAll(TransMap transMap, int s,int curTime,int timeLimit,int trans) {
        distTo = new double[transMap.getNumOfCity()][3];
        pathTo = new Schedule[transMap.getNumOfCity()];
        this.curTime = curTime;
        this.timeLimit = timeLimit;
        this.trans = trans;
        for (int v = 0;v < transMap.getNumOfCity();v++) {
            distTo[v][0] = Double.POSITIVE_INFINITY;
            distTo[v][1] = 0;
            distTo[v][2] = 0;
        }
        distTo[s][0]=0.0;
        distTo[s][1]=0.0;
        distTo[s][2]=curTime;
        pq = new IndexMinPQ<Double>(transMap.getNumOfCity());
        pq.insert(s, distTo[s][0]);
        while (!pq.isEmpty()) {
            int v = pq.delMin();
            for (Schedule p : transMap.getAdj(v)){
                if (trans == 0){
                    if (p.getIdNumber().length() <= 5)
                        relax(p);
                }
                if (trans == 1){
                    if (p.getIdNumber().length() > 5){
                        relax(p);
                    }
                }
                if (trans == 2)
                    relax(p);
            }
        }
        assert true;
    }
    public int calcuWaitTime(int startTime,int arriveTime) {
        if (startTime <= arriveTime ) return (arriveTime - startTime);
        else return (24 - arriveTime + startTime);
    }

    public void relax(Schedule path) {
        int v = path.getFromCity(),w = path.getToCity();
        int waittime = calcuWaitTime((int) distTo[v][2],path.getStartTime());
        if (distTo[w][0] > distTo[v][0]+path.getPrice()  && (int)distTo[v][1] + path.getTimeTaken() + waittime < timeLimit) {
            distTo[w][0] = distTo[v][0]+path.getPrice();
            distTo[w][1] = distTo[v][1] + path.getTimeTaken() + waittime;
            distTo[w][2] = path.getArriveTime();
            pathTo[w] = path;
            if (pq.contains(w)) {
                pq.decreaseKey(w,distTo[w][0]);
            } else {
                pq.insert(w,distTo[w][0]);
            }

        }
    }

    public double[] getDistTo(int v) {
        return distTo[v];
    }

    public boolean hasPathTo (int v) {
        return distTo[v][0] < Double.POSITIVE_INFINITY;
    }

    public void setCurTime(int curTime) {
        this.curTime = curTime;
    }

    public int getCurTime() {
        return curTime;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getTrans() {
        return trans;
    }
    

    //返回S到V的最短路径
    public Iterable<Schedule> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Schedule> path = new Stack<Schedule>();
        for (Schedule p = pathTo[v]; p != null; p = pathTo[p.getFromCity()]) {
            path.push(p);
        }
        return path;
    }
}
