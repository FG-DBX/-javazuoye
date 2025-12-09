// 文件：Player.java
package zy04;

public class Player {
    private PlayerState currentState;

    // 三个状态实例（单例）
    private final PlayerState playingState = new PlayingState();
    private final PlayerState pausedState  = new PausedState();
    private final PlayerState stoppedState = new StoppedState();

    private String currentTrack = "未知歌曲";

    public Player() {
        currentState = stoppedState;
    }

    public void pressButton() {
        currentState.press(this);
    }

    // 状态切换方法
    public void setState(PlayerState state) {
        this.currentState = state;
        System.out.println("状态 → " + state.getClass().getSimpleName());
    }

    // Getter（供状态类切换使用）
    public PlayerState getPlayingState() { return playingState; }
    public PlayerState getPausedState()  { return pausedState; }
    public PlayerState getStoppedState() { return stoppedState; }

    public void setCurrentTrack(String track) { this.currentTrack = track; }
    public String getCurrentTrack() { return currentTrack; }

    // 播放器行为
    public void startPlayback() { System.out.println("正在播放: " + currentTrack); }
    public void pausePlayback()  { System.out.println("已暂停: " + currentTrack); }
    public void stopPlayback()   { System.out.println("已停止"); }
}