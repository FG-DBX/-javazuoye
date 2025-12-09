// 文件：PlayingState.java
package zy04;

public class PlayingState implements PlayerState {
    @Override
    public void press(Player player) {
        System.out.println("【播放中】点击 → 暂停");
        player.pausePlayback();
        player.setState(player.getPausedState());
    }
}