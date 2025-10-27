package zy022;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class StepFileGenerator {
    public static void main(String[] args) {
        // 生成365天的随机步数（范围：5000-15000步）
        Random random = new Random();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("steps.txt"))) {
            for (int i = 0; i < 365; i++) {
                int steps = 5000 + random.nextInt(10001); // 5000-15000的随机数
                bw.write(String.valueOf(steps));
                bw.newLine();
            }
            System.out.println("步数文件 steps.txt 生成成功（365天数据）");
        } catch (IOException e) {
            System.err.println("生成文件失败：" + e.getMessage());
        }
    }
}