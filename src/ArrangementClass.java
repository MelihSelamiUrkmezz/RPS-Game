public class ArrangementClass {
    private String username;
    private int game_count;
    private int win_count;

    public ArrangementClass(String username, int game_count, int win_count) {
        this.username = username;
        this.game_count = game_count;
        this.win_count = win_count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getGame_count() {
        return game_count;
    }

    public void setGame_count(int game_count) {
        this.game_count = game_count;
    }

    public int getWin_count() {
        return win_count;
    }

    public void setWin_count(int win_count) {
        this.win_count = win_count;
    }
    
}
