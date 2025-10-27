package zy022;
import java.io.*;

public class StepCalculator {
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int[] steps; // 存储全年365天的步数
    private double yearlyAverage; // 全年平均值

    // 读取步数文件
    public boolean readStepsFromFile(String filePath) {
        steps = new int[365];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null && index < 365) {
                steps[index] = Integer.parseInt(line.trim());
                index++;
            }
            if (index < 365) {
                System.out.println("警告：文件数据不足365天（实际读取" + index + "天）");
            }
            return true;
        } catch (IOException | NumberFormatException e) {
            System.err.println("读取文件失败：" + e.getMessage());
            return false;
        }
    }

    // 计算并打印月平均值
    public void printMonthlyAverages() {
        double[] monthlyAverages = calculateMonthlyAverages();
        System.out.println("\n===== 每月平均步数 =====");
        for (int i = 0; i < 12; i++) {
            System.out.printf("月份 %d: %.2f 步%n", (i + 1), monthlyAverages[i]);
        }
    }

    // 计算月平均值（内部方法）
    private double[] calculateMonthlyAverages() {
        double[] averages = new double[12];
        int currentDay = 0;
        for (int i = 0; i < 12; i++) {
            int monthDays = DAYS_IN_MONTH[i];
            int sum = 0;
            for (int j = 0; j < monthDays; j++) {
                sum += steps[currentDay + j];
            }
            averages[i] = (double) sum / monthDays;
            currentDay += monthDays;
        }
        return averages;
    }

    // 计算并保存年平均值到mean.txt
    public void calculateAndSaveYearlyAverage() {
        yearlyAverage = calculateYearlyAverage();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("mean.txt"))) {
            bw.write(String.format("全年平均步数: %.2f", yearlyAverage));
            System.out.println("\n全年平均值已保存到 mean.txt");
        } catch (IOException e) {
            System.err.println("保存文件失败：" + e.getMessage());
        }
    }

    // 计算年平均值（内部方法）
    private double calculateYearlyAverage() {
        int sum = 0;
        for (int s : steps) {
            sum += s;
        }
        return (double) sum / 365;
    }

    // 获取年平均值
    public double getYearlyAverage() {
        return yearlyAverage;
    }

    // 计算半年度平均值（1-上半年，2-下半年）
    public double getHalfYearAverage(int half) {
        int start, end;
        if (half == 1) {
            start = 0;
            end = 181; // 1-6月共181天（31+28+31+30+31+30）
        } else if (half == 2) {
            start = 181;
            end = 365; // 7-12月共184天
        } else {
            return -1; // 输入错误标识
        }

        int sum = 0;
        int days = end - start;
        for (int i = start; i < end; i++) {
            sum += steps[i];
        }
        return (double) sum / days;
    }

    // 查找最大步数的一天（返回[步数, 天数]）
    public int[] findMaxStepsDay() {
        int max = steps[0];
        int day = 1;
        for (int i = 1; i < 365; i++) {
            if (steps[i] > max) {
                max = steps[i];
                day = i + 1;
            }
        }
        return new int[]{max, day};
    }

    // 查找最小步数的一天（返回[步数, 天数]）
    public int[] findMinStepsDay() {
        int min = steps[0];
        int day = 1;
        for (int i = 1; i < 365; i++) {
            if (steps[i] < min) {
                min = steps[i];
                day = i + 1;
            }
        }
        return new int[]{min, day};
    }

    // 统计步数超过N的天数
    public int countDaysAboveN(int N) {
        int count = 0;
        for (int s : steps) {
            if (s > N) {
                count++;
            }
        }
        return count;
    }
}