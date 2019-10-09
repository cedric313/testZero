public class Mammifere extends Vertebre {

    private String faireLeMort;
    private Exception damn;

    public Mammifere(int age, String name, String bougeCommeTuVeux, String faireLeMort, Exception damn) {
        super(age, name, bougeCommeTuVeux);
        this.faireLeMort = faireLeMort;
        this.damn = damn;
    }


    public String getFaireLeMort() {
        return faireLeMort;
    }

    public void setFaireLeMort(String faireLeMort) {
        this.faireLeMort = faireLeMort;
    }

    public Exception getDamn() {
        return damn;
    }

    public void setDamn(Exception damn) {
        this.damn = damn;
    }
}
