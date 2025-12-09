// 文件：MusicPlayerDemo.java
package zy04;

public class MusicPlayerDemo {
    public static void main(String[] args) {
        Player player = new Player();
        player.setCurrentTrack("林俊杰 - 江南");

        System.out.println("=== 音乐播放器状态模式演示 ===\n");

        player.pressButton();  // 停止 → 播放
        player.pressButton();  // 播放 → 暂停
        player.pressButton();  // 暂停 → 播放

        System.out.println("\n歌曲结束，自动停止");
        player.stopPlayback();
        player.setState(player.getStoppedState());

        player.pressButton();  // 停止 → 播放
    }
}