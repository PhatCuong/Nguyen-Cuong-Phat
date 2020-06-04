package feature;

public class Station {
    private String station;
    private String centerName;

    public Station(String station, String centerName) {
        this.station = station;
        this.centerName = centerName;
    }

    public String getStation() {
        return station;
    }

    public String getCenterName() {
        return centerName;
    }
}

