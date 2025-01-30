class Book {
    private int pageNumber;

    // Getter
    public int getPageNumber() {
        if (pageNumber == 0) {
            System.out.println("Book is empty");
            return 0;
        }

        return this.pageNumber;
    }
    
    // Setter
    public void setPageNumber(int userPageNumber) {
        if (userPageNumber < 0) {
            System.out.println("Invalid page number given");
            return;
        }
        pageNumber = userPageNumber;
    }
}

public class BookExample1 {
    public static void main(String...args) {
        Book b = new Book();
        // b.pageNumber = 100  [Error : Accessing private data member]
        // System.out.println(b.pageNumber); Error
        
        b.setPageNumber(100);
        System.out.println(b.getPageNumber()); // 100
    }
}
