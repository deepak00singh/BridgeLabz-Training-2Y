
class Book{
    int id;
    String title,author,genre,status;
    Book prev,next;

    Book(int i,String t,String a,String g,String s){
        id=i;title=t;author=a;genre=g;status=s;
    }
}

public class LibraryDLL{

    static Book head=null,tail=null;

    static void add(int i,String t,String a,String g,String s){
        Book b=new Book(i,t,a,g,s);
        if(head==null){head=tail=b;return;}
        tail.next=b;
        b.prev=tail;
        tail=b;
    }

    static void count(){
        int c=0;
        Book t=head;
        while(t!=null){c++;t=t.next;}
        System.out.println("Total Books="+c);
    }

    static void display(){
        Book t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.title+" "+t.status);
            t=t.next;
        }
    }

    public static void main(String[] args){
        add(1,"Java","Herbert","Tech","Available");
        add(2,"DSA","Narasimha","Tech","Issued");
        display();
        count();
    }
}
