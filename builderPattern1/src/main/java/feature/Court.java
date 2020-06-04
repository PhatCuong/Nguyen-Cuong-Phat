package feature;

public class Court {
    private String court;
    private String sportCenterName;

    public Court(String courtName, String sportCenterName){
        this.court = courtName;
        this.sportCenterName = sportCenterName;
    }

    public String getCourt() {
        return court;
    }

    public String getSportCenterName() {
        return sportCenterName;
    }
}
