package zy022;

import java.util.Scanner;

public class Main {
    // 移除错误的泛型声明 <StepCalculator>，main方法不需要泛型
    public static void main(String[] args) {
        // 初始化业务逻辑类（变量名统一为 stepCalculator）
        StepCalculator stepCalculator = new StepCalculator();

        // 读取步数数据（使用正确的变量名 stepCalculator）
        if (!stepCalculator.readStepsFromFile("steps.txt")) {
            System.out.println("程序无法继续运行，退出...");
            return;
        }

        // 显示月平均值
        stepCalculator.printMonthlyAverages();

        // 计算并保存年平均值到 mean.txt
        stepCalculator.calculateAndSaveYearlyAverage();

        // 菜单交互循环
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("全年平均步数: %.2f%n", stepCalculator.getYearlyAverage());
                    break;
                case 2:
                    System.out.print("请输入半年度（1-上半年，2-下半年）: ");
                    int half = scanner.nextInt();
                    double halfAvg = stepCalculator.getHalfYearAverage(half);
                    if (halfAvg == -1) {
                        System.out.println("输入错误！请输入 1 或 2");
                    } else {
                        System.out.printf("第%d半年度平均步数: %.2f%n", half, halfAvg);
                    }
                    break;
                case 3:
                    int[] maxData = stepCalculator.findMaxStepsDay();
                    System.out.printf("最大步数: %d（第%d天）%n", maxData[0], maxData[1]);
                    break;
                case 4:
                    int[] minData = stepCalculator.findMinStepsDay();
                    System.out.printf("最小步数: %d（第%d天）%n", minData[0], minData[1]);
                    break;
                case 5:
                    System.out.print("请输入N值: ");
                    int N = scanner.nextInt();
                    System.out.printf("步数超过%d的天数: %d%n", N, stepCalculator.countDaysAboveN(N));
                    break;
                case 6:
                    System.out.println("程序已退出");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选项，请重新输入");
            }
        }
    }

    // 打印菜单
    private static void printMenu() {
        System.out.println("\n===== 步数分析菜单 =====");
        System.out.println("1. 计算全年平均步数");
        System.out.println("2. 计算半年度平均步数");
        System.out.println("3. 查找最大步数的一天");
        System.out.println("4. 查找最小步数的一天");
        System.out.println("5. 统计步数超过N的天数");
        System.out.println("6. 退出");
        System.out.print("请选择操作（1-6）: ");
    }
}