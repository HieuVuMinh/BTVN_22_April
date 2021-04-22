public class Book extends Document {
    private String nameOfAuthor;
    private int pageNumber;

    public Book() {
    }

    public Book(String nameOfAuthor, int pageNumber) {
        this.nameOfAuthor = nameOfAuthor;
        this.pageNumber = pageNumber;
    }

    public Book(int idDocument, String publishingHouse, int edition, String nameOfAuthor, int pageNumber) {
        super(idDocument, publishingHouse, edition);
        this.nameOfAuthor = nameOfAuthor;
        this.pageNumber = pageNumber;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book has idDocument:'" + getIdDocument() + '\'' + ", publishingHouse:'" + getPublishingHouse() +
                '\'' + ", edition:" + getEdition() + ", nameOfAuthor:'" + nameOfAuthor + '\'' +
                ", pageNumber:" + pageNumber;
    }
}
