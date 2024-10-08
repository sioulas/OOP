public class AgoraParadosi implements Asfalismeno {
    private ProsPolisi artwork;
    private boolean isFragile;
    private int weight;

    public AgoraParadosi(ProsPolisi artwork, boolean isFragile, int weight) {
        this.artwork = artwork;
        this.isFragile = isFragile;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isFragile() {
        return isFragile;
    }

    @Override
    public int getInsuranceAmount() {
        return artwork.getCatalogPrice() / 10;
    }

    public ProsPolisi getArtwork() {
        return artwork;
    }
}