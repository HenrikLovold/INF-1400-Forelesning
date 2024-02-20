
class Kaffemaskin {

    private int maks_vol;
    private int curr_vol;
    private String navn;

    public Kaffemaskin(int maks_vol, String navn) {
        this.maks_vol = maks_vol;
	this.navn = navn
        this.curr_vol = 0;
    }

    public void set_curr_vol(int new_vol) {
        this.curr_vol = new_vol;
    }
}

class Main {
    public static void main(String[] args) {
        Kaffemaskin kaffe1 = new Kaffemaskin(200);
        kaffe1.set_curr_vol(10);
    }
}



