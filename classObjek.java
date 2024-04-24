public class classObjek {

    String aku;
    String kamu;

    classObjek(String aku, String kamu) {
        this.aku = aku;
        this.kamu = kamu;
    }

    void lope() {
        System.out.println(this.aku + " lope " + this.kamu);
    }

    public static void main(String[] args) {
        classObjek o = new classObjek("who", "am");
        o.lope();
    }
}
