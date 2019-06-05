package src.algorithm;
//import src.algorithm.Schedule;
//import src.algorithm.Bag;

//记录地图信息
public class TransMap {
    private final int numOfCity;
    private int numOfPath;
    private Bag<Schedule>[] adj;
    private int[] indegree;

    //构造含有n个城市的空图
    public TransMap(int numOfCity) {
        this.numOfCity = numOfCity;
        this.numOfPath = 0;
        adj = (Bag<Schedule>[]) new Bag[numOfCity];
        for (int n = 0; n < numOfCity; n++) {
            adj[n] = new Bag<Schedule>();
        }
    }

    public int getNumOfCity() {
        return numOfCity;
    }

    public int getNumOfPath() {
        return numOfPath;
    }

    private void validateVertex(int n) {
        if (n < 0 || n >= numOfCity) {
            throw new IllegalArgumentException("city" + n + "is not between" + 0 + "to" + (numOfCity - 1));
        }
    }

    //根据schedule添加路径
    public void addPath(Schedule schedule) {
        int fromCity = schedule.getFromCity();
        int toCity = schedule.getToCity();
        validateVertex(fromCity);
        validateVertex(toCity);
        adj[fromCity].add(schedule);
        adj[toCity].add(schedule);
        numOfPath++;
    }

    public Iterable<Schedule> getAdj(int fromCity) {
        return adj[fromCity];
    }

    public int outdegree(int city) {
        return adj[city].size();
    }

    public int indegree(int city) {
        return indegree[city];
    }

    public Iterable<Schedule> schedules() {
        Bag<Schedule> list = new Bag<Schedule>();
        for (int n = 0; n < numOfCity; n++) {
            for (Schedule p : adj[n]) {
                list.add(p);
            }
        }
        return list;
    }

