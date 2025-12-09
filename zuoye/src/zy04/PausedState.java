// 文件：PausedState.java
package zy04;

public class PausedState implements PlayerState {
    @Override
    public void press(Player player) {
        System.out.println("【已暂停】点击 → 继续播放");
        player.startPlayback();
        player.setState(player.getPlayingState());
    }
}