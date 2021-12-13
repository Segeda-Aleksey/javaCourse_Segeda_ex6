public class car {

    private int weight;
    public String name;
    private int Long;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLong() {
        return Long;
    }

    public void setLong(int aLong) {
        Long = aLong;
    }

    public car(int weight, String name, int aLong) {
        this.weight = weight;
        this.name = name;
        Long = aLong;
    }

    public car() {
        }
}
