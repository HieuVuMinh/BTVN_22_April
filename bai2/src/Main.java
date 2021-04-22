import java.util.Scanner;

public class Main {

    public static final String inputInfoDocument = "1. Nhập thông tin tài liệu";
    public static final String displayDocument = "2. Hiển thị thông tin tài liệu";
    public static final String findInfoDocment = "3. Tìm kiếm tài liệu theo loại mã";
    public static final String sortDocument = "4. Sắp xếp tài liệu theo tên nhà xuất bản";
    public static final String exit = "5. Thoát";
    public static final String inputId = "Nhập mã tài liệu muốn tìm kiếm: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DocumentManagement documentManagement = new DocumentManagement();
        do {
            System.out.println(inputInfoDocument);
            System.out.println(displayDocument);
            System.out.println(findInfoDocment);
            System.out.println(sortDocument);
            System.out.println(exit);
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    documentManagement.inputInfoDocument();
                    break;
                }
                case 2: {
                    documentManagement.displayDocument();
                    break;
                }
                case 3:{
                    System.out.println(inputId);
                    int id = sc.nextInt();
                    documentManagement.findDocument(id);
                    break;
                }
                case 4:{
                    documentManagement.sortDocument();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        } while (true);


    }
}