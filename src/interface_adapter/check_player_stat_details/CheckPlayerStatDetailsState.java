package interface_adapter.check_player_stat_details;

import entity.PlayerStats;

import java.util.List;

public class CheckPlayerStatDetailsState {
    private List<PlayerStats> playerStats = null;

    public CheckPlayerStatDetailsState(CheckPlayerStatDetailsState copy) {
        if (copy != null) {
            this.playerStats = copy.playerStats;
        }
    }

    public CheckPlayerStatDetailsState() {}

    public List<PlayerStats> getPlayerStats() {
        return this.playerStats;
    }

    public void setPlayerStats(List<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }
}
