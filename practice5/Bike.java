package practice5;

public class Bike extends Vehicle {
    @Override
    public void ready() {
        if (getIsReady()) {
            System.out.println("이미 탑승할 준비가 되어 있습니다.");
            return;
        }

        if (getIsGetOn()) {
            System.out.println("이미 탑승하고 있습니다.");
            return;
        }

        setIsReady(true);
        System.out.println("QR을 찍고 따릉이 잠금을 풉니다.");
    }

    @Override
    public void getOff() {
        if (!getIsGetOn()) {
            System.out.println("이미 당신은 서 있다...");
            return;
        }

        if (getIsMoving()) {
            System.out.println("따릉이의 브레이크를 밟아 멈춰주세요.");
            return;
        }

        setGetOn(false);
        System.out.println("따릉이에서 내리고 잠금을 겁니다.");
    }
}
