public class JewelPart extends FurniturePart {
    private double jewelPriceOf100Gram;

    public JewelPart(double jewelPriceOf100Gram) {
        this.jewelPriceOf100Gram = jewelPriceOf100Gram;
    }

    public JewelPart(int weight, double priceOfGram, double jewelPriceOf100Gram) {
        super(weight, priceOfGram);
        this.jewelPriceOf100Gram = jewelPriceOf100Gram;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (jewelPriceOf100Gram / 100) * super.getWeight();
    }

    public JewelPart shadowClone(){
        return new JewelPart(jewelPriceOf100Gram);
    }


    public JewelPart deepClone(){
        return new JewelPart(getWeight(), getPriceOfGram(), jewelPriceOf100Gram);
    }
}
