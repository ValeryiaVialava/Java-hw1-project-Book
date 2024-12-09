public class myFirstProgram {
    public static void main(String[] args) {
        Book book1 = new Book("Learn C++", 427);
        Book book2 = new Book("Java for beginners", 328);

        System.out.println("First book: " + book1.getBOOK_NAME() + ", Pages: " + book1.getNUMBER_OF_PAGES());
        System.out.println("Second book: " + book2.getBOOK_NAME() + ", Pages: " + book2.getNUMBER_OF_PAGES());

        System.out.println(book1.getReadPages() + " pages read in the First book");
        System.out.println(book2.getReadPages() + " pages read in the Second book");

        System.out.println("First book " + book1.modifiedGetStatus());
        System.out.println("Second book " + book2.modifiedGetStatus());

        System.out.println("---------------------------------");
        book1.addReadPages(427);
        book2.addReadPages(100);

        System.out.println(book1.getReadPages() + " pages read in the First book");
        System.out.println(book2.getReadPages() + " pages read in the Second book");

        System.out.println("First book " + book1.modifiedGetStatus());
        System.out.println("Second book " + book2.modifiedGetStatus());
    }
}
