public class Furniture {
    private FurniturePart firstPart;
    private FurniturePart secondPart;
    private FurniturePart thirdPart;

    private int countOfFirst;
    private int countOfSecond;
    private int countOfThird;

    private double constructionPrice;

    public Furniture() {
    }

    public Furniture(FurniturePart firstPart, FurniturePart secondPart, FurniturePart thirdPart, int countOfFirst, int countOfSecond, int countOfThird, double constructionPrice) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
        this.thirdPart = thirdPart;
        this.countOfFirst = countOfFirst;
        this.countOfSecond = countOfSecond;
        this.countOfThird = countOfThird;
        this.constructionPrice = constructionPrice;
    }

    public double getFullPrice(){
        return (firstPart.getPrice() * countOfFirst) +
                (secondPart.getPrice() * countOfSecond) +
                (thirdPart.getPrice() * countOfThird) +
                constructionPrice;
    }

    public FurniturePart getMaxPart(){
        var max = (firstPart.getPrice() > secondPart.getPrice()) ? firstPart : secondPart;
        return (max.getPrice() > thirdPart.getPrice()) ? max : thirdPart;
    }

}
