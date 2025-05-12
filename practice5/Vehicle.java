package practice5;

public abstract class Vehicle {
    private boolean isReady = false;
    private boolean isGetOn = false;
    private boolean isMoving = false;

    public abstract void ready();

    public void getOn() {
        if (!getIsReady()) {
            System.out.println("아직 탑승할 준비가 되어있지 않습니다.");
            return;
        }

        if (getIsGetOn()) {
            System.out.println("이미 탑승하고 있습니다.");
            return;
        }
        setGetOn(true);
        System.out.println("탑승완료!");
    }

    public void move() {
        if (!getIsGetOn()) {
            System.out.println("먼저 탑승해 주세요.");
            return;
        }
        if (getIsMoving()) {
            System.out.println("이미 움직이고 있습니다.");
            return;
        }
        setMoving(true);
        System.out.println("출발!");
    }

    public void stop() {
        if (!getIsGetOn()) {
            System.out.println("먼저 탑승해 주세요.");
            return;
        }
        if (!getIsMoving()) {
            System.out.println("이미 멈춰있습니다.");
            return;
        }
        setMoving(false);
        System.out.println("멈춥니다...");
    }

    public abstract void getOff();

    public boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(boolean ready) {
        isReady = ready;
    }

    public boolean getIsGetOn() {
        return isGetOn;
    }

    public void setGetOn(boolean getOn) {
        isGetOn = getOn;
    }

    public boolean getIsMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }
}
