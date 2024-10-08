public class Painting implements ProsPolisi {
    private String description;
    private int price;
    private String technique;

    public Painting(String description, int price, String technique) {
        this.description = description;
        this.price = price;
        this.technique = technique;
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

    public String getTechnique() {
        return technique;
    }
}
