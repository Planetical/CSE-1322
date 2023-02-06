public class Lot {

    private int lotNumber = 1000;
    private String description;
    private int currentBid;
    private int bidIncrement;
    private boolean sold;
    int nextNum = 1000;

    public Lot() {
        nextNum++;
        lotNumber = nextNum;
        description = "Unknown item";
        currentBid = 0;
        bidIncrement = 0;
        sold = false;
    }

    public Lot(String description, int startingBid, int bidIncrement) {
        nextNum++;
        lotNumber = nextNum;
        this.description = description;
        this.currentBid = startingBid;
        this.bidIncrement = bidIncrement;
        sold = false;
    }

    void markSold() {
        sold = true;
    }

    boolean getSold() {
        return sold;
    }

    int getBidIncrement() {
        return bidIncrement;
    }

    String getDescription() {
        return description;
    }

    void setCurrentBid(int bid) {
        currentBid = bid;
    }

    int nextBid(int currentBid,int bidIncrement) {
        int nextBid = currentBid + bidIncrement;
        return nextBid;
    }

    @Override
    public String toString() {
        if (sold == true) {
            return "Lot " + lotNumber + ". " + description + " was sold for $" + currentBid;
        } else {
            return "Lot " + lotNumber + ". " + description + " current bid $" + currentBid + " minimum bid $" + nextBid(currentBid,bidIncrement);
        }
    }

}
