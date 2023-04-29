package animal;

public class Pigeon extends Bird{
    protected boolean isPostal;

    public Pigeon() {
    }
    public Pigeon(boolean isPostal) {
        this.isPostal = isPostal;
    }

    public Pigeon(String name, int age, double weight, boolean isPostal) {
        super(name, age, weight);
        this.isPostal = isPostal;
    }

    public Pigeon(String name, int age, double weight, String featherColor, boolean isPostal) {
        super(name, age, weight, featherColor);
        this.isPostal = isPostal;
    }

    public Pigeon(String featherColor, boolean isPostal) {
        super(featherColor);
        this.isPostal = isPostal;
    }

    public boolean isPostal() {
        return isPostal;
    }

    public void setPostal(boolean postal) {
        isPostal = postal;
    }

    public void GruGru(){
        System.out.println("Gru Gru");
    }

    @Override
    public void getVoice() {
        System.out.println("Gru Gru");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "isPostal=" + isPostal +
                ", featherColor='" + featherColor + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
