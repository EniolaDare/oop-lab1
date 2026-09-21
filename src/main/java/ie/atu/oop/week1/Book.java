package ie.atu.oop.week1;

public class Book {

    public String title;
    public String author;
    public int pageCount;
    public boolean available= true;

    public void displayDetails(){
        System.out.println("First book title: " + title);
        System.out.println("First book author: " + author);
        System.out.println("First book page count: "+ pageCount);
        System.out.println("First book available: " + available);
    }
}
