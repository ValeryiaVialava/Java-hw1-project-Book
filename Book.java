public class Book {
    private final String bookName;
    private final int numberOfPages;
    private boolean readStatus;
    private int readPages;

    public Book (String bookName, int numberOfPages) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        readStatus = false;
        readPages = 0;
    }

    public void addReadPages(int newReadPages){
        if(readPages+newReadPages>=numberOfPages){
            readPages=numberOfPages;
            readStatus=true;
        } else readPages+=newReadPages;
    }

    public String getBookName(){
        return bookName;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }


    public String modifiedGetStatus(){
        if (readStatus) return "is finished";
        else return "is not finished";
    }

    public int getReadPages(){
        return readPages;
    }
}

