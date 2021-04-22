public class Newspaper extends Document{
    private String publishingDay;

    public Newspaper(){}

    public Newspaper(String publishingDay) {
        this.publishingDay = publishingDay;
    }

    public Newspaper(int idDocument, String publishingHouse, int edition, String publishingDay) {
        super(idDocument, publishingHouse, edition);
        this.publishingDay = publishingDay;
    }

    public String getPublishingDay() {
        return publishingDay;
    }

    public void setPublishingDay(String publishingDay) {
        this.publishingDay = publishingDay;
    }

    @Override
    public String toString() {
        return "Newspaper has idDocument:'" + getIdDocument() + '\'' + ", publishingHouse:'" +
                getPublishingHouse() + '\'' + ", edition:" + getEdition() +
                ", publishingDay:'" + publishingDay + '\'';
    }
}
