import java.util.*;
class Book
{
  String bookTitle;
  String author;
  String isbn;
  int numOfCopies;
  Book(String bookTitle, String author, String isbn, int numOfCopies)
  {
    this.bookTitle=bookTitle;
    this.author=author;
    this.isbn=isbn;
    this.numOfCopies=numOfCopies;
   }
   void display()
    {
      System.out.println("Title is:" +bookTitle);
      System.out.println("Author is:" +author);
      System.out.println("Isbn code is:" +isbn);
      System.out.println("No.of copies are:" +numOfCopies);
     }
}
class BookStore extends Book
{
  Sr Books[];
  void display()
  {
      System.out.println("Title is:" +bookTitle);
      System.out.println("Author is:" +author);
      System.out.println("Isbn code is:" +isbn);
      System.out.println("No.of copies are:" +numOfCopies);
      for(int i=0;i<Books.length;i++)
      {
        System.out.println(Books[i]+" ");
      }
   }
   void sell(String bookTitle, int numOfCopies)
   {
       int flag=0;
      for(int i=0;i<Books.length;i++)
      {
        if(Books[i]==bookTitle)
        {
          flag=1;
          break;
        }
      }
      if(flag==1)
      {
        numOfCopies--;
        System.out.println("The final no.of copies are:" +numOfCopies);
       }
       else
       {
         System.out.println("Book not found");
        }
     }
    void order(String isbn, int numOfCopies)
    {
       int flag1=0;
       for(int i=0;i<Books.length;i++)
        {
          if(Books[i]==isbn)
          {
            flag1=1;
            break;
           }
         }
       if(flag==1)
        {
          numOfCopies++;
        }
        else
        {
           Books.length++;
            System.out.println("new book entry will added to the list");
        }
     }
}
class BookStoreApp
{
   public static void main(String args[])
   {
     Book b=new Book("India","james","abc",15);
     Book books[]={"India","Africa","America","Australia"};
     b.display();
     b.sell("India",15);
     b.display();
    }
}

     