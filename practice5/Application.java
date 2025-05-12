package practice5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------출근할 때 탑승할 운송수단을 선택해주세요.--------");
            System.out.println("1번: 따릉이");
            System.out.println("2번: 오토바이");
            System.out.println("3번: 자동차");
            int num1 = sc.nextInt();

            Vehicle selectedVehicle = null;

            switch (num1) {
                case 1:
                    System.out.println("따릉이를 선택했습니다.");
                    selectedVehicle = new Bike();
                    break;
                case 2:
                    System.out.println("오토바이를 선택했습니다.");
                    selectedVehicle = new Motorcycle();
                    break;
                case 3:
                    System.out.println("자동차를 선택했습니다.");
                    selectedVehicle = new Car();
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
                    continue;
            }

            while (true) {
                System.out.println("--------이제 무엇을 할까요?--------");
                System.out.println("1번: 탑승할 준비하기");
                System.out.println("2번: 탑승하기");
                System.out.println("3번: 출발하기");
                System.out.println("4번: 묘기부리기");
                System.out.println("5번: 멈추기");
                System.out.println("6번: 내리기");
                System.out.println("7번: 프로그램 종료");
                System.out.println("--------------------------------");

                int num2 = sc.nextInt();

                switch (num2) {
                    case 1:
                        selectedVehicle.ready();
                        break;
                    case 2:
                        selectedVehicle.getOn();
                        break;
                    case 3:
                        selectedVehicle.move();
                        break;
                    case 4:
                        if (!(selectedVehicle instanceof Motorcycle)) {
                            System.out.println("오토바이로만 묘기를 부릴 수 있습니다.");
                            break;
                        }
                        ((Motorcycle) selectedVehicle).doTrick();
                        break;
                    case 5:
                        selectedVehicle.stop();
                        break;
                    case 6:
                        selectedVehicle.getOff();
                        break;
                    case 7:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                }
            }
        }

    }
}
