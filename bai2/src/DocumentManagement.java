import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManagement {
    public static final String book = "1. Book";
    public static final String magazine = "2. Magazine";
    public static final String newspaper = "3. Newspaper";
    public static final String inputId = "Nhập mã tài liệu: ";
    public static final String inputPublishingHouse = "Nhập nhà xuất bản: ";
    public static final String inputEdition = "Nhập số bản phát hành: ";
    public static final String inputPublishingDay = "Nhập ngày phát hành: ";
    public static final String inputPublishingNumber = "Nhập số phát hành: ";
    public static final String inputPublishingMonth = "Nhập tháng phát hành: ";
    public static final String inputnNameOfAuthor = "Nhập tên tác giả: ";
    public static final String inputPageNumber = "Nhập số trang: ";
    public static final String notFound = "Không tìm thấy tài liệu phù hợp";
    Scanner sc = new Scanner(System.in);
    List<Document> documentList = new ArrayList<>();
    private int idDocument;
    private String publishingHouse;
    private int edition;
    private String nameOfAuthor;
    private int pageNumber;
    private int publishingNumber;
    private int publishingMonth;
    private String publishingDay;

    public DocumentManagement() {
        documentList.add(new Book(1, "James Arthur", 500,
                "Josh", 200));
        documentList.add(new Magazine(3, "Lukas Graham", 300,
                2, 6));
        documentList.add(new Newspaper(2, "Ed Sheeran", 630,
                "11/2/2019"));
    }

    //  Nhập thông tin tài liệu
    public void inputInfoDocument() {
        System.out.println(book);
        System.out.println(magazine);
        System.out.println(newspaper);
        int selection = sc.nextInt();
        switch (selection) {
            case 1: {
                Book book = inputInfoBook();
                documentList.add(book);
                break;
            }
            case 2: {
                Magazine magazine = inputInfoMagazine();
                documentList.add(magazine);
                break;
            }
            case 3: {
                Newspaper newspaper = inputInfoNewspaper();
                documentList.add(newspaper);
                break;
            }
        }
    }

    public void InfoDocument() {
        System.out.println(inputId);
        idDocument = sc.nextInt();
        sc.nextLine();
        System.out.println(inputPublishingHouse);
        publishingHouse = sc.nextLine();
        System.out.println(inputEdition);
        edition = sc.nextInt();
    }

    public Newspaper inputInfoNewspaper() {
        InfoDocument();
        System.out.println(inputPublishingDay);
        String publishingDay = sc.nextLine();
        Newspaper newspaper = new Newspaper(idDocument, publishingHouse, edition, publishingDay);
        return newspaper;
    }

    public Magazine inputInfoMagazine() {
        InfoDocument();
        System.out.println(inputPublishingNumber);
        int publishingNumber = sc.nextInt();
        System.out.println(inputPublishingMonth);
        int publishingMonth = sc.nextInt();
        Magazine magazine = new Magazine(idDocument, publishingHouse, edition, publishingNumber, publishingMonth);
        return magazine;
    }

    public Book inputInfoBook() {
        InfoDocument();
        sc.nextLine();
        System.out.println(inputnNameOfAuthor);
        String nameOfAuthor = sc.nextLine();
        System.out.println(inputPageNumber);
        int pageNumber = sc.nextInt();
        Book book = new Book(idDocument, publishingHouse, edition, nameOfAuthor, pageNumber);
        return book;
    }

    // Hiển thị thông tin tài liệu
    public void displayDocument() {
        for (int i = 0; i < documentList.size(); i++) {
            Document document = documentList.get(i);
            System.out.println(document.toString());
        }
    }

    // Tìm kiếm tài liệu theo các loại mã
    public void findDocument(int idDocument) {
        Document document = findDocumentById(idDocument);
        if (document == null) {
            System.out.println(notFound);
        } else
            System.out.println(document.toString());
    }

    public Document findDocumentById(int idDocument) {
        int count = -1;
        for (int i = 0; i < documentList.size(); i++) {
            Document document = documentList.get(i);
            if ((document.getIdDocument()) == (idDocument)) {
                count = i;
                break;
            }
        }
        if (count == -1) {
            return null;
        } else
            return documentList.get(count);
    }

    // Tìm kiếm tài liệu theo mã sử dụng tìm kiếm nhị phân
    public void findDocument(int idDocument, List<Document> documentList) {
        Document document = findDocumentUsingBinarySearch(idDocument, documentList);
        if (document == null) {
            System.out.println(notFound);
        } else
            System.out.println(document);
    }

    public Document findDocumentUsingBinarySearch(int idDocument, List<Document> documentList) {
        sortDocumentById();
        int left = 0;
        int right = documentList.size() - 1;
        do {
            int mid = (right + left) / 2;
            int midDocumentIndex = documentList.get(mid).getIdDocument();
            if (idDocument == midDocumentIndex) {
                return documentList.get(mid);
            } else if (idDocument < midDocumentIndex) {
                right = mid - 1;
            } else if (idDocument > midDocumentIndex) {
                left = mid + 1;
            }
        } while (left <= right);
        return null;
    }

    public void sortDocumentById() {
        for (int i = 0; i < documentList.size(); i++) {
            int index = i;
            Document temp = documentList.get(i);
            while (index > 0 && temp.getIdDocument() > documentList.get(index - 1).getIdDocument()) {
                documentList.set(index, documentList.get(index - 1));
                index--;
            }
            documentList.set(index, temp);
        }
    }

    // Sắp xếp tài liệu theo tên nhà xuất bản sử dụng insertion sort
    public void sortDocument() {
        for (int i = 0; i < documentList.size(); i++) {
            int index = i;
            Document temp = documentList.get(i);
            while (index > 0) {
                boolean isTempSmallerThanIndex =
                        temp.getPublishingHouse().compareTo(documentList.get(index - 1).getPublishingHouse()) < 0;
                if (isTempSmallerThanIndex == false) {
                    break;
                } else {
                    documentList.set(index, documentList.get(index - 1));
                    index--;
                }
                documentList.set(index, temp);
            }
        }
        displayDocument();
    }
}
