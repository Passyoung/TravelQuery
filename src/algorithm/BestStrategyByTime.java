package src.algorithm;


public class BestStrategyByTime {
    private int[][] distTo;
    private Schedule[] pathTo;
    private IndexMinPQ<Integer> pq;


    public BestStrategyByTime(TransMap transMap, int s) {
        distTo = new int[transMap.getNumOfCity()][2];
        pathTo = new Schedule[transMap.getNumOfCity()];

        for (int v = 0;v < transMap.getNumOfCity();v++) {
            distTo[v][0]=Integer.MAX_VALUE/2;
            distTo[v][1] = 0;
        }
        distTo[s][0]=0;
        distTo[s][1]=0;
        pq = new IndexMinPQ<Integer>(transMap.getNumOfCity());
        pq.insert(s,distTo[s][0]);
        while (!pq.isEmpty()) {
            int v = pq.delMin();
            for (Schedule p : transMap.getAdj(v)){
//                distTo[v][1] = p.getArriveTime();
                relax(p);
            }
        }
        assert true;
    }
    public int calcuTimeTaken(int startTime,int arriveTime) {
        if (startTime <= arriveTime ) return (arriveTime - startTime);
        else return (24 - arriveTime + startTime);
    }

    public void relax(Schedule path) {
        int v = path.getFromCity(),w = path.getToCity();
        if (distTo[w][0] > distTo[v][0] + path.getTimeTaken() + calcuTimeTaken(distTo[v][1],path.getStartTime())) {
            distTo[w][0] = distTo[v][0] + path.getTimeTaken() + calcuTimeTaken(distTo[v][1],path.getStartTime());
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
        return distTo[v][0] < Integer.MAX_VALUE;
    }

//    public void setCurTime(int curTime) {
//        this.curTime = curTime;
//    }
//
//    public int getCurTime() {
//        return curTime;
//    }

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
