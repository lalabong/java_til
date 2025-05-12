package practice5;

public class Motorcycle extends Vehicle {
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
        System.out.println("시동을 겁니다.");
    }

    @Override
    public void getOff() {
        if (!getIsGetOn()) {
            System.out.println("이미 당신은 서 있다...");
            return;
        }

        if (getIsMoving()) {
            System.out.println("오토바이의 브레이크를 밟아 멈춰주세요.");
            return;
        }

        setGetOn(false);
        System.out.println("오토바이에서 내리고 시동을 끕니다.");
    }

    public void doTrick() {
        if (!getIsGetOn()) {
            System.out.println("먼저 오토바이에 탑승해 주세요.");
            return;
        }

        if (!getIsMoving()) {
            System.out.println("오토바이가 움직이는 동안에만 묘기를 부릴 수 있습니다.");
            return;
        }

        System.out.println("오토바이 묘기를 부립니다. 사람들이 당신을 쳐다보기 시작합니다...!");
    }
}
