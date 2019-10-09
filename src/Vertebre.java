public class Vertebre extends Animal {

    private String bougeCommeTuVeux;

    public Vertebre(int age, String name, String bougeCommeTuVeux) {
        super(age, name);
        this.bougeCommeTuVeux = bougeCommeTuVeux;
    }


    public String getBougeCommeTuVeux() {
        return bougeCommeTuVeux;
    }

    public void setBougeCommeTuVeux(String bougeCommeTuVeux) {
        this.bougeCommeTuVeux = bougeCommeTuVeux;
    }
}
