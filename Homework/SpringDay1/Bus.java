package SpringDay1;

class Bus extends daejung_gyotong {

    public Bus(int seung_gaeg, int num) {
        super(seung_gaeg, num);
    }

    public void changeState() {
        if (state == "운행") {
            state = "차고지행";
        } else if (state == "차고지행") {
            state = "운행";
        }
        getOil();
    }
}

class BusMain{

    public static void main(String[] args) {
        Bus bus = new Bus(20, 2005);
        bus.boardingseung_gaeg(5);
    }

}

