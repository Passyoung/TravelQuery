package src.algorithm;

//计算最少金钱的策略
public class BestStrategy {
    private double[] distTo;
    private Schedule[] pathTo;
    private IndexMinPQ<Double> pq;
    private int trans;

    //S为起点
    public BestStrategy(TransMap transMap, int s,int trans) {
        distTo = new double[transMap.getNumOfCity()];
        pathTo = new Schedule[transMap.getNumOfCity()];
        this.trans = trans;
        for (int v = 0;v < transMap.getNumOfCity();v++) {
            distTo[v] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;

        pq = new IndexMinPQ<Double>(transMap.getNumOfCity());
        pq.insert(s,distTo[s]);
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

    private void relax(Schedule path) {
        int v = path.getFromCity(),w = path.getToCity();
        if (distTo[w] > distTo[v] + path.getPrice()) {
            distTo[w] = distTo[v] + path.getPrice();
            pathTo[w] = path;
            if (pq.contains(w)) {
                pq.decreaseKey(w,distTo[w]);
            } else {
                pq.insert(w,distTo[w]);
            }

        }
    }
    //返回S到V的最短路径的值
    public double getDistTo(int v) {
        return distTo[v];
    }

    public boolean hasPathTo (int v) {
        return distTo[v] < Double.POSITIVE_INFINITY;
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
