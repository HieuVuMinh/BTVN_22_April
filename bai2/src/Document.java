public class Document {
    private int idDocument;
    private String publishingHouse;
    private int edition;

    public Document(){};

    public Document(int idDocument, String publishingHouse, int edition) {
        this.idDocument = idDocument;
        this.publishingHouse = publishingHouse;
        this.edition = edition;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Document{" +
                "idDocument='" + idDocument + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", edition=" + edition +
                '}';
    }
}
