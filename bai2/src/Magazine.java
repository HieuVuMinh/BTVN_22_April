public class Magazine extends Document {
    private int publishingNumber;
    private int publishingMonth;

    public Magazine() {
    }

    public Magazine(int publishingNumber, int publishingMonth) {
        this.publishingNumber = publishingNumber;
        this.publishingMonth = publishingMonth;
    }

    public Magazine(int idDocument, String publishingHouse, int edition, int publishingNumber, int publishingMonth) {
        super(idDocument, publishingHouse, edition);
        this.publishingNumber = publishingNumber;
        this.publishingMonth = publishingMonth;
    }

    public int getPublishingNumber() {
        return publishingNumber;
    }

    public void setPublishingNumber(int publishingNumber) {
        this.publishingNumber = publishingNumber;
    }

    public int getPublishingMonth() {
        return publishingMonth;
    }

    public void setPublishingMonth(int publishingMonth) {
        this.publishingMonth = publishingMonth;
    }

    @Override
    public String toString() {
        return "Magazine has idDocument:'" + getIdDocument() + '\'' + ", publishingHouse:'" +
                getPublishingHouse() + '\'' + ", edition:" + getEdition() + ", publishingNumber:'" +
                publishingNumber + '\'' + ", publishingMonth:" + publishingMonth ;
    }
}