    public Schedule[] loadTimetable() {
        Schedule[] timetable = {new Schedule(
                0,
                8,
                5,
                16,
                10,
                261.5,
                "Z157"
        ), new Schedule(
                0,
                8,
                6,
                14,
                8,
                313.5,
                "D29"
        ), new Schedule(
                0,
                8,
                7,
                14,
                6,
                541.5,
                "G381"
        ), new Schedule(
                0,
                8,
                10,
                18,
                8,
                306.5,
                "D25"
        ), new Schedule(
                0,
                8,
                11,
                2,
                15,
                268.5,
                "K339"
        ), new Schedule(
                0,
                8,
                12,
                2,
                14,
                268.5,
                "T297"
        ), new Schedule(
                0,
                8,
                13,
                21,
                7,
                306.5,
                "D101"
        ), new Schedule(
                0,
                8,
                14,
                8,
                18,
                288.5,
                "K349"
        ), new Schedule(
                0,
                8,
                15,
                22,
                7,
                306.5,
                "D27"
        ), new Schedule(
                0,
                8,
                16,
                6,
                13,
                261.5,
                "T17"
        ), new Schedule(
                0,
                8,
                18,
                6,
                11,
                261.5,
                "T47"
        ), new Schedule(
                0,
                8,
                20,
                6,
                10,
                241.5,
                "Z203"
        ), new Schedule(
                0,
                8,
                21,
                7,
                9,
                261.5,
                "Z17"
        ), new Schedule(
                0,
                8,
                21,
                8,
                10,
                261.5,
                "Z83"
        ), new Schedule(
                0,
                8,
                22,
                17,
                19,
                288.5,
                "K1303"
        ), new Schedule(
                0,
                8,
                23,
                15,
                16,
                296.5,
                "K39"
        ), new Schedule(
                0,
                9,
                2,
                12,
                9,
                158.0,
                "K55"
        ), new Schedule(
                0,
                9,
                3,
                13,
                9,
                158.0,
                "K711"
        ), new Schedule(
                0,
                9,
                9,
                19,
                10,
                158.0,
                "K263"
        ), new Schedule(
                0,
                9,
                10,
                22,
                12,
                158.0,
                "K617"
        ), new Schedule(
                0,
                9,
                11,
                20,
                9,
                158.0,
                "Z283"
        ), new Schedule(
                0,
                9,
                13,
                23,
                9,
                158.0,
                "K1177"
        ), new Schedule(
                0,
                9,
                15,
                23,
                8,
                158.0,
                "Z179"
        ), new Schedule(
                0,
                9,
                15,
                5,
                14,
                147.0,
                "1133"
        ), new Schedule(
                0,
                9,
                20,
                6,
                10,
                158.0,
                "K573"
        ), new Schedule(
                0,
                9,
                22,
                7,
                9,
                158.0,
                "K89"
        ), new Schedule(
                0,
                9,
                22,
                8,
                9,
                158.0,
                "Z317"
        ), new Schedule(
                0,
                9,
                23,
                9,
                9,
                158.0,
                "K885"
        ), new Schedule(
                0,
                7,
                6,
                10,
                4,
                515.5,
                "G427"
        ), new Schedule(
                0,
                7,
                6,
                11,
                4,
                515.5,
                "G89"
        ), new Schedule(
                0,
                7,
                6,
                12,
                5,
                515.5,
                "G651"
        ), new Schedule(
                0,
                7,
                7,
                13,
                6,
                515.5,
                "G653"
        ), new Schedule(
                0,
                7,
                8,
                14,
                6,
                515.5,
                "G671"
        ), new Schedule(
                0,
                7,
                9,
                15,
                5,
                515.5,
                "G571"
        ), new Schedule(
                0,
                7,
                10,
                16,
                5,
                515.5,
                "G429"
        ), new Schedule(
                0,
                7,
                11,
                17,
                5,
                515.5,
                "G667"
        ), new Schedule(
                0,
                7,
                13,
                19,
                6,
                515.5,
                "G661"
        ), new Schedule(
                0,
                7,
                14,
                18,
                4,
                515.5,
                "G87"
        ), new Schedule(
                0,
                7,
                14,
                5,
                15,
                268.5,
                "T41"
        ), new Schedule(
                0,
                7,
                14,
                20,
                5,
                515.5,
                "G673"
        ), new Schedule(
                0,
                7,
                15,
                19,
                4,
                515.5,
                "G349"
        ), new Schedule(
                0,
                7,
                15,
                21,
                5,
                515.5,
                "G663"
        ), new Schedule(
                0,
                7,
                15,
                5,
                13,
                254.5,
                "T55"
        ), new Schedule(
                0,
                7,
                15,
                3,
                11,
                254.5,
                "Z75"
        ), new Schedule(
                0,
                7,
                16,
                21,
                5,
                515.5,
                "G665"
        ), new Schedule(
                0,
                7,
                16,
                3,
                11,
                254.5,
                "Z151"
        ), new Schedule(
                0,
                7,
                16,
                6,
                13,
                268.5,
                "T7"
        ), new Schedule(
                0,
                7,
                18,
                7,
                12,
                254.5,
                "T231"
        ), new Schedule(
                0,
                7,
                18,
                23,
                4,
                515.5,
                "G25"
        ), new Schedule(
                0,
                7,
                20,
                9,
                13,
                268.5,
                "Z43"
        ), new Schedule(
                0,
                7,
                20,
                8,
                11,
                254.5,
                "Z19"
        ), new Schedule(
                0,
                7,
                22,
                13,
                15,
                261.5,
                "K1363"
        ), new Schedule(
                0,
                5,
                7,
                12,
                5,
                520.5,
                "G529"
        ), new Schedule(
                0,
                5,
                7,
                13,
                5,
                520.5,
                "G71"
        ), new Schedule(
                0,
                5,
                8,
                12,
                4,
                520.5,
                "G403"
        ), new Schedule(
                0,
                5,
                8,
                13,
                4,
                520.5,
                "G83"
        ), new Schedule(
                0,
                5,
                9,
                13,
                4,
                520.5,
                "G81"
        ), new Schedule(
                0,
                5,
                9,
                14,
                5,
                520.5,
                "G421"
        ), new Schedule(
                0,
                5,
                10,
                14,
                4,
                520.5,
                "G79"
        ), new Schedule(
                0,
                5,
                10,
                15,
                5,
                520.5,
                "G405"
        ), new Schedule(
                0,
                5,
                11,
                17,
                5,
                520.5,
                "G401"
        ), new Schedule(
                0,
                5,
                12,
                18,
                5,
                520.5,
                "G67"
        ), new Schedule(
                0,
                5,
                13,
                18,
                5,
                520.5,
                "G69"
        ), new Schedule(
                0,
                5,
                14,
                19,
                5,
                520.5,
                "G519"
        ), new Schedule(
                0,
                5,
                14,
                20,
                5,
                520.5,
                "G587"
        ), new Schedule(
                0,
                5,
                15,
                20,
                5,
                520.5,
                "G505"
        ), new Schedule(
                0,
                5,
                16,
                21,
                5,
                520.5,
                "G573"
        ), new Schedule(
                0,
                5,
                16,
                22,
                5,
                520.5,
                "G585"
        ), new Schedule(
                0,
                2,
                6,
                11,
                4,
                443.5,
                "G101"
        ), new Schedule(
                0,
                2,
                7,
                10,
                3,
                443.5,
                "G5"
        ), new Schedule(
                0,
                2,
                7,
                11,
                4,
                443.5,
                "G57"
        ), new Schedule(
                0,
                2,
                8,
                11,
                3,
                443.5,
                "G19"
        ), new Schedule(
                0,
                2,
                8,
                12,
                4,
                443.5,
                "G107"
        ), new Schedule(
                0,
                2,
                8,
                13,
                4,
                443.5,
                "G113"
        ), new Schedule(
                0,
                2,
                9,
                12,
                3,
                443.5,
                "G1"
        ), new Schedule(
                0,
                2,
                9,
                13,
                4,
                443.5,
                "G41"
        ), new Schedule(
                0,
                2,
                9,
                14,
                4,
                443.5,
                "G117"
        ), new Schedule(
                0,
                2,
                10,
                13,
                3,
                443.5,
                "G7"
        ), new Schedule(
                0,
                2,
                10,
                14,
                4,
                443.5,
                "G119"
        ), new Schedule(
                0,
                2,
                10,
                1,
                14,
                254.5,
                "K45"
        ), new Schedule(
                0,
                2,
                10,
                15,
                5,
                443.5,
                "G163"
        ), new Schedule(
                0,
                2,
                11,
                14,
                3,
                443.5,
                "G31"
        ), new Schedule(
                0,
                2,
                11,
                15,
                4,
                443.5,
                "G125"
        ), new Schedule(
                0,
                2,
                11,
                3,
                15,
                236.5,
                "1461"
        ), new Schedule(
                0,
                2,
                12,
                15,
                3,
                443.5,
                "G9"
        ), new Schedule(
                0,
                2,
                12,
                16,
                4,
                443.5,
                "G129"
        ), new Schedule(
                0,
                2,
                12,
                17,
                4,
                443.5,
                "G167"
        ), new Schedule(
                0,
                2,
                13,
                17,
                4,
                443.5,
                "G135"
        ), new Schedule(
                0,
                2,
                13,
                18,
                4,
                443.5,
                "G59"
        ), new Schedule(
                0,
                2,
                14,
                17,
                3,
                443.5,
                "G3"
        ), new Schedule(
                0,
                2,
                14,
                18,
                4,
                443.5,
                "G43"
        ), new Schedule(
                0,
                2,
                14,
                19,
                4,
                443.5,
                "G145"
        ), new Schedule(
                0,
                2,
                15,
                18,
                3,
                443.5,
                "G11"
        ), new Schedule(
                0,
                2,
                15,
                19,
                4,
                443.5,
                "G35"
        ), new Schedule(
                0,
                2,
                15,
                20,
                4,
                443.5,
                "G155"
        ), new Schedule(
                0,
                2,
                16,
                20,
                4,
                443.5,
                "G37"
        ), new Schedule(
                0,
                2,
                16,
                21,
                4,
                443.5,
                "G169"
        ), new Schedule(
                0,
                2,
                17,
                20,
                3,
                443.5,
                "G13"
        ), new Schedule(
                0,
                2,
                17,
                21,
                4,
                443.5,
                "G153"
        ), new Schedule(
                0,
                2,
                17,
                22,
                4,
                443.5,
                "G157"
        ), new Schedule(
                0,
                2,
                18,
                21,
                3,
                443.5,
                "G15"
        ), new Schedule(
                0,
                2,
                18,
                23,
                4,
                443.5,
                "G203"
        ), new Schedule(
                0,
                2,
                18,
                5,
                10,
                254.5,
                "Z281"
        ), new Schedule(
                0,
                2,
                19,
                22,
                3,
                443.5,
                "G17"
        ), new Schedule(
                0,
                2,
                19,
                4,
                9,
                197.0,
                "D717"
        ), new Schedule(
                0,
                2,
                19,
                5,
                9,
                196.0,
                "D709"
        ), new Schedule(
                0,
                2,
                20,
                7,
                11,
                254.5,
                "T109"
        ), new Schedule(
                0,
                2,
                21,
                6,
                9,
                197.0,
                "D711"
        ), new Schedule(
                0,
                2,
                22,
                8,
                9,
                196.0,
                "D715"
        ), new Schedule(
                0,
                2,
                23,
                13,
                14,
                254.5,
                "K101"
        ), new Schedule(
                0,
                2,
                23,
                1,
                2,
                357,
                "JD5661"
        ), new Schedule(
                0,
                2,
                8,
                10,
                2,
                447,
                "MU2862"
        ), new Schedule(
                0,
                2,
                10,
                12,
                2,
                447,
                "MU2802"
        ), new Schedule(
                0,
                2,
                11,
                13,
                2,
                447,
                "MU2812"
        ), new Schedule(
                0,
                2,
                18,
                20,
                2,
                447,
                "MU2832"
        ), new Schedule(
                0,
                2,
                20,
                22,
                2,
                447,
                "CA1819"
        ), new Schedule(
                0,
                2,
                15,
                17,
                2,
                457,
                "MU791"
        ), new Schedule(
                0,
                2,
                16,
                18,
                2,
                457,
                "MU2822"
        ), new Schedule(
                0,
                2,
                11,
                12,
                1,
                507,
                "CA1847"
        ), new Schedule(
                0,
                2,
                14,
                16,
                2,
                507,
                "CA1561"
        ), new Schedule(
                0,
                2,
                17,
                19,
                2,
                507,
                "CA1503"
        ), new Schedule(
                0,
                8,
                14,
                19,
                5,
                449,
                "KN5529"
        ), new Schedule(
                0,
                8,
                7,
                9,
                2,
                493,
                "HU7129"
        ), new Schedule(
                0,
                8,
                8,
                10,
                2,
                520,
                "MU2467"
        ), new Schedule(
                0,
                8,
                6,
                8,
                2,
                600,
                "CA1621"
        ), new Schedule(
                0,
                8,
                19,
                20,
                1,
                785,
                "CN7139"
        ), new Schedule(
                0,
                8,
                19,
                21,
                2,
                785,
                "CN7149"
        ), new Schedule(
                0,
                8,
                9,
                11,
                2,
                910,
                "CZ6204"
        ), new Schedule(
                0,
                8,
                22,
                0,
                2,
                910,
                "CZ6202"
        ), new Schedule(
                0,
                8,
                20,
                22,
                2,
                970,
                "CA1639"
        ), new Schedule(
                0,
                8,
                14,
                16,
                2,
                1000,
                "MU2717"
        ), new Schedule(
                0,
                8,
                10,
                12,
                2,
                1190,
                "CZ6279"
        ), new Schedule(
                0,
                8,
                17,
                20,
                3,
                1190,
                "CZ6218"
        ), new Schedule(
                0,
                8,
                11,
                13,
                2,
                1330,
                "CZ6220"
        ), new Schedule(
                0,
                8,
                12,
                14,
                2,
                1430,
                "CA1623"
        ), new Schedule(
                0,
                8,
                16,
                19,
                3,
                1430,
                "CA1611"
        ), new Schedule(
                0,
                9,
                19,
                20,
                1,
                661,
                "KN2259"
        ), new Schedule(
                0,
                9,
                21,
                22,
                1,
                723,
                "HU7175"
        ), new Schedule(
                0,
                9,
                12,
                14,
                2,
                859,
                "KN2261"
        ), new Schedule(
                0,
                9,
                6,
                7,
                1,
                880,
                "CA1111"
        ), new Schedule(
                0,
                9,
                9,
                10,
                1,
                880,
                "CA1117"
        ), new Schedule(
                0,
                9,
                16,
                18,
                2,
                880,
                "CA1105"
        ), new Schedule(
                0,
                9,
                20,
                21,
                1,
                880,
                "CA1101"
        ), new Schedule(
                0,
                7,
                7,
                9,
                2,
                525,
                "HU7137"
        ), new Schedule(
                0,
                7,
                22,
                0,
                2,
                525,
                "HU7737"
        ), new Schedule(
                0,
                7,
                6,
                8,
                2,
                600,
                "CZ3173"
        ), new Schedule(
                0,
                7,
                7,
                10,
                3,
                600,
                "MU2102"
        ), new Schedule(
                0,
                7,
                23,
                1,
                2,
                600,
                "MU5716"
        ), new Schedule(
                0,
                7,
                8,
                10,
                2,
                650,
                "MU2104"
        ), new Schedule(
                0,
                7,
                12,
                14,
                2,
                650,
                "MU2108"
        ), new Schedule(
                0,
                7,
                8,
                11,
                3,
                890,
                "CA1289"
        ), new Schedule(
                0,
                7,
                17,
                20,
                3,
                1020,
                "CZ6948"
        ), new Schedule(
                0,
                7,
                10,
                13,
                3,
                1240,
                "MU2106"
        ), new Schedule(
                0,
                7,
                10,
                12,
                2,
                1340,
                "CA1209"
        ), new Schedule(
                0,
                7,
                11,
                13,
                2,
                1435,
                "HU7237"
        ), new Schedule(
                0,
                7,
                20,
                22,
                2,
                1530,
                "CA1205"
        ), new Schedule(
                0,
                7,
                14,
                16,
                2,
                1620,
                "MU2110"
        ), new Schedule(
                0,
                7,
                18,
                20,
                2,
                1700,
                "MU2116"
        ), new Schedule(
                0,
                7,
                21,
                23,
                2,
                1700,
                "MU2120"
        ), new Schedule(
                0,
                7,
                19,
                21,
                2,
                1810,
                "CZ9130"
        ), new Schedule(
                0,
                7,
                15,
                17,
                2,
                2040,
                "CA1225"
        ), new Schedule(
                0,
                7,
                17,
                19,
                2,
                2040,
                "CA1235"
        ), new Schedule(
                1,
                2,
                5,
                7,
                2,
                144.5,
                "G7072"
        ), new Schedule(
                1,
                2,
                6,
                7,
                1,
                134.5,
                "G456"
        ), new Schedule(
                1,
                2,
                6,
                8,
                2,
                115.0,
                "D352"
        ), new Schedule(
                1,
                2,
                6,
                9,
                2,
                75.0,
                "D3002"
        ), new Schedule(
                1,
                2,
                7,
                8,
                1,
                139.5,
                "G6"
        ), new Schedule(
                1,
                2,
                7,
                9,
                2,
                86.0,
                "D3072"
        ), new Schedule(
                1,
                2,
                7,
                10,
                3,
                195.0,
                "G7395"
        ), new Schedule(
                1,
                2,
                8,
                9,
                1,
                134.5,
                "G8"
        ), new Schedule(
                1,
                2,
                8,
                10,
                2,
                144.5,
                "G7268"
        ), new Schedule(
                1,
                2,
                8,
                11,
                2,
                115.0,
                "D2216"
        ), new Schedule(
                1,
                2,
                8,
                12,
                3,
                46.5,
                "K290"
        ), new Schedule(
                1,
                2,
                9,
                10,
                1,
                139.5,
                "G7006"
        ), new Schedule(
                1,
                2,
                9,
                11,
                2,
                144.5,
                "G7492"
        ), new Schedule(
                1,
                2,
                9,
                12,
                3,
                92.5,
                "K516"
        ), new Schedule(
                1,
                2,
                9,
                13,
                3,
                92.5,
                "K360"
        ), new Schedule(
                1,
                2,
                10,
                11,
                1,
                134.5,
                "G10"
        ), new Schedule(
                1,
                2,
                10,
                11,
                1,
                139.5,
                "G7008"
        ), new Schedule(
                1,
                2,
                10,
                12,
                2,
                139.5,
                "G7042"
        ), new Schedule(
                1,
                2,
                10,
                14,
                3,
                92.5,
                "K1556"
        ), new Schedule(
                1,
                2,
                11,
                12,
                1,
                139.5,
                "G7010"
        ), new Schedule(
                1,
                2,
                11,
                15,
                4,
                92.5,
                "K2186"
        ), new Schedule(
                1,
                2,
                11,
                13,
                2,
                144.5,
                "G7572"
        ), new Schedule(
                1,
                2,
                11,
                16,
                4,
                92.5,
                "K464"
        ), new Schedule(
                1,
                2,
                12,
                13,
                1,
                139.5,
                "G12"
        ), new Schedule(
                1,
                2,
                12,
                15,
                3,
                92.5,
                "T204"
        ), new Schedule(
                1,
                2,
                12,
                14,
                1,
                144.5,
                "G7576"
        ), new Schedule(
                1,
                2,
                12,
                16,
                4,
                86.5,
                "1462"
        ), new Schedule(
                1,
                2,
                13,
                14,
                1,
                134.5,
                "G134"
        ), new Schedule(
                1,
                2,
                13,
                15,
                1,
                144.5,
                "G7164"
        ), new Schedule(
                1,
                2,
                13,
                17,
                4,
                92.5,
                "K172"
        ), new Schedule(
                1,
                2,
                13,
                16,
                2,
                115.0,
                "D3006"
        ), new Schedule(
                1,
                2,
                14,
                15,
                1,
                139.5,
                "G7016"
        ), new Schedule(
                1,
                2,
                14,
                18,
                4,
                92.5,
                "K738"
        ), new Schedule(
                1,
                2,
                14,
                16,
                2,
                144.5,
                "G7276"
        ), new Schedule(
                1,
                2,
                14,
                17,
                3,
                92.5,
                "T132"
        ), new Schedule(
                1,
                2,
                14,
                19,
                4,
                92.5,
                "K560"
        ), new Schedule(
                1,
                2,
                15,
                16,
                1,
                134.5,
                "G14"
        ), new Schedule(
                1,
                2,
                15,
                17,
                2,
                144.5,
                "G7140"
        ), new Schedule(
                1,
                2,
                15,
                19,
                4,
                92.5,
                "K1012"
        ), new Schedule(
                1,
                2,
                15,
                18,
                3,
                92.5,
                "T116"
        ), new Schedule(
                1,
                2,
                16,
                17,
                1,
                139.5,
                "G7020"
        ), new Schedule(
                1,
                2,
                16,
                18,
                2,
                111.0,
                "D3142"
        ), new Schedule(
                1,
                2,
                16,
                19,
                3,
                92.5,
                "K372"
        ), new Schedule(
                1,
                2,
                16,
                20,
                4,
                92.5,
                "K152"
        ), new Schedule(
                1,
                2,
                17,
                18,
                1,
                134.5,
                "G16"
        ), new Schedule(
                1,
                2,
                17,
                18,
                1,
                139.5,
                "G7022"
        ), new Schedule(
                1,
                2,
                17,
                19,
                2,
                144.5,
                "G7144"
        ), new Schedule(
                1,
                2,
                17,
                20,
                2,
                111.0,
                "D3136"
        ), new Schedule(
                1,
                2,
                17,
                21,
                4,
                92.5,
                "T110"
        ), new Schedule(
                1,
                2,
                18,
                19,
                1,
                139.5,
                "G7024"
        ), new Schedule(
                1,
                2,
                18,
                20,
                2,
                92.5,
                "Z92"
        ), new Schedule(
                1,
                2,
                18,
                23,
                4,
                92.5,
                "K188"
        ), new Schedule(
                1,
                2,
                18,
                21,
                3,
                195.0,
                "G7391"
        ), new Schedule(
                1,
                2,
                18,
                22,
                3,
                92.5,
                "Z172"
        ), new Schedule(
                1,
                2,
                19,
                20,
                1,
                134.5,
                "G22"
        ), new Schedule(
                1,
                2,
                19,
                21,
                1,
                144.5,
                "G7122"
        ), new Schedule(
                1,
                2,
                19,
                22,
                3,
                92.5,
                "Z40"
        ), new Schedule(
                1,
                2,
                19,
                23,
                3,
                92.5,
                "K8356"
        ), new Schedule(
                1,
                2,
                20,
                21,
                1,
                139.5,
                "G7028"
        ), new Schedule(
                1,
                2,
                20,
                22,
                2,
                139.5,
                "G7064"
        ), new Schedule(
                1,
                2,
                20,
                23,
                3,
                92.5,
                "K8376"
        ), new Schedule(
                1,
                2,
                20,
                0,
                4,
                86.5,
                "1228"
        ), new Schedule(
                1,
                2,
                21,
                22,
                1,
                144.5,
                "G7030"
        ), new Schedule(
                1,
                2,
                21,
                23,
                2,
                51.0,
                "D706"
        ), new Schedule(
                1,
                2,
                21,
                1,
                3,
                92.5,
                "K8482"
        ), new Schedule(
                1,
                2,
                22,
                1,
                2,
                88.5,
                "D306"
        ), new Schedule(
                1,
                2,
                23,
                2,
                3,
                92.5,
                "K8386"
        ), new Schedule(
                1,
                2,
                23,
                3,
                3,
                92.5,
                "K8362"
        ), new Schedule(
                1,
                3,
                6,
                7,
                1,
                73.0,
                "G7541"
        ), new Schedule(
                1,
                3,
                6,
                7,
                0,
                73.0,
                "G7331"
        ), new Schedule(
                1,
                3,
                6,
                8,
                1,
                73.0,
                "G1651"
        ), new Schedule(
                1,
                3,
                7,
                8,
                1,
                56.0,
                "D379"
        ), new Schedule(
                1,
                3,
                7,
                9,
                1,
                56.0,
                "D2287"
        ), new Schedule(
                1,
                3,
                8,
                9,
                1,
                73.0,
                "G85"
        ), new Schedule(
                1,
                3,
                8,
                9,
                1,
                88.0,
                "G7317"
        ), new Schedule(
                1,
                3,
                8,
                10,
                1,
                56.0,
                "D3125"
        ), new Schedule(
                1,
                3,
                9,
                10,
                1,
                73.0,
                "G7505"
        ), new Schedule(
                1,
                3,
                9,
                10,
                1,
                56.0,
                "D2285"
        ), new Schedule(
                1,
                3,
                9,
                11,
                1,
                88.0,
                "G7319"
        ), new Schedule(
                1,
                3,
                10,
                11,
                1,
                73.0,
                "G1501"
        ), new Schedule(
                1,
                3,
                10,
                11,
                0,
                73.0,
                "G7507"
        ), new Schedule(
                1,
                3,
                10,
                12,
                1,
                56.0,
                "D3135"
        ), new Schedule(
                1,
                3,
                11,
                12,
                1,
                73.0,
                "G7461"
        ), new Schedule(
                1,
                3,
                12,
                13,
                1,
                73.0,
                "G7591"
        ), new Schedule(
                1,
                3,
                12,
                13,
                1,
                73.0,
                "G7511"
        ), new Schedule(
                1,
                3,
                12,
                14,
                1,
                73.0,
                "G7193"
        ), new Schedule(
                1,
                3,
                13,
                14,
                1,
                73.0,
                "G7595"
        ), new Schedule(
                1,
                3,
                14,
                15,
                1,
                73.0,
                "G7515"
        ), new Schedule(
                1,
                3,
                14,
                15,
                1,
                73.0,
                "G99"
        ), new Schedule(
                1,
                3,
                14,
                16,
                1,
                56.0,
                "D381"
        ), new Schedule(
                1,
                3,
                15,
                16,
                1,
                73.0,
                "G1357"
        ), new Schedule(
                1,
                3,
                15,
                16,
                1,
                56.0,
                "D3101"
        ), new Schedule(
                1,
                3,
                16,
                17,
                0,
                73.0,
                "G7365"
        ), new Schedule(
                1,
                3,
                17,
                18,
                1,
                73.0,
                "G7563"
        ), new Schedule(
                1,
                3,
                17,
                19,
                1,
                92.5,
                "G7359"
        ), new Schedule(
                1,
                3,
                18,
                19,
                1,
                73.0,
                "G7307"
        ), new Schedule(
                1,
                3,
                19,
                20,
                1,
                73.0,
                "G7535"
        ), new Schedule(
                1,
                3,
                19,
                20,
                0,
                56.0,
                "D3323"
        ), new Schedule(
                1,
                3,
                20,
                21,
                1,
                73.0,
                "G7527"
        ), new Schedule(
                1,
                3,
                21,
                22,
                1,
                73.0,
                "G7555"
        ), new Schedule(
                1,
                2,
                22,
                23,
                1,
                180,
                "MU2882"
        ), new Schedule(
                2,
                0,
                0,
                9,
                9,
                196.0,
                "D710"
        ), new Schedule(
                2,
                0,
                1,
                15,
                14,
                254.5,
                "K102"
        ), new Schedule(
                2,
                0,
                7,
                12,
                4,
                443.5,
                "G204"
        ), new Schedule(
                2,
                0,
                8,
                12,
                4,
                443.5,
                "G104"
        ), new Schedule(
                2,
                0,
                8,
                11,
                3,
                443.5,
                "G6"
        ), new Schedule(
                2,
                0,
                8,
                13,
                4,
                443.5,
                "G34"
        ), new Schedule(
                2,
                0,
                9,
                12,
                3,
                443.5,
                "G8"
        ), new Schedule(
                2,
                0,
                9,
                13,
                4,
                443.5,
                "G108"
        ), new Schedule(
                2,
                0,
                9,
                14,
                4,
                443.5,
                "G112"
        ), new Schedule(
                2,
                0,
                10,
                13,
                3,
                443.5,
                "G2"
        ), new Schedule(
                2,
                0,
                10,
                14,
                4,
                443.5,
                "G58"
        ), new Schedule(
                2,
                0,
                11,
                14,
                3,
                443.5,
                "G10"
        ), new Schedule(
                2,
                0,
                11,
                15,
                4,
                443.5,
                "G116"
        ), new Schedule(
                2,
                0,
                11,
                16,
                4,
                443.5,
                "G42"
        ), new Schedule(
                2,
                0,
                12,
                16,
                4,
                443.5,
                "G124"
        ), new Schedule(
                2,
                0,
                12,
                17,
                4,
                443.5,
                "G126"
        ), new Schedule(
                2,
                0,
                13,
                18,
                5,
                443.5,
                "G38"
        ), new Schedule(
                2,
                0,
                13,
                16,
                3,
                443.5,
                "G12"
        ), new Schedule(
                2,
                0,
                14,
                17,
                3,
                443.5,
                "G32"
        ), new Schedule(
                2,
                0,
                14,
                18,
                4,
                443.5,
                "G134"
        ), new Schedule(
                2,
                0,
                14,
                19,
                4,
                443.5,
                "G138"
        ), new Schedule(
                2,
                0,
                15,
                18,
                3,
                443.5,
                "G4"
        ), new Schedule(
                2,
                0,
                15,
                19,
                4,
                443.5,
                "G140"
        ), new Schedule(
                2,
                0,
                15,
                20,
                4,
                443.5,
                "G142"
        ), new Schedule(
                2,
                0,
                16,
                19,
                3,
                443.5,
                "G14"
        ), new Schedule(
                2,
                0,
                16,
                20,
                4,
                443.5,
                "G146"
        ), new Schedule(
                2,
                0,
                16,
                10,
                18,
                236.5,
                "1462"
        ), new Schedule(
                2,
                0,
                16,
                21,
                4,
                443.5,
                "G148"
        ), new Schedule(
                2,
                0,
                17,
                21,
                4,
                443.5,
                "G60"
        ), new Schedule(
                2,
                0,
                17,
                22,
                4,
                443.5,
                "G150"
        ), new Schedule(
                2,
                0,
                18,
                21,
                3,
                443.5,
                "G16"
        ), new Schedule(
                2,
                0,
                18,
                22,
                4,
                443.5,
                "G154"
        ), new Schedule(
                2,
                0,
                18,
                23,
                4,
                443.5,
                "G44"
        ), new Schedule(
                2,
                0,
                19,
                22,
                3,
                443.5,
                "G18"
        ), new Schedule(
                2,
                0,
                20,
                23,
                3,
                443.5,
                "G22"
        ), new Schedule(
                2,
                0,
                21,
                6,
                9,
                196.0,
                "D716"
        ), new Schedule(
                2,
                0,
                21,
                7,
                9,
                197.0,
                "D718"
        ), new Schedule(
                2,
                0,
                22,
                10,
                12,
                254.5,
                "T110"
        ), new Schedule(
                2,
                0,
                23,
                9,
                9,
                197.0,
                "D706"
        ), new Schedule(
                2,
                1,
                1,
                5,
                3,
                92.5,
                "K375"
        ), new Schedule(
                2,
                1,
                2,
                5,
                3,
                92.5,
                "K359"
        ), new Schedule(
                2,
                1,
                2,
                6,
                3,
                92.5,
                "K1555"
        ), new Schedule(
                2,
                1,
                3,
                7,
                3,
                86.5,
                "1461"
        ), new Schedule(
                2,
                1,
                4,
                8,
                4,
                92.5,
                "K1101"
        ), new Schedule(
                2,
                1,
                4,
                7,
                2,
                51.0,
                "D701"
        ), new Schedule(
                2,
                1,
                5,
                7,
                2,
                51.0,
                "D709"
        ), new Schedule(
                2,
                1,
                6,
                8,
                2,
                139.5,
                "G7101"
        ), new Schedule(
                2,
                1,
                6,
                11,
                4,
                92.5,
                "K171"
        ), new Schedule(
                2,
                1,
                6,
                9,
                2,
                144.5,
                "G7581"
        ), new Schedule(
                2,
                1,
                7,
                8,
                1,
                134.5,
                "G1509"
        ), new Schedule(
                2,
                1,
                7,
                9,
                2,
                144.5,
                "G7043"
        ), new Schedule(
                2,
                1,
                7,
                11,
                3,
                195.0,
                "G7393"
        ), new Schedule(
                2,
                1,
                7,
                12,
                4,
                92.5,
                "K737"
        ), new Schedule(
                2,
                1,
                7,
                10,
                2,
                111.0,
                "D2281"
        ), new Schedule(
                2,
                1,
                8,
                9,
                1,
                139.5,
                "G7003"
        ), new Schedule(
                2,
                1,
                8,
                10,
                2,
                111.0,
                "D3135"
        ), new Schedule(
                2,
                1,
                9,
                10,
                1,
                139.5,
                "G7005"
        ), new Schedule(
                2,
                1,
                9,
                11,
                2,
                92.5,
                "Z163"
        ), new Schedule(
                2,
                1,
                9,
                12,
                3,
                92.5,
                "T131"
        ), new Schedule(
                2,
                1,
                10,
                12,
                2,
                92.5,
                "Z251"
        ), new Schedule(
                2,
                1,
                10,
                11,
                1,
                139.5,
                "G7007"
        ), new Schedule(
                2,
                1,
                10,
                14,
                4,
                92.5,
                "K1155"
        ), new Schedule(
                2,
                1,
                10,
                13,
                3,
                92.5,
                "T115"
        ), new Schedule(
                2,
                1,
                11,
                12,
                1,
                139.5,
                "G7009"
        ), new Schedule(
                2,
                1,
                11,
                13,
                2,
                111.0,
                "D3141"
        ), new Schedule(
                2,
                1,
                11,
                14,
                2,
                115.0,
                "D3009"
        ), new Schedule(
                2,
                1,
                12,
                13,
                1,
                139.5,
                "G7011"
        ), new Schedule(
                2,
                1,
                12,
                14,
                2,
                139.5,
                "G7051"
        ), new Schedule(
                2,
                1,
                12,
                16,
                3,
                92.5,
                "K1331"
        ), new Schedule(
                2,
                1,
                12,
                15,
                2,
                115.0,
                "D3005"
        ), new Schedule(
                2,
                1,
                13,
                14,
                1,
                139.5,
                "G7013"
        ), new Schedule(
                2,
                1,
                13,
                15,
                2,
                139.5,
                "G7053"
        ), new Schedule(
                2,
                1,
                13,
                16,
                2,
                115.0,
                "D3041"
        ), new Schedule(
                2,
                1,
                13,
                17,
                3,
                92.5,
                "K515"
        ), new Schedule(
                2,
                1,
                13,
                18,
                4,
                92.5,
                "K2185"
        ), new Schedule(
                2,
                1,
                14,
                15,
                1,
                139.5,
                "G7015"
        ), new Schedule(
                2,
                1,
                14,
                16,
                2,
                144.5,
                "G7231"
        ), new Schedule(
                2,
                1,
                14,
                17,
                3,
                92.5,
                "T203"
        ), new Schedule(
                2,
                1,
                14,
                18,
                3,
                86.5,
                "1227"
        ), new Schedule(
                2,
                1,
                15,
                16,
                1,
                139.5,
                "G7017"
        ), new Schedule(
                2,
                1,
                15,
                17,
                2,
                144.5,
                "G7235"
        ), new Schedule(
                2,
                1,
                16,
                17,
                1,
                139.5,
                "G7019"
        ), new Schedule(
                2,
                1,
                16,
                18,
                2,
                144.5,
                "G7371"
        ), new Schedule(
                2,
                1,
                16,
                19,
                2,
                144.5,
                "G7239"
        ), new Schedule(
                2,
                1,
                17,
                18,
                1,
                134.5,
                "G1227"
        ), new Schedule(
                2,
                1,
                17,
                19,
                2,
                115.0,
                "D2211"
        ), new Schedule(
                2,
                1,
                17,
                20,
                2,
                144.5,
                "G7285"
        ), new Schedule(
                2,
                1,
                18,
                19,
                1,
                139.5,
                "G7023"
        ), new Schedule(
                2,
                1,
                18,
                20,
                2,
                144.5,
                "G7163"
        ), new Schedule(
                2,
                1,
                18,
                21,
                3,
                195.0,
                "G7397"
        ), new Schedule(
                2,
                1,
                18,
                22,
                3,
                92.5,
                "K8385"
        ), new Schedule(
                2,
                1,
                19,
                20,
                1,
                139.5,
                "G7025"
        ), new Schedule(
                2,
                1,
                19,
                21,
                2,
                144.5,
                "G7087"
        ), new Schedule(
                2,
                1,
                19,
                22,
                3,
                46.5,
                "K8365"
        ), new Schedule(
                2,
                1,
                20,
                21,
                1,
                139.5,
                "G7027"
        ), new Schedule(
                2,
                1,
                20,
                22,
                2,
                86.0,
                "D635"
        ), new Schedule(
                2,
                1,
                21,
                22,
                1,
                134.5,
                "G1231"
        ), new Schedule(
                2,
                1,
                21,
                23,
                1,
                134.5,
                "G151"
        ), new Schedule(
                2,
                1,
                22,
                23,
                1,
                134.5,
                "G157"
        ), new Schedule(
                2,
                5,
                7,
                10,
                2,
                200.5,
                "G1113"
        ), new Schedule(
                2,
                5,
                8,
                11,
                2,
                200.5,
                "G1773"
        ), new Schedule(
                2,
                5,
                9,
                11,
                2,
                200.5,
                "G1539"
        ), new Schedule(
                2,
                5,
                9,
                12,
                2,
                200.5,
                "G579"
        ), new Schedule(
                2,
                5,
                10,
                13,
                3,
                200.5,
                "G577"
        ), new Schedule(
                2,
                5,
                15,
                17,
                2,
                200.5,
                "G1721"
        ), new Schedule(
                2,
                5,
                15,
                18,
                2,
                200.5,
                "G1743"
        ), new Schedule(
                2,
                5,
                16,
                19,
                3,
                200.5,
                "G1777"
        ), new Schedule(
                2,
                5,
                17,
                20,
                3,
                200.5,
                "G1737"
        ), new Schedule(
                2,
                5,
                18,
                20,
                2,
                200.5,
                "G1729"
        ), new Schedule(
                2,
                5,
                18,
                22,
                3,
                191.5,
                "G583"
        ), new Schedule(
                2,
                3,
                0,
                5,
                5,
                123.0,
                "Z175"
        ), new Schedule(
                2,
                3,
                0,
                8,
                7,
                123.0,
                "K8371"
        ), new Schedule(
                2,
                3,
                1,
                6,
                5,
                123.0,
                "K75"
        ), new Schedule(
                2,
                3,
                1,
                8,
                6,
                123.0,
                "T135"
        ), new Schedule(
                2,
                3,
                1,
                9,
                7,
                123.0,
                "K47"
        ), new Schedule(
                2,
                3,
                2,
                9,
                7,
                123.0,
                "K1181"
        ), new Schedule(
                2,
                3,
                4,
                8,
                3,
                80.0,
                "D717"
        ), new Schedule(
                2,
                3,
                6,
                10,
                3,
                128.0,
                "D3125"
        ), new Schedule(
                2,
                3,
                6,
                8,
                1,
                117.5,
                "G7625"
        ), new Schedule(
                2,
                3,
                7,
                9,
                2,
                208.5,
                "G1509"
        ), new Schedule(
                2,
                3,
                7,
                8,
                1,
                117.5,
                "G7643"
        ), new Schedule(
                2,
                3,
                7,
                11,
                4,
                123.0,
                "Z85"
        ), new Schedule(
                2,
                3,
                7,
                10,
                2,
                208.5,
                "G7349"
        ), new Schedule(
                2,
                3,
                8,
                9,
                1,
                117.5,
                "G7689"
        ), new Schedule(
                2,
                3,
                8,
                12,
                4,
                167.0,
                "D3135"
        ), new Schedule(
                2,
                3,
                8,
                11,
                2,
                208.5,
                "G7507"
        ), new Schedule(
                2,
                3,
                8,
                10,
                1,
                117.5,
                "G7635"
        ), new Schedule(
                2,
                3,
                9,
                10,
                1,
                117.5,
                "G7645"
        ), new Schedule(
                2,
                3,
                9,
                12,
                2,
                208.5,
                "G7599"
        ), new Schedule(
                2,
                3,
                9,
                11,
                1,
                117.5,
                "G7691"
        ), new Schedule(
                2,
                3,
                9,
                13,
                3,
                216.0,
                "G7591"
        ), new Schedule(
                2,
                3,
                10,
                11,
                1,
                117.5,
                "G61"
        ), new Schedule(
                2,
                3,
                10,
                12,
                2,
                208.5,
                "G7191"
        ), new Schedule(
                2,
                3,
                10,
                13,
                3,
                208.5,
                "G7375"
        ), new Schedule(
                2,
                3,
                11,
                12,
                1,
                117.5,
                "G1731"
        ), new Schedule(
                2,
                3,
                11,
                14,
                3,
                167.0,
                "D3141"
        ), new Schedule(
                2,
                3,
                11,
                13,
                1,
                117.5,
                "G1481"
        ), new Schedule(
                2,
                3,
                12,
                13,
                1,
                117.5,
                "G7453"
        ), new Schedule(
                2,
                3,
                12,
                15,
                3,
                216.0,
                "G7575"
        ), new Schedule(
                2,
                3,
                12,
                14,
                1,
                78.0,
                "D2187"
        ), new Schedule(
                2,
                3,
                13,
                14,
                1,
                117.5,
                "G1493"
        ), new Schedule(
                2,
                3,
                13,
                15,
                1,
                117.5,
                "G7601"
        ), new Schedule(
                2,
                3,
                13,
                18,
                5,
                123.0,
                "T111"
        ), new Schedule(
                2,
                3,
                13,
                20,
                7,
                123.0,
                "K525"
        ), new Schedule(
                2,
                3,
                13,
                17,
                3,
                216.0,
                "G7571"
        ), new Schedule(
                2,
                3,
                14,
                15,
                1,
                117.5,
                "G1495"
        ), new Schedule(
                2,
                3,
                14,
                16,
                1,
                119.0,
                "G1869"
        ), new Schedule(
                2,
                3,
                14,
                21,
                6,
                123.0,
                "K527"
        ), new Schedule(
                2,
                3,
                14,
                18,
                3,
                216.0,
                "G7563"
        ), new Schedule(
                2,
                3,
                15,
                16,
                1,
                95.0,
                "D3235"
        ), new Schedule(
                2,
                3,
                15,
                18,
                3,
                208.5,
                "G7385"
        ), new Schedule(
                2,
                3,
                15,
                17,
                1,
                117.5,
                "G589"
        ), new Schedule(
                2,
                3,
                16,
                19,
                3,
                216.0,
                "G7371"
        ), new Schedule(
                2,
                3,
                16,
                17,
                1,
                117.5,
                "G7485"
        ), new Schedule(
                2,
                3,
                16,
                18,
                1,
                117.5,
                "G7615"
        ), new Schedule(
                2,
                3,
                17,
                19,
                2,
                208.5,
                "G1227"
        ), new Schedule(
                2,
                3,
                17,
                18,
                1,
                117.5,
                "G593"
        ), new Schedule(
                2,
                3,
                17,
                20,
                3,
                216.0,
                "G7491"
        ), new Schedule(
                2,
                3,
                18,
                19,
                1,
                117.5,
                "G59"
        ), new Schedule(
                2,
                3,
                18,
                20,
                1,
                81.0,
                "D2245"
        ), new Schedule(
                2,
                3,
                18,
                2,
                8,
                123.0,
                "K8401"
        ), new Schedule(
                2,
                3,
                19,
                20,
                1,
                117.5,
                "G7655"
        ), new Schedule(
                2,
                3,
                19,
                21,
                1,
                117.5,
                "G1861"
        ), new Schedule(
                2,
                3,
                19,
                2,
                6,
                110.5,
                "K551"
        ), new Schedule(
                2,
                3,
                20,
                21,
                1,
                119.0,
                "G253"
        ), new Schedule(
                2,
                3,
                20,
                3,
                6,
                110.5,
                "K347"
        ), new Schedule(
                2,
                3,
                20,
                22,
                1,
                117.5,
                "G37"
        ), new Schedule(
                2,
                3,
                21,
                22,
                1,
                62.0,
                "D2261"
        ), new Schedule(
                2,
                3,
                22,
                23,
                1,
                117.5,
                "G39"
        ), new Schedule(
                2,
                3,
                22,
                6,
                8,
                123.0,
                "K1805"
        ), new Schedule(
                2,
                0,
                19,
                20,
                1,
                785,
                "JD5662"
        ), new Schedule(
                2,
                0,
                15,
                17,
                2,
                890,
                "MU2831"
        ), new Schedule(
                2,
                0,
                18,
                20,
                2,
                890,
                "MU2851"
        ), new Schedule(
                2,
                0,
                8,
                10,
                2,
                1090,
                "MU2811"
        ), new Schedule(
                2,
                0,
                20,
                22,
                2,
                1090,
                "MU2861"
        ), new Schedule(
                2,
                0,
                16,
                18,
                2,
                1290,
                "MU2841"
        ), new Schedule(
                2,
                0,
                12,
                15,
                3,
                1680,
                "MU2821"
        ), new Schedule(
                2,
                0,
                17,
                19,
                2,
                2240,
                "CA1562"
        ), new Schedule(
                3,
                1,
                6,
                7,
                1,
                92.5,
                "G7358"
        ), new Schedule(
                3,
                1,
                6,
                8,
                1,
                73.0,
                "G7556"
        ), new Schedule(
                3,
                1,
                7,
                8,
                1,
                73.0,
                "G7558"
        ), new Schedule(
                3,
                1,
                7,
                9,
                1,
                73.0,
                "G7554"
        ), new Schedule(
                3,
                1,
                8,
                9,
                1,
                73.0,
                "G7372"
        ), new Schedule(
                3,
                1,
                9,
                10,
                1,
                73.0,
                "G7302"
        ), new Schedule(
                3,
                1,
                9,
                10,
                1,
                73.0,
                "G7330"
        ), new Schedule(
                3,
                1,
                9,
                11,
                1,
                77.5,
                "G7392"
        ), new Schedule(
                3,
                1,
                10,
                11,
                1,
                73.0,
                "G1228"
        ), new Schedule(
                3,
                1,
                10,
                12,
                1,
                73.0,
                "G7368"
        ), new Schedule(
                3,
                1,
                11,
                12,
                1,
                73.0,
                "G7576"
        ), new Schedule(
                3,
                1,
                12,
                13,
                1,
                73.0,
                "G7540"
        ), new Schedule(
                3,
                1,
                13,
                14,
                1,
                56.0,
                "D3102"
        ), new Schedule(
                3,
                1,
                13,
                14,
                1,
                73.0,
                "G1584"
        ), new Schedule(
                3,
                1,
                13,
                15,
                1,
                56.0,
                "D3104"
        ), new Schedule(
                3,
                1,
                14,
                15,
                1,
                73.0,
                "G86"
        ), new Schedule(
                3,
                1,
                14,
                15,
                1,
                73.0,
                "G7542"
        ), new Schedule(
                3,
                1,
                15,
                16,
                1,
                73.0,
                "G7592"
        ), new Schedule(
                3,
                1,
                15,
                17,
                1,
                88.0,
                "G7318"
        ), new Schedule(
                3,
                1,
                16,
                17,
                0,
                73.0,
                "G44"
        ), new Schedule(
                3,
                1,
                16,
                18,
                1,
                73.0,
                "G1674"
        ), new Schedule(
                3,
                1,
                17,
                18,
                1,
                73.0,
                "G7192"
        ), new Schedule(
                3,
                1,
                17,
                18,
                1,
                73.0,
                "G7600"
        ), new Schedule(
                3,
                1,
                17,
                19,
                1,
                73.0,
                "G7584"
        ), new Schedule(
                3,
                1,
                18,
                19,
                0,
                73.0,
                "G1510"
        ), new Schedule(
                3,
                1,
                19,
                20,
                1,
                56.0,
                "D3108"
        ), new Schedule(
                3,
                1,
                19,
                20,
                0,
                73.0,
                "G7596"
        ), new Schedule(
                3,
                1,
                20,
                21,
                1,
                92.5,
                "G7360"
        ), new Schedule(
                3,
                1,
                20,
                22,
                1,
                56.0,
                "D3146"
        ), new Schedule(
                3,
                1,
                21,
                22,
                1,
                73.0,
                "G1394"
        ), new Schedule(
                3,
                1,
                21,
                22,
                0,
                73.0,
                "G7340"
        ), new Schedule(
                3,
                1,
                22,
                23,
                1,
                73.0,
                "G2366"
        ), new Schedule(
                3,
                1,
                22,
                23,
                0,
                73.0,
                "G1338"
        ), new Schedule(
                3,
                2,
                2,
                8,
                5,
                123.0,
                "K526"
        ), new Schedule(
                3,
                2,
                6,
                8,
                1,
                119.0,
                "G254"
        ), new Schedule(
                3,
                2,
                7,
                8,
                1,
                117.5,
                "G1874"
        ), new Schedule(
                3,
                2,
                7,
                10,
                2,
                208.5,
                "G1866"
        ), new Schedule(
                3,
                2,
                7,
                9,
                1,
                71.0,
                "D2222"
        ), new Schedule(
                3,
                2,
                7,
                11,
                3,
                216.0,
                "G7492"
        ), new Schedule(
                3,
                2,
                8,
                9,
                1,
                95.0,
                "D656"
        ), new Schedule(
                3,
                2,
                8,
                11,
                3,
                216.0,
                "G7372"
        ), new Schedule(
                3,
                2,
                8,
                10,
                1,
                117.5,
                "G1882"
        ), new Schedule(
                3,
                2,
                9,
                10,
                1,
                117.5,
                "G36"
        ), new Schedule(
                3,
                2,
                9,
                11,
                2,
                208.5,
                "G42"
        ), new Schedule(
                3,
                2,
                9,
                12,
                2,
                208.5,
                "G7386"
        ), new Schedule(
                3,
                2,
                9,
                13,
                3,
                216.0,
                "G7572"
        ), new Schedule(
                3,
                2,
                10,
                12,
                2,
                208.5,
                "G1228"
        ), new Schedule(
                3,
                2,
                10,
                11,
                1,
                90.0,
                "D2246"
        ), new Schedule(
                3,
                2,
                10,
                15,
                5,
                123.0,
                "T112"
        ), new Schedule(
                3,
                2,
                11,
                14,
                3,
                216.0,
                "G7576"
        ), new Schedule(
                3,
                2,
                11,
                12,
                1,
                117.5,
                "G1492"
        ), new Schedule(
                3,
                2,
                11,
                18,
                6,
                123.0,
                "K1806"
        ), new Schedule(
                3,
                2,
                11,
                13,
                1,
                117.5,
                "G168"
        ), new Schedule(
                3,
                2,
                12,
                13,
                1,
                117.5,
                "G1496"
        ), new Schedule(
                3,
                2,
                12,
                14,
                1,
                117.5,
                "G7616"
        ), new Schedule(
                3,
                2,
                12,
                20,
                7,
                123.0,
                "K1512"
        ), new Schedule(
                3,
                2,
                13,
                14,
                1,
                117.5,
                "G32"
        ), new Schedule(
                3,
                2,
                13,
                15,
                1,
                117.5,
                "G1482"
        ), new Schedule(
                3,
                2,
                13,
                18,
                5,
                123.0,
                "Z176"
        ), new Schedule(
                3,
                2,
                13,
                20,
                6,
                123.0,
                "K48"
        ), new Schedule(
                3,
                2,
                14,
                15,
                1,
                119.0,
                "G282"
        ), new Schedule(
                3,
                2,
                14,
                16,
                1,
                117.5,
                "G52"
        ), new Schedule(
                3,
                2,
                14,
                18,
                3,
                167.0,
                "D3142"
        ), new Schedule(
                3,
                2,
                15,
                18,
                3,
                216.0,
                "G7592"
        ), new Schedule(
                3,
                2,
                15,
                16,
                1,
                117.5,
                "G1962"
        ), new Schedule(
                3,
                2,
                15,
                17,
                1,
                101.0,
                "D2188"
        ), new Schedule(
                3,
                2,
                16,
                17,
                1,
                117.5,
                "G7690"
        ), new Schedule(
                3,
                2,
                16,
                18,
                2,
                208.5,
                "G44"
        ), new Schedule(
                3,
                2,
                16,
                20,
                3,
                167.0,
                "D3136"
        ), new Schedule(
                3,
                2,
                16,
                21,
                4,
                123.0,
                "Z86"
        ), new Schedule(
                3,
                2,
                17,
                19,
                2,
                208.5,
                "G7192"
        ), new Schedule(
                3,
                2,
                17,
                22,
                5,
                123.0,
                "Z282"
        ), new Schedule(
                3,
                2,
                17,
                20,
                3,
                208.5,
                "G7600"
        ), new Schedule(
                3,
                2,
                17,
                18,
                1,
                117.5,
                "G7456"
        ), new Schedule(
                3,
                2,
                17,
                21,
                3,
                139.0,
                "D3126"
        ), new Schedule(
                3,
                2,
                17,
                1,
                7,
                123.0,
                "K8352"
        ), new Schedule(
                3,
                2,
                18,
                19,
                1,
                117.5,
                "G64"
        ), new Schedule(
                3,
                2,
                18,
                20,
                2,
                208.5,
                "G1510"
        ), new Schedule(
                3,
                2,
                18,
                21,
                2,
                208.5,
                "G1378"
        ), new Schedule(
                3,
                2,
                18,
                1,
                6,
                123.0,
                "K76"
        ), new Schedule(
                3,
                2,
                18,
                22,
                3,
                216.0,
                "G7588"
        ), new Schedule(
                3,
                2,
                19,
                20,
                1,
                117.5,
                "G40"
        ), new Schedule(
                3,
                2,
                19,
                2,
                7,
                123.0,
                "K1182"
        ), new Schedule(
                3,
                2,
                19,
                21,
                2,
                208.5,
                "G7596"
        ), new Schedule(
                3,
                2,
                19,
                1,
                5,
                110.5,
                "K102"
        ), new Schedule(
                3,
                2,
                19,
                22,
                3,
                216.0,
                "G7582"
        ), new Schedule(
                3,
                2,
                20,
                23,
                3,
                128.0,
                "D2282"
        ), new Schedule(
                3,
                2,
                20,
                0,
                3,
                80.0,
                "D712"
        ), new Schedule(
                3,
                2,
                20,
                2,
                5,
                110.5,
                "K552"
        ), new Schedule(
                3,
                2,
                20,
                22,
                1,
                117.5,
                "G1504"
        ), new Schedule(
                3,
                2,
                21,
                22,
                1,
                117.5,
                "G1668"
        ), new Schedule(
                3,
                2,
                21,
                23,
                1,
                117.5,
                "G1506"
        ), new Schedule(
                3,
                4,
                8,
                14,
                6,
                720.0,
                "G85"
        ), new Schedule(
                3,
                4,
                11,
                19,
                7,
                720.0,
                "G1301"
        ), new Schedule(
                3,
                4,
                12,
                5,
                16,
                296.5,
                "T169"
        ), new Schedule(
                3,
                4,
                15,
                21,
                6,
                720.0,
                "G99"
        ), new Schedule(
                3,
                4,
                16,
                23,
                7,
                720.0,
                "G1305"
        ), new Schedule(
                3,
                4,
                18,
                14,
                19,
                296.5,
                "K209"
        ), new Schedule(
                3,
                4,
                21,
                18,
                21,
                328.0,
                "K527"
        ), new Schedule(
                3,
                4,
                21,
                17,
                19,
                328.0,
                "K511"
        ), new Schedule(
                3,
                4,
                15,
                16,
                1,
                480,
                "MU5583"
        ), new Schedule(
                3,
                4,
                7,
                8,
                1,
                544,
                "MF8303"
        ), new Schedule(
                3,
                4,
                13,
                15,
                2,
                640,
                "MF1078"
        ), new Schedule(
                3,
                4,
                17,
                19,
                2,
                640,
                "MF1077"
        ), new Schedule(
                3,
                4,
                19,
                21,
                2,
                640,
                "MF1079"
        ), new Schedule(
                3,
                4,
                7,
                9,
                2,
                690,
                "HU7262"
        ), new Schedule(
                3,
                4,
                8,
                10,
                2,
                870,
                "MU5211"
        ), new Schedule(
                3,
                4,
                12,
                14,
                2,
                870,
                "MU5215"
        ), new Schedule(
                3,
                4,
                20,
                22,
                2,
                875,
                "JD5170"
        ), new Schedule(
                3,
                4,
                21,
                23,
                2,
                900,
                "ZH9982"
        ), new Schedule(
                3,
                4,
                10,
                12,
                2,
                914,
                "MF8381"
        ), new Schedule(
                3,
                4,
                16,
                18,
                2,
                950,
                "FM9351"
        ), new Schedule(
                3,
                4,
                15,
                17,
                2,
                984,
                "MF8319"
        ), new Schedule(
                3,
                4,
                14,
                16,
                2,
                1000,
                "MU5132"
        ), new Schedule(
                3,
                4,
                11,
                13,
                2,
                1018,
                "GJ8699"
        ), new Schedule(
                3,
                4,
                22,
                0,
                2,
                1070,
                "MF1031"
        ), new Schedule(
                3,
                4,
                14,
                17,
                3,
                1210,
                "MF1032"
        ), new Schedule(
                3,
                4,
                16,
                19,
                3,
                1210,
                "CZ3512"
        ), new Schedule(
                3,
                4,
                12,
                15,
                3,
                1440,
                "CZ3804"
        ), new Schedule(
                3,
                4,
                18,
                20,
                2,
                1440,
                "MU3118"
        ), new Schedule(
                4,
                5,
                6,
                10,
                4,
                463.5,
                "G296"
        ), new Schedule(
                4,
                5,
                6,
                11,
                4,
                463.5,
                "G276"
        ), new Schedule(
                4,
                5,
                7,
                11,
                4,
                463.5,
                "G832"
        ), new Schedule(
                4,
                5,
                7,
                12,
                4,
                463.5,
                "G72"
        ), new Schedule(
                4,
                5,
                8,
                12,
                3,
                463.5,
                "G2056"
        ), new Schedule(
                4,
                5,
                9,
                12,
                3,
                463.5,
                "G80"
        ), new Schedule(
                4,
                5,
                9,
                13,
                4,
                463.5,
                "G1004"
        ), new Schedule(
                4,
                5,
                9,
                14,
                4,
                463.5,
                "G542"
        ), new Schedule(
                4,
                5,
                10,
                13,
                3,
                463.5,
                "G66"
        ), new Schedule(
                4,
                5,
                10,
                14,
                4,
                463.5,
                "G1006"
        ), new Schedule(
                4,
                5,
                10,
                15,
                4,
                463.5,
                "G1112"
        ), new Schedule(
                4,
                5,
                11,
                15,
                4,
                463.5,
                "G1114"
        ), new Schedule(
                4,
                5,
                11,
                16,
                4,
                463.5,
                "G1152"
        ), new Schedule(
                4,
                5,
                12,
                16,
                4,
                463.5,
                "G1120"
        ), new Schedule(
                4,
                5,
                12,
                17,
                4,
                463.5,
                "G70"
        ), new Schedule(
                4,
                5,
                13,
                17,
                4,
                463.5,
                "G1032"
        ), new Schedule(
                4,
                5,
                13,
                18,
                4,
                463.5,
                "G1012"
        ), new Schedule(
                4,
                5,
                14,
                19,
                5,
                463.5,
                "G554"
        ), new Schedule(
                4,
                5,
                14,
                18,
                4,
                463.5,
                "G546"
        ), new Schedule(
                4,
                5,
                15,
                19,
                4,
                463.5,
                "G1146"
        ), new Schedule(
                4,
                5,
                15,
                20,
                4,
                463.5,
                "G1036"
        ), new Schedule(
                4,
                5,
                16,
                20,
                4,
                463.5,
                "G1014"
        ), new Schedule(
                4,
                5,
                16,
                21,
                4,
                463.5,
                "G1162"
        ), new Schedule(
                4,
                5,
                17,
                21,
                4,
                463.5,
                "G1020"
        ), new Schedule(
                4,
                5,
                17,
                22,
                4,
                463.5,
                "G1138"
        ), new Schedule(
                4,
                5,
                18,
                23,
                4,
                463.5,
                "G1140"
        ), new Schedule(
                4,
                6,
                7,
                17,
                9,
                574.0,
                "D1849"
        ), new Schedule(
                4,
                6,
                8,
                18,
                10,
                541.0,
                "D1806"
        ), new Schedule(
                4,
                6,
                9,
                19,
                10,
                566.0,
                "D1810"
        ), new Schedule(
                4,
                6,
                9,
                20,
                10,
                549.0,
                "D1853"
        ), new Schedule(
                4,
                6,
                10,
                20,
                10,
                541.0,
                "D1818"
        ), new Schedule(
                4,
                6,
                11,
                21,
                10,
                566.0,
                "D1822"
        ), new Schedule(
                4,
                6,
                11,
                23,
                35,
                408.0,
                "K587"
        ), new Schedule(
                4,
                6,
                12,
                21,
                9,
                566.0,
                "D1826"
        ), new Schedule(
                4,
                6,
                12,
                23,
                10,
                549.0,
                "D1857"
        ), new Schedule(
                4,
                6,
                13,
                17,
                28,
                414.0,
                "K486"
        ), new Schedule(
                4,
                6,
                13,
                23,
                10,
                541.0,
                "D1834"
        ), new Schedule(
                4,
                6,
                14,
                18,
                28,
                381.0,
                "K192"
        ), new Schedule(
                4,
                6,
                16,
                6,
                38,
                446.5,
                "K827"
        ), new Schedule(
                4,
                6,
                22,
                23,
                25,
                480.5,
                "Z122"
        ), new Schedule(
                4,
                3,
                7,
                2,
                18,
                328.0,
                "K528"
        ), new Schedule(
                4,
                3,
                8,
                14,
                6,
                720.0,
                "G86"
        ), new Schedule(
                4,
                3,
                8,
                6,
                21,
                328.0,
                "K512"
        ), new Schedule(
                4,
                3,
                12,
                18,
                6,
                720.0,
                "G100"
        ), new Schedule(
                4,
                3,
                13,
                20,
                7,
                720.0,
                "G1304"
        ), new Schedule(
                4,
                3,
                14,
                7,
                16,
                296.5,
                "T170"
        ), new Schedule(
                4,
                3,
                15,
                22,
                6,
                720.0,
                "G1306"
        ), new Schedule(
                4,
                3,
                15,
                23,
                7,
                720.0,
                "G1404"
        ), new Schedule(
                4,
                3,
                20,
                13,
                16,
                296.5,
                "K210"
        ), new Schedule(
                4,
                3,
                23,
                0,
                1,
                380,
                "MU5584"
        ), new Schedule(
                4,
                3,
                11,
                12,
                1,
                530,
                "CZ3823"
        ), new Schedule(
                4,
                3,
                9,
                11,
                2,
                624,
                "MF8304"
        ), new Schedule(
                4,
                3,
                17,
                18,
                1,
                700,
                "CZ6875"
        ), new Schedule(
                4,
                3,
                21,
                22,
                1,
                837,
                "MF8388"
        ), new Schedule(
                4,
                3,
                15,
                16,
                1,
                860,
                "MF1080"
        ), new Schedule(
                4,
                6,
                8,
                10,
                2,
                900,
                "MU2653"
        ), new Schedule(
                4,
                6,
                22,
                0,
                2,
                910,
                "CA4588"
        ), new Schedule(
                4,
                6,
                7,
                9,
                2,
                990,
                "CA8221"
        ), new Schedule(
                4,
                6,
                21,
                0,
                3,
                1000,
                "3U8986"
        ), new Schedule(
                4,
                6,
                19,
                21,
                2,
                1014,
                "EU2714"
        ), new Schedule(
                4,
                6,
                10,
                12,
                2,
                1360,
                "MU2464"
        ), new Schedule(
                4,
                6,
                13,
                15,
                2,
                1360,
                "MU2651"
        ), new Schedule(
                4,
                6,
                18,
                20,
                2,
                1360,
                "MU2458"
        ), new Schedule(
                4,
                3,
                7,
                9,
                2,
                647,
                "FM9352"
        ), new Schedule(
                4,
                3,
                23,
                1,
                2,
                682,
                "JD5169"
        ), new Schedule(
                4,
                3,
                11,
                13,
                2,
                733,
                "HU7261"
        ), new Schedule(
                4,
                3,
                18,
                21,
                3,
                891,
                "MF8320"
        ), new Schedule(
                4,
                3,
                7,
                10,
                3,
                907,
                "MF1015"
        ), new Schedule(
                4,
                3,
                17,
                20,
                3,
                907,
                "MU5216"
        ), new Schedule(
                4,
                3,
                20,
                22,
                2,
                907,
                "MU5218"
        ), new Schedule(
                4,
                3,
                10,
                12,
                2,
                917,
                "CA1720"
        ), new Schedule(
                4,
                3,
                17,
                19,
                2,
                917,
                "CA1722"
        ), new Schedule(
                4,
                3,
                18,
                20,
                2,
                977,
                "MF1016"
        ), new Schedule(
                4,
                3,
                19,
                21,
                2,
                977,
                "CZ3849"
        ), new Schedule(
                4,
                3,
                13,
                16,
                3,
                1031,
                "MF8382"
        ), new Schedule(
                4,
                3,
                13,
                15,
                2,
                1047,
                "CZ3511"
        ), new Schedule(
                4,
                3,
                14,
                17,
                3,
                1047,
                "CZ3501"
        ), new Schedule(
                4,
                3,
                15,
                18,
                3,
                1047,
                "MF1020"
        ), new Schedule(
                4,
                6,
                6,
                8,
                2,
                677,
                "CZ8647"
        ), new Schedule(
                4,
                6,
                10,
                13,
                3,
                877,
                "3U8738"
        ), new Schedule(
                4,
                6,
                16,
                19,
                3,
                877,
                "3U8744"
        ), new Schedule(
                4,
                6,
                17,
                19,
                2,
                877,
                "3U8734"
        ), new Schedule(
                4,
                6,
                9,
                11,
                2,
                937,
                "CZ3437"
        ), new Schedule(
                4,
                6,
                12,
                14,
                2,
                937,
                "MF1568"
        ), new Schedule(
                4,
                6,
                18,
                21,
                3,
                937,
                "MF1562"
        ), new Schedule(
                4,
                6,
                21,
                23,
                2,
                947,
                "ZH9443"
        ), new Schedule(
                4,
                6,
                16,
                18,
                2,
                1009,
                "HU7351"
        ), new Schedule(
                4,
                6,
                11,
                13,
                2,
                1027,
                "CA4306"
        ), new Schedule(
                4,
                6,
                15,
                17,
                2,
                1027,
                "CA4318"
        ), new Schedule(
                4,
                6,
                17,
                20,
                3,
                1027,
                "CA4302"
        ), new Schedule(
                4,
                6,
                20,
                23,
                3,
                1027,
                "CA4304"
        ), new Schedule(
                4,
                6,
                15,
                18,
                3,
                1297,
                "MF1557"
        ), new Schedule(
                5,
                0,
                8,
                13,
                5,
                520.5,
                "G510"
        ), new Schedule(
                5,
                0,
                8,
                12,
                4,
                520.5,
                "G588"
        ), new Schedule(
                5,
                0,
                8,
                14,
                5,
                520.5,
                "G534"
        ), new Schedule(
                5,
                0,
                9,
                14,
                5,
                520.5,
                "G502"
        ), new Schedule(
                5,
                0,
                10,
                15,
                5,
                520.5,
                "G572"
        ), new Schedule(
                5,
                0,
                12,
                18,
                6,
                520.5,
                "G72"
        ), new Schedule(
                5,
                0,
                12,
                17,
                4,
                520.5,
                "G80"
        ), new Schedule(
                5,
                0,
                13,
                17,
                4,
                520.5,
                "G516"
        ), new Schedule(
                5,
                0,
                13,
                18,
                4,
                520.5,
                "G66"
        ), new Schedule(
                5,
                0,
                14,
                18,
                4,
                520.5,
                "G404"
        ), new Schedule(
                5,
                0,
                15,
                21,
                5,
                520.5,
                "G68"
        ), new Schedule(
                5,
                0,
                16,
                20,
                4,
                520.5,
                "G422"
        ), new Schedule(
                5,
                0,
                16,
                21,
                5,
                520.5,
                "G402"
        ), new Schedule(
                5,
                0,
                16,
                22,
                5,
                520.5,
                "G506"
        ), new Schedule(
                5,
                0,
                17,
                22,
                5,
                520.5,
                "G70"
        ), new Schedule(
                5,
                0,
                18,
                23,
                4,
                520.5,
                "G406"
        ), new Schedule(
                5,
                7,
                9,
                14,
                5,
                454.5,
                "G856"
        ), new Schedule(
                5,
                7,
                10,
                14,
                4,
                454.5,
                "G640"
        ), new Schedule(
                5,
                7,
                10,
                16,
                5,
                454.5,
                "G864"
        ), new Schedule(
                5,
                7,
                11,
                16,
                4,
                454.5,
                "G832"
        ), new Schedule(
                5,
                7,
                12,
                17,
                4,
                454.5,
                "G852"
        ), new Schedule(
                5,
                7,
                12,
                16,
                3,
                454.5,
                "G96"
        ), new Schedule(
                5,
                7,
                14,
                19,
                4,
                454.5,
                "G818"
        ), new Schedule(
                5,
                7,
                15,
                20,
                4,
                454.5,
                "G836"
        ), new Schedule(
                5,
                7,
                16,
                21,
                4,
                454.5,
                "G844"
        ), new Schedule(
                5,
                7,
                17,
                22,
                5,
                454.5,
                "G860"
        ), new Schedule(
                5,
                7,
                17,
                23,
                5,
                454.5,
                "G868"
        ), new Schedule(
                5,
                7,
                18,
                22,
                4,
                454.5,
                "G840"
        ), new Schedule(
                5,
                2,
                8,
                10,
                2,
                200.5,
                "G1722"
        ), new Schedule(
                5,
                2,
                8,
                11,
                2,
                153.5,
                "G1738"
        ), new Schedule(
                5,
                2,
                9,
                12,
                3,
                200.5,
                "G1778"
        ), new Schedule(
                5,
                2,
                10,
                13,
                2,
                200.5,
                "G1730"
        ), new Schedule(
                5,
                2,
                11,
                14,
                3,
                200.5,
                "G1744"
        ), new Schedule(
                5,
                2,
                13,
                16,
                2,
                200.5,
                "G678"
        ), new Schedule(
                5,
                2,
                14,
                17,
                2,
                200.5,
                "G596"
        ), new Schedule(
                5,
                2,
                15,
                17,
                2,
                200.5,
                "G600"
        ), new Schedule(
                5,
                2,
                15,
                18,
                2,
                200.5,
                "G1546"
        ), new Schedule(
                5,
                2,
                16,
                19,
                2,
                200.5,
                "G578"
        ), new Schedule(
                5,
                2,
                17,
                20,
                2,
                200.5,
                "G580"
        ), new Schedule(
                5,
                2,
                18,
                21,
                2,
                200.5,
                "G1540"
        ), new Schedule(
                5,
                2,
                19,
                22,
                2,
                200.5,
                "G1128"
        ), new Schedule(
                5,
                6,
                6,
                16,
                9,
                374.0,
                "D632"
        ), new Schedule(
                5,
                6,
                7,
                17,
                9,
                379.5,
                "D366"
        ), new Schedule(
                5,
                6,
                11,
                21,
                9,
                379.5,
                "D2236"
        ), new Schedule(
                5,
                6,
                12,
                22,
                9,
                379.5,
                "D2242"
        ), new Schedule(
                5,
                4,
                6,
                11,
                4,
                463.5,
                "G1103"
        ), new Schedule(
                5,
                4,
                7,
                11,
                4,
                463.5,
                "G1001"
        ), new Schedule(
                5,
                4,
                7,
                12,
                4,
                463.5,
                "G1003"
        ), new Schedule(
                5,
                4,
                8,
                12,
                4,
                463.5,
                "G1005"
        ), new Schedule(
                5,
                4,
                9,
                12,
                3,
                463.5,
                "G77"
        ), new Schedule(
                5,
                4,
                9,
                13,
                4,
                463.5,
                "G1109"
        ), new Schedule(
                5,
                4,
                9,
                14,
                4,
                463.5,
                "G1009"
        ), new Schedule(
                5,
                4,
                10,
                15,
                4,
                463.5,
                "G1035"
        ), new Schedule(
                5,
                4,
                10,
                14,
                4,
                463.5,
                "G1113"
        ), new Schedule(
                5,
                4,
                11,
                15,
                4,
                463.5,
                "G1161"
        ), new Schedule(
                5,
                4,
                11,
                16,
                4,
                463.5,
                "G1031"
        ), new Schedule(
                5,
                4,
                12,
                16,
                4,
                463.5,
                "G1165"
        ), new Schedule(
                5,
                4,
                13,
                17,
                4,
                463.5,
                "G73"
        ), new Schedule(
                5,
                4,
                13,
                18,
                4,
                463.5,
                "G1015"
        ), new Schedule(
                5,
                4,
                14,
                18,
                4,
                463.5,
                "G279"
        ), new Schedule(
                5,
                4,
                15,
                19,
                4,
                463.5,
                "G275"
        ), new Schedule(
                5,
                4,
                15,
                20,
                4,
                463.5,
                "G1019"
        ), new Schedule(
                5,
                4,
                16,
                20,
                4,
                463.5,
                "G831"
        ), new Schedule(
                5,
                4,
                16,
                21,
                4,
                463.5,
                "G75"
        ), new Schedule(
                5,
                4,
                17,
                21,
                4,
                463.5,
                "G835"
        ), new Schedule(
                5,
                4,
                17,
                22,
                4,
                463.5,
                "G1133"
        ), new Schedule(
                5,
                4,
                18,
                22,
                4,
                463.5,
                "G67"
        ), new Schedule(
                5,
                4,
                18,
                23,
                4,
                463.5,
                "G1743"
        ), new Schedule(
                5,
                4,
                19,
                23,
                4,
                463.5,
                "G295"
        ), new Schedule(
                6,
                10,
                20,
                7,
                35,
                491.5,
                "K2058"
        ), new Schedule(
                6,
                7,
                7,
                10,
                3,
                263.0,
                "G350"
        ), new Schedule(
                6,
                7,
                7,
                11,
                4,
                263.0,
                "D1912"
        ), new Schedule(
                6,
                7,
                7,
                23,
                16,
                194.0,
                "K546"
        ), new Schedule(
                6,
                7,
                7,
                12,
                4,
                263.0,
                "D1914"
        ), new Schedule(
                6,
                7,
                8,
                12,
                3,
                263.0,
                "G2204"
        ), new Schedule(
                6,
                7,
                8,
                22,
                13,
                194.0,
                "T8"
        ), new Schedule(
                6,
                7,
                9,
                12,
                3,
                263.0,
                "D1918"
        ), new Schedule(
                6,
                7,
                9,
                13,
                4,
                263.0,
                "D1920"
        ), new Schedule(
                6,
                7,
                10,
                14,
                4,
                263.0,
                "D1922"
        ), new Schedule(
                6,
                7,
                11,
                15,
                4,
                263.0,
                "G1888"
        ), new Schedule(
                6,
                7,
                11,
                16,
                4,
                263.0,
                "G1832"
        ), new Schedule(
                6,
                7,
                12,
                16,
                4,
                263.0,
                "D1926"
        ), new Schedule(
                6,
                7,
                13,
                17,
                4,
                263.0,
                "D1930"
        ), new Schedule(
                6,
                7,
                14,
                17,
                3,
                263.0,
                "D1934"
        ), new Schedule(
                6,
                7,
                14,
                18,
                4,
                263.0,
                "D1936"
        ), new Schedule(
                6,
                7,
                15,
                18,
                3,
                263.0,
                "G90"
        ), new Schedule(
                6,
                7,
                15,
                19,
                4,
                263.0,
                "D1938"
        ), new Schedule(
                6,
                7,
                16,
                19,
                3,
                263.0,
                "G2214"
        ), new Schedule(
                6,
                7,
                16,
                20,
                4,
                263.0,
                "D1942"
        ), new Schedule(
                6,
                7,
                17,
                20,
                3,
                263.0,
                "D1944"
        ), new Schedule(
                6,
                7,
                17,
                21,
                3,
                263.0,
                "D1946"
        ), new Schedule(
                6,
                7,
                18,
                22,
                4,
                263.0,
                "D1950"
        ), new Schedule(
                6,
                7,
                18,
                23,
                4,
                263.0,
                "D1952"
        ), new Schedule(
                6,
                7,
                19,
                12,
                16,
                215.0,
                "K1364"
        ), new Schedule(
                6,
                7,
                21,
                12,
                15,
                194.0,
                "K246"
        ), new Schedule(
                6,
                7,
                21,
                8,
                11,
                230.0,
                "K292"
        ), new Schedule(
                6,
                7,
                22,
                8,
                9,
                230.0,
                "K998"
        ), new Schedule(
                6,
                5,
                6,
                16,
                9,
                379.5,
                "D2244"
        ), new Schedule(
                6,
                5,
                9,
                18,
                9,
                379.5,
                "D2238"
        ), new Schedule(
                6,
                5,
                10,
                20,
                9,
                379.5,
                "D368"
        ), new Schedule(
                6,
                5,
                13,
                23,
                9,
                362.0,
                "D634"
        ), new Schedule(
                6,
                4,
                6,
                15,
                9,
                566.0,
                "D1841"
        ), new Schedule(
                6,
                4,
                7,
                17,
                10,
                549.0,
                "D1854"
        ), new Schedule(
                6,
                4,
                7,
                16,
                8,
                566.0,
                "D1801"
        ), new Schedule(
                6,
                4,
                9,
                12,
                27,
                381.0,
                "K194"
        ), new Schedule(
                6,
                4,
                9,
                19,
                9,
                549.0,
                "D1858"
        ), new Schedule(
                6,
                4,
                10,
                19,
                9,
                541.0,
                "D1820"
        ), new Schedule(
                6,
                4,
                10,
                20,
                10,
                541.0,
                "D1824"
        ), new Schedule(
                6,
                4,
                12,
                17,
                28,
                414.0,
                "K488"
        ), new Schedule(
                6,
                4,
                12,
                22,
                9,
                566.0,
                "D1825"
        ), new Schedule(
                6,
                4,
                13,
                23,
                9,
                574.0,
                "D1851"
        ), new Schedule(
                6,
                4,
                14,
                23,
                9,
                566.0,
                "D1833"
        ), new Schedule(
                6,
                4,
                17,
                18,
                25,
                480.5,
                "Z124"
        ), new Schedule(
                6,
                4,
                9,
                11,
                2,
                690,
                "MU2457"
        ), new Schedule(
                6,
                4,
                10,
                11,
                1,
                690,
                "MU2654"
        ), new Schedule(
                6,
                4,
                22,
                0,
                2,
                810,
                "MU2658"
        ), new Schedule(
                6,
                4,
                10,
                12,
                2,
                839,
                "EU2713"
        ), new Schedule(
                6,
                4,
                11,
                13,
                2,
                1000,
                "CZ3448"
        ), new Schedule(
                6,
                4,
                17,
                19,
                2,
                1080,
                "MU2652"
        ), new Schedule(
                6,
                4,
                19,
                21,
                2,
                1130,
                "CA4587"
        ), new Schedule(
                6,
                4,
                14,
                15,
                1,
                1230,
                "3U8985"
        ), new Schedule(
                6,
                4,
                7,
                9,
                2,
                612,
                "EU2235"
        ), new Schedule(
                6,
                4,
                21,
                0,
                3,
                637,
                "CZ3484"
        ), new Schedule(
                6,
                4,
                22,
                1,
                3,
                637,
                "CZ3428"
        ), new Schedule(
                6,
                4,
                7,
                10,
                3,
                647,
                "CA4305"
        ), new Schedule(
                6,
                4,
                20,
                23,
                3,
                677,
                "JD5162"
        ), new Schedule(
                6,
                4,
                12,
                15,
                3,
                707,
                "3U8743"
        ), new Schedule(
                6,
                4,
                13,
                15,
                2,
                707,
                "3U8733"
        ), new Schedule(
                6,
                4,
                15,
                17,
                2,
                707,
                "3U8645"
        ), new Schedule(
                6,
                4,
                18,
                21,
                3,
                707,
                "3U8735"
        ), new Schedule(
                6,
                4,
                10,
                13,
                3,
                757,
                "CZ3404"
        ), new Schedule(
                6,
                4,
                16,
                18,
                2,
                757,
                "CZ3444"
        ), new Schedule(
                6,
                4,
                8,
                10,
                2,
                787,
                "ZH9444"
        ), new Schedule(
                6,
                4,
                12,
                14,
                2,
                827,
                "CA4317"
        ), new Schedule(
                6,
                4,
                11,
                14,
                3,
                837,
                "CZ3402"
        ), new Schedule(
                6,
                4,
                13,
                16,
                3,
                837,
                "CZ8648"
        ), new Schedule(
                6,
                4,
                19,
                22,
                3,
                852,
                "HU7352"
        ), new Schedule(
                6,
                10,
                19,
                23,
                4,
                980,
                "CZ6882"
        ), new Schedule(
                6,
                10,
                6,
                10,
                4,
                1020,
                "CA4151"
        ), new Schedule(
                6,
                10,
                18,
                22,
                4,
                1020,
                "CA4191"
        ), new Schedule(
                6,
                10,
                8,
                11,
                3,
                1110,
                "3U8525"
        ), new Schedule(
                6,
                10,
                16,
                21,
                5,
                1110,
                "3U8062"
        ), new Schedule(
                6,
                10,
                16,
                19,
                3,
                1110,
                "CA4153"
        ), new Schedule(
                6,
                10,
                18,
                21,
                3,
                1110,
                "3U8841"
        ), new Schedule(
                6,
                10,
                12,
                16,
                4,
                1170,
                "CZ6942"
        ), new Schedule(
                6,
                10,
                15,
                19,
                4,
                1170,
                "CZ6926"
        ), new Schedule(
                6,
                7,
                6,
                7,
                1,
                311,
                "3U8379"
        ), new Schedule(
                6,
                7,
                13,
                14,
                1,
                610,
                "3U8769"
        ), new Schedule(
                6,
                7,
                21,
                23,
                2,
                753,
                "TV9905"
        ), new Schedule(
                7,
                0,
                1,
                14,
                12,
                254.5,
                "Z152"
        ), new Schedule(
                7,
                0,
                7,
                13,
                5,
                515.5,
                "G652"
        ), new Schedule(
                7,
                0,
                9,
                15,
                6,
                515.5,
                "G672"
        ), new Schedule(
                7,
                0,
                9,
                13,
                4,
                515.5,
                "G26"
        ), new Schedule(
                7,
                0,
                10,
                15,
                5,
                515.5,
                "G656"
        ), new Schedule(
                7,
                0,
                10,
                14,
                4,
                515.5,
                "G350"
        ), new Schedule(
                7,
                0,
                11,
                16,
                5,
                515.5,
                "G660"
        ), new Schedule(
                7,
                0,
                12,
                18,
                5,
                515.5,
                "G658"
        ), new Schedule(
                7,
                0,
                13,
                5,
                16,
                261.5,
                "K1364"
        ), new Schedule(
                7,
                0,
                13,
                18,
                5,
                515.5,
                "G430"
        ), new Schedule(
                7,
                0,
                13,
                17,
                4,
                515.5,
                "G88"
        ), new Schedule(
                7,
                0,
                14,
                19,
                5,
                515.5,
                "G574"
        ), new Schedule(
                7,
                0,
                14,
                20,
                5,
                515.5,
                "G664"
        ), new Schedule(
                7,
                0,
                16,
                21,
                5,
                515.5,
                "G666"
        ), new Schedule(
                7,
                0,
                17,
                21,
                4,
                515.5,
                "G428"
        ), new Schedule(
                7,
                0,
                17,
                23,
                5,
                515.5,
                "G674"
        ), new Schedule(
                7,
                0,
                17,
                22,
                5,
                515.5,
                "G668"
        ), new Schedule(
                7,
                0,
                17,
                6,
                12,
                254.5,
                "T232"
        ), new Schedule(
                7,
                0,
                18,
                22,
                4,
                515.5,
                "G90"
        ), new Schedule(
                7,
                0,
                19,
                6,
                11,
                254.5,
                "Z20"
        ), new Schedule(
                7,
                0,
                19,
                8,
                12,
                268.5,
                "Z44"
        ), new Schedule(
                7,
                0,
                19,
                9,
                13,
                268.5,
                "T42"
        ), new Schedule(
                7,
                0,
                21,
                10,
                13,
                254.5,
                "T56"
        ), new Schedule(
                7,
                0,
                22,
                12,
                13,
                268.5,
                "T8"
        ), new Schedule(
                7,
                9,
                8,
                23,
                14,
                238.5,
                "K998"
        ), new Schedule(
                7,
                9,
                18,
                7,
                13,
                238.5,
                "K1674"
        ), new Schedule(
                7,
                5,
                7,
                11,
                4,
                454.5,
                "G870"
        ), new Schedule(
                7,
                5,
                7,
                12,
                5,
                454.5,
                "G2390"
        ), new Schedule(
                7,
                5,
                9,
                14,
                4,
                454.5,
                "G820"
        ), new Schedule(
                7,
                5,
                9,
                13,
                3,
                454.5,
                "G98"
        ), new Schedule(
                7,
                5,
                10,
                15,
                4,
                454.5,
                "G862"
        ), new Schedule(
                7,
                5,
                11,
                15,
                4,
                454.5,
                "G824"
        ), new Schedule(
                7,
                5,
                11,
                16,
                4,
                454.5,
                "G834"
        ), new Schedule(
                7,
                5,
                12,
                16,
                4,
                454.5,
                "G838"
        ), new Schedule(
                7,
                5,
                12,
                17,
                4,
                454.5,
                "G828"
        ), new Schedule(
                7,
                5,
                13,
                17,
                4,
                454.5,
                "G842"
        ), new Schedule(
                7,
                5,
                13,
                18,
                4,
                454.5,
                "G846"
        ), new Schedule(
                7,
                5,
                14,
                19,
                5,
                454.5,
                "G854"
        ), new Schedule(
                7,
                5,
                15,
                19,
                4,
                454.5,
                "G858"
        ), new Schedule(
                7,
                6,
                6,
                22,
                16,
                194.0,
                "K545"
        ), new Schedule(
                7,
                6,
                6,
                20,
                13,
                194.0,
                "T7"
        ), new Schedule(
                7,
                6,
                7,
                11,
                4,
                263.0,
                "D1911"
        ), new Schedule(
                7,
                6,
                8,
                11,
                3,
                263.0,
                "G2855"
        ), new Schedule(
                7,
                6,
                8,
                12,
                4,
                263.0,
                "D1915"
        ), new Schedule(
                7,
                6,
                9,
                12,
                3,
                263.0,
                "D1917"
        ), new Schedule(
                7,
                6,
                9,
                13,
                4,
                263.0,
                "D1919"
        ), new Schedule(
                7,
                6,
                10,
                14,
                4,
                263.0,
                "D1923"
        ), new Schedule(
                7,
                6,
                11,
                14,
                3,
                263.0,
                "G89"
        ), new Schedule(
                7,
                6,
                11,
                15,
                3,
                263.0,
                "D1927"
        ), new Schedule(
                7,
                6,
                12,
                16,
                4,
                263.0,
                "D1931"
        ), new Schedule(
                7,
                6,
                12,
                17,
                4,
                263.0,
                "D1933"
        ), new Schedule(
                7,
                6,
                13,
                7,
                18,
                215.0,
                "K1363"
        ), new Schedule(
                7,
                6,
                13,
                17,
                4,
                263.0,
                "D1935"
        ), new Schedule(
                7,
                6,
                14,
                17,
                3,
                263.0,
                "D1937"
        ), new Schedule(
                7,
                6,
                14,
                18,
                3,
                263.0,
                "G1709"
        ), new Schedule(
                7,
                6,
                15,
                19,
                3,
                263.0,
                "G571"
        ), new Schedule(
                7,
                6,
                15,
                18,
                3,
                263.0,
                "D1941"
        ), new Schedule(
                7,
                6,
                16,
                20,
                4,
                263.0,
                "D1943"
        ), new Schedule(
                7,
                6,
                17,
                20,
                3,
                263.0,
                "G1835"
        ), new Schedule(
                7,
                6,
                17,
                21,
                4,
                263.0,
                "G2231"
        ), new Schedule(
                7,
                6,
                18,
                21,
                3,
                263.0,
                "D1947"
        ), new Schedule(
                7,
                6,
                18,
                22,
                3,
                263.0,
                "D1949"
        ), new Schedule(
                7,
                6,
                19,
                23,
                3,
                263.0,
                "G2211"
        ), new Schedule(
                7,
                6,
                19,
                22,
                3,
                263.0,
                "G349"
        ), new Schedule(
                7,
                0,
                23,
                0,
                1,
                502,
                "HU7738"
        ), new Schedule(
                7,
                0,
                22,
                0,
                2,
                507,
                "MU2119"
        ), new Schedule(
                7,
                0,
                9,
                10,
                1,
                537,
                "MU2103"
        ), new Schedule(
                7,
                0,
                6,
                7,
                1,
                547,
                "MU5715"
        ), new Schedule(
                7,
                0,
                8,
                9,
                1,
                547,
                "MU2101"
        ), new Schedule(
                7,
                0,
                11,
                13,
                2,
                597,
                "MU2105"
        ), new Schedule(
                7,
                0,
                12,
                14,
                2,
                597,
                "MU2107"
        ), new Schedule(
                7,
                0,
                21,
                23,
                2,
                657,
                "MU2117"
        ), new Schedule(
                7,
                0,
                10,
                12,
                2,
                672,
                "HU7138"
        ), new Schedule(
                7,
                0,
                8,
                10,
                2,
                907,
                "CA1206"
        ), new Schedule(
                7,
                0,
                11,
                12,
                1,
                1367,
                "CA1232"
        ), new Schedule(
                7,
                0,
                14,
                15,
                1,
                1367,
                "MU2109"
        ), new Schedule(
                7,
                0,
                17,
                19,
                2,
                1367,
                "MU2113"
        ), new Schedule(
                7,
                0,
                18,
                20,
                2,
                1367,
                "MU2115"
        ), new Schedule(
                7,
                0,
                20,
                22,
                2,
                1547,
                "HU7238"
        ), new Schedule(
                7,
                0,
                16,
                18,
                2,
                1577,
                "MU2111"
        ), new Schedule(
                7,
                0,
                13,
                15,
                2,
                2127,
                "CA1210"
        ), new Schedule(
                7,
                0,
                15,
                17,
                2,
                2217,
                "CA1224"
        ), new Schedule(
                7,
                0,
                19,
                21,
                2,
                2217,
                "CA1472"
        ), new Schedule(
                7,
                6,
                6,
                7,
                1,
                300,
                "3U8380"
        ), new Schedule(
                7,
                6,
                23,
                0,
                1,
                345,
                "TV9906"
        ), new Schedule(
                7,
                9,
                8,
                10,
                2,
                307,
                "GS7617"
        ), new Schedule(
                7,
                9,
                11,
                13,
                2,
                310,
                "CZ6319"
        ), new Schedule(
                7,
                9,
                20,
                22,
                2,
                320,
                "MU2355"
        ), new Schedule(
                7,
                9,
                6,
                8,
                2,
                400,
                "G54895"
        ), new Schedule(
                7,
                9,
                10,
                12,
                2,
                400,
                "CA1666"
        ), new Schedule(
                7,
                9,
                13,
                14,
                1,
                405,
                "FU6628"
        ), new Schedule(
                7,
                9,
                14,
                16,
                2,
                419,
                "GS6637"
        ), new Schedule(
                7,
                9,
                8,
                11,
                3,
                602,
                "GS6646"
        ), new Schedule(
                8,
                0,
                1,
                21,
                20,
                296.5,
                "K40"
        ), new Schedule(
                8,
                0,
                7,
                14,
                7,
                306.5,
                "D28"
        ), new Schedule(
                8,
                0,
                9,
                17,
                7,
                306.5,
                "D26"
        ), new Schedule(
                8,
                0,
                10,
                18,
                7,
                306.5,
                "D102"
        ), new Schedule(
                8,
                0,
                10,
                21,
                10,
                261.5,
                "Z158"
        ), new Schedule(
                8,
                0,
                11,
                8,
                21,
                288.5,
                "K1304"
        ), new Schedule(
                8,
                0,
                12,
                20,
                8,
                544.0,
                "G394"
        ), new Schedule(
                8,
                0,
                14,
                22,
                7,
                313.5,
                "D30"
        ), new Schedule(
                8,
                0,
                16,
                23,
                7,
                541.5,
                "G382"
        ), new Schedule(
                8,
                0,
                16,
                13,
                20,
                296.5,
                "K350"
        ), new Schedule(
                8,
                0,
                17,
                9,
                16,
                268.5,
                "K340"
        ), new Schedule(
                8,
                0,
                19,
                6,
                10,
                241.5,
                "Z204"
        ), new Schedule(
                8,
                0,
                21,
                7,
                10,
                409.5,
                "Z16"
        ), new Schedule(
                8,
                0,
                21,
                8,
                10,
                261.5,
                "Z84"
        ), new Schedule(
                8,
                0,
                21,
                10,
                13,
                261.5,
                "T298"
        ), new Schedule(
                8,
                0,
                22,
                9,
                11,
                261.5,
                "T48"
        ), new Schedule(
                8,
                0,
                20,
                0,
                4,
                449,
                "KN5530"
        ), new Schedule(
                8,
                0,
                22,
                0,
                2,
                615,
                "CN7150"
        ), new Schedule(
                8,
                0,
                15,
                17,
                2,
                930,
                "MU2468"
        ), new Schedule(
                8,
                0,
                17,
                19,
                2,
                930,
                "MU2718"
        ), new Schedule(
                8,
                0,
                8,
                10,
                2,
                970,
                "CA1640"
        ), new Schedule(
                8,
                0,
                7,
                9,
                2,
                980,
                "CZ6201"
        ), new Schedule(
                8,
                0,
                10,
                12,
                2,
                985,
                "HU7130"
        ), new Schedule(
                8,
                0,
                16,
                18,
                2,
                1050,
                "CZ6203"
        ), new Schedule(
                8,
                0,
                19,
                22,
                3,
                1140,
                "CA1612"
        ), new Schedule(
                8,
                0,
                21,
                23,
                2,
                1140,
                "CA1622"
        ), new Schedule(
                8,
                0,
                19,
                21,
                2,
                1190,
                "CZ6280"
        ), new Schedule(
                8,
                0,
                11,
                13,
                2,
                1400,
                "CA1644"
        ), new Schedule(
                8,
                0,
                15,
                18,
                3,
                1400,
                "CA1624"
        ), new Schedule(
                8,
                0,
                14,
                16,
                2,
                1410,
                "CZ6658"
        ), new Schedule(
                9,
                0,
                0,
                14,
                14,
                147.0,
                "1134"
        ), new Schedule(
                9,
                0,
                0,
                9,
                9,
                158.0,
                "Z180"
        ), new Schedule(
                9,
                0,
                0,
                12,
                11,
                158.0,
                "K1178"
        ), new Schedule(
                9,
                0,
                1,
                11,
                10,
                158.0,
                "K886"
        ), new Schedule(
                9,
                0,
                8,
                19,
                10,
                158.0,
                "K618"
        ), new Schedule(
                9,
                0,
                8,
                18,
                9,
                158.0,
                "Z284"
        ), new Schedule(
                9,
                0,
                9,
                19,
                9,
                158.0,
                "K42"
        ), new Schedule(
                9,
                0,
                12,
                21,
                9,
                158.0,
                "Z318"
        ), new Schedule(
                9,
                0,
                19,
                4,
                9,
                158.0,
                "K56"
        ), new Schedule(
                9,
                0,
                21,
                7,
                9,
                158.0,
                "K90"
        ), new Schedule(
                9,
                0,
                22,
                8,
                10,
                158.0,
                "K264"
        ), new Schedule(
                9,
                0,
                23,
                9,
                10,
                158.0,
                "K396"
        ), new Schedule(
                9,
                0,
                23,
                13,
                13,
                158.0,
                "K712"
        ), new Schedule(
                9,
                10,
                23,
                6,
                30,
                483.5,
                "Z179"
        ), new Schedule(
                9,
                7,
                16,
                6,
                13,
                238.5,
                "K655"
        ), new Schedule(
                9,
                7,
                18,
                7,
                13,
                238.5,
                "K691"
        ), new Schedule(
                9,
                7,
                19,
                9,
                13,
                238.5,
                "K1315"
        ), new Schedule(
                9,
                7,
                21,
                11,
                13,
                238.5,
                "K1673"
        ), new Schedule(
                9,
                0,
                9,
                10,
                1,
                583,
                "KN2260"
        ), new Schedule(
                9,
                0,
                23,
                1,
                2,
                653,
                "HU7176"
        ), new Schedule(
                9,
                0,
                23,
                0,
                1,
                730,
                "CA1116"
        ), new Schedule(
                9,
                0,
                15,
                16,
                1,
                859,
                "KN2262"
        ), new Schedule(
                9,
                0,
                7,
                8,
                1,
                880,
                "CA1102"
        ), new Schedule(
                9,
                0,
                8,
                9,
                1,
                880,
                "CA1112"
        ), new Schedule(
                9,
                0,
                11,
                12,
                1,
                880,
                "CA1118"
        ), new Schedule(
                9,
                0,
                19,
                20,
                1,
                880,
                "CA1106"
        ), new Schedule(
                9,
                10,
                11,
                14,
                3,
                1080,
                "CZ6181"
        ), new Schedule(
                9,
                7,
                23,
                1,
                2,
                216,
                "GS6638"
        ), new Schedule(
                9,
                7,
                22,
                0,
                2,
                278,
                "GJ8092"
        ), new Schedule(
                9,
                7,
                20,
                22,
                2,
                307,
                "GS7646"
        ), new Schedule(
                9,
                7,
                7,
                9,
                2,
                320,
                "CA1665"
        ), new Schedule(
                9,
                7,
                10,
                11,
                1,
                405,
                "FU6627"
        ), new Schedule(
                9,
                7,
                18,
                20,
                2,
                419,
                "GS7618"
        ), new Schedule(
                9,
                7,
                14,
                15,
                1,
                430,
                "CZ6320"
        ), new Schedule(
                9,
                7,
                7,
                11,
                4,
                602,
                "GS6645"
        ), new Schedule(
                10,
                6,
                22,
                9,
                35,
                491.5,
                "K2060"
        ), new Schedule(
                10,
                6,
                22,
                1,
                3,
                790,
                "3U8842"
        ), new Schedule(
                10,
                6,
                20,
                0,
                4,
                830,
                "CA4154"
        ), new Schedule(
                10,
                6,
                7,
                12,
                5,
                890,
                "3U8061"
        ), new Schedule(
                10,
                6,
                18,
                21,
                3,
                890,
                "3U8526"
        ), new Schedule(
                10,
                6,
                8,
                11,
                3,
                960,
                "CZ6941"
        ), new Schedule(
                10,
                6,
                10,
                13,
                3,
                970,
                "CA4192"
        ), new Schedule(
                10,
                6,
                11,
                15,
                4,
                970,
                "CA4152"
        ), new Schedule(
                10,
                6,
                15,
                18,
                3,
                980,
                "CZ6881"
        )};

//        for (Schedule sc : timetable) {
//            System.out.println("fromCity:" + sc.getFromCity());
//            System.out.println("toCity:" + sc.getToCity());
//            System.out.println("startTime:" + sc.getStartTime());
//        }

        return timetable;
    }
}
