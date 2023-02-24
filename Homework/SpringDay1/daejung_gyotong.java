package SpringDay1;

public class daejung_gyotong {
    private int Max_seung_gaeg; // 최대 승객수
    private int seung_gaeg; // 현재 승객수
    private int price; // 요금
    private int num; // 번호
    private int Oil = 100; // 기름량
    private int speed = 0; // 속도
    String state; // 상태

    public daejung_gyotong(int seung_gaeg, int num) {
        Max_seung_gaeg = 30;
        this.seung_gaeg = seung_gaeg;
        this.price = 1000;
        this.num = num;
        Oil = 100;
        this.speed = 0;
        this.state = "운행";
    }

    // 시작
    public void startState(String state) {
        this.state = state;
    }

    public void boardingseung_gaeg(int newseung_gaeg) {
        Max_seung_gaeg = 30;
        if (newseung_gaeg + seung_gaeg <= Max_seung_gaeg && state.equals("운행")){
            System.out.println("탑승 가능합니다.");
            seung_gaeg += newseung_gaeg;
            System.out.println("현재 탑승 인원 : " + seung_gaeg);
        } else {
            System.out.println("탑승 초과");
        }
    }

    public int getMax_seung_gaeg() {
        return Max_seung_gaeg;
    }

    public void setMax_seung_gaeg(int max_seung_gaeg) {
        Max_seung_gaeg = max_seung_gaeg;
    }

    public int getSeung_gaeg() {
        return seung_gaeg;
    }

    public void setSeung_gaeg(int seung_gaeg) {
        this.seung_gaeg = seung_gaeg;
    }

    public int getPrice(int i) {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum(int busNum) {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getOil() {
        return Oil;
    }

    public void setOil(int oil) {
        Oil = oil;
        if (oil < 10) {
            System.out.println("주유가 필요합니다.");
            //changeState();
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}