package src.algorithm;


public class BestStrategyByTime {
    private int[][] distTo;
    private Schedule[] pathTo;
    private IndexMinPQ<Integer> pq;
    private int curTime;//现在的时间
    private int trans;//限定交通工具0为火车，1为飞机，2为无限定


    public BestStrategyByTime(TransMap transMap, int s,int curTime,int trans) {
        distTo = new int[transMap.getNumOfCity()][2];
        pathTo = new Schedule[transMap.getNumOfCity()];
        this.curTime = curTime;
        this.trans = trans;
        for (int v = 0;v < transMap.getNumOfCity();v++) {
            distTo[v][0]=Integer.MAX_VALUE/2;
            distTo[v][1] = 0;
        }
        distTo[s][0]=0;
        distTo[s][1]=curTime;
        pq = new IndexMinPQ<Integer>(transMap.getNumOfCity());
        pq.insert(s,distTo[s][0]);
        while (!pq.isEmpty()) {
            int v = pq.delMin();
            for (Schedule p : transMap.getAdj(v)){
                if (trans == 0){
                    if (p.getIdNumber().length() <= 4)
                        relax(p);
                }
                if (trans == 1){
                    if (p.getIdNumber().length() > 4){
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
        int waittime = calcuWaitTime(distTo[v][1],path.getStartTime());
        if (distTo[w][0] > distTo[v][0] + path.getTimeTaken() + waittime) {
            distTo[w][0] = distTo[v][0] + path.getTimeTaken() + waittime;
            distTo[w][1] = path.getArriveTime();
            pathTo[w] = path;
            if (pq.contains(w)) {
                pq.decreaseKey(w,distTo[w][0]);
            } else {
                pq.insert(w,distTo[w][0]);
            }

        }
    }

    public int getDistTo(int v) {
        return distTo[v][0];
    }

    public boolean hasPathTo (int v) {
        return distTo[v][0] < Integer.MAX_VALUE/2;
    }

    public void setCurTime(int curTime) {
        this.curTime = curTime;
    }

    public int getCurTime() {
        return curTime;
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
//    public class Info {
//        private int arriveTime;
//        private int timeTaken;
//
//        public Info(int arriveTime,int timeTaken) {
//            this.arriveTime = arriveTime;
//            this.timeTaken = timeTaken;
//        }
//
//        public void setArriveTime(int arriveTime) {
//            this.arriveTime = arriveTime;
//        }
//
//        public void setTimeTaken(int timeTaken) {
//            this.timeTaken = timeTaken;
//        }
//
//        public int getArriveTime() {
//            return arriveTime;
//        }
//
//        public int getTimeTaken() {
//            return timeTaken;
//        }
//    }
}
