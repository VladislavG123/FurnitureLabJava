public class FurniturePart implements Cloneable {
    private int weight;
    private double priceOfGram;

    @Override
    protected Object clone() {
        return new FurniturePart(weight, priceOfGram);
    }

    public FurniturePart() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPriceOfGram() {
        return priceOfGram;
    }

    public void setPriceOfGram(double priceOfGram) {
        this.priceOfGram = priceOfGram;
    }

    public FurniturePart(int weight, double priceOfGram) {
        this.weight = weight;
        this.priceOfGram = priceOfGram;
    }

    public double getPrice(){
        return priceOfGram * weight;
    }

    public void print(){
        System.out.println("Weight: " + weight + "\n Price of gram: " + priceOfGram);
    }
}
