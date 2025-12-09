// 文件：StoppedState.java
package zy04;

public class StoppedState implements PlayerState {
    @Override
    public void press(Player player) {
        System.out.println("【已停止】点击 → 开始播放");
        player.startPlayback();
        player.setState(player.getPlayingState());
    }
}