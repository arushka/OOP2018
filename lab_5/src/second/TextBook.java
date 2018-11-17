package second;
public class TextBook {
    String isbn;
    String title;
    String author;

    public TextBook(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void SetIsbn(String isbn){
        this.isbn = isbn;
    }
    public String GetIsbn(){
        return this.isbn;
    }
    public void SetTitle(String title){
        this.title = title;
    }
    public String GetTitle(){
        return this.title;
    }
    public void SetAuthor(String author){
        this.author = author;
    }
    public String GetAuthor(){
        return this.author;
    }

    public String  toString(){
        return "TextBook: " + this.title + "\nAuthor " + this.author + "\nISNB " + this.isbn;
    }

    public Boolean equals(TextBook textBook){
        if(this.isbn == textBook.isbn && this.title == textBook.title && this.author == textBook.author) return true;
        else return false;
    }
}