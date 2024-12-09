public class Book {
    private final String BOOK_NAME;
    private final int NUMBER_OF_PAGES;
    private boolean readStatus;
    private int readPages;

    public Book (String bookName, int numberOfPages) {
        BOOK_NAME = bookName;
        NUMBER_OF_PAGES = numberOfPages;
        readStatus = false;
        readPages = 0;
    }
    
    public void addReadPages(int newReadPages){
        if(readPages+newReadPages>=NUMBER_OF_PAGES){
            readPages=NUMBER_OF_PAGES;
            readStatus=true;
        } else readPages+=newReadPages;
    }

    public String getBOOK_NAME(){
        return BOOK_NAME;
    }

    public int getNUMBER_OF_PAGES(){
        return NUMBER_OF_PAGES;
    }


    public String modifiedGetStatus(){
        if (readStatus) return "is finished";
        else return "is not finished";
    }

    public int getReadPages(){
        return readPages;
    }
}

