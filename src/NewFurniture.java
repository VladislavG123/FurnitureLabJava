import java.util.ArrayList;

public class NewFurniture {
    private ArrayList<FurniturePart> parts;
    private double constructionPrice;

    public NewFurniture() {
    }

    public NewFurniture(ArrayList<FurniturePart> parts, double constructionPrice) {
        this.parts = parts;
        this.constructionPrice = constructionPrice;
    }

    public double getFullPrice(){
        double result = 0;
        for (var part: parts) {
            result += part.getPrice();
        }

        return result + constructionPrice;
    }

    public FurniturePart getMaxPart(){
        var max = new FurniturePart();

        for (var part: parts) {
            if (max.getPrice() < part.getPrice()){
                max = part;
            }
        }

        return max;
    }
}
