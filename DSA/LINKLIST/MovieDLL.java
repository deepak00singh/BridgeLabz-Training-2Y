
class Movie{
    String title, director;
    int year;
    double rating;
    Movie prev,next;

    Movie(String t,String d,int y,double r){
        title=t;director=d;year=y;rating=r;
    }
}

public class MovieDLL{

    static Movie head=null,tail=null;

    static void addEnd(String t,String d,int y,double r){
        Movie m=new Movie(t,d,y,r);
        if(head==null){head=tail=m;return;}
        tail.next=m;
        m.prev=tail;
        tail=m;
    }

    static void remove(String title){
        Movie temp=head;
        while(temp!=null){
            if(temp.title.equals(title)){
                if(temp.prev!=null) temp.prev.next=temp.next;
                else head=temp.next;
                if(temp.next!=null) temp.next.prev=temp.prev;
                else tail=temp.prev;
                return;
            }
            temp=temp.next;
        }
    }

    static void displayForward(){
        Movie t=head;
        while(t!=null){
            System.out.println(t.title+" "+t.rating);
            t=t.next;
        }
    }

    static void displayReverse(){
        Movie t=tail;
        while(t!=null){
            System.out.println(t.title+" "+t.rating);
            t=t.prev;
        }
    }

    public static void main(String[] args){
        addEnd("Inception","Nolan",2010,9.0);
        addEnd("Avatar","Cameron",2009,8.5);
        displayForward();
        displayReverse();
        remove("Avatar");
        displayForward();
    }
}
