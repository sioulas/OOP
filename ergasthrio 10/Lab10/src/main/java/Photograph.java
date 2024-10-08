public class Photograph implements ProsPolisi {
    private String description;
    private int price;
    private boolean isColor;

    public Photograph(String description, int price, boolean isColor) {
        this.description = description;
        this.price = price;
        this.isColor = isColor;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCatalogPrice() {
        return price;
    }

    @Override
    public int getLowestAcceptablePrice(int percentage) {
        return (int) (price * (percentage / 100.0));
    }

    public boolean isColor() {
        return isColor;
    }
}

