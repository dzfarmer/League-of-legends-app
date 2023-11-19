package use_case.update;

public class UpdateInputData {
    private final String puuid;

    private final String stat1;

    private final String stat2;

    private final String stat3;

    private final String stat4;

    private final String stat5;

    public UpdateInputData(String puuid, String stat1, String stat2, String stat3, String stat4, String stat5) {
        this.puuid = puuid;
        this.stat1 = stat1;
        this.stat2 = stat2;
        this.stat3 = stat3;
        this.stat4 = stat4;
        this.stat5 = stat5;
    }

    public String getPuuid(){
        return puuid;
    }

    public String getStat1() {
        return stat1;
    }

    public String getStat2() {
        return stat2;
    }

    public String getStat3() {
        return stat3;
    }

    public String getStat4() {
        return stat4;
    }

    public String getStat5() {
        return stat5;
    }
}