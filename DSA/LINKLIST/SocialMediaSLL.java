
import java.util.*;

class User{
    int id,age;
    String name;
    List<Integer> friends=new ArrayList<>();
    User next;

    User(int i,String n,int a){
        id=i;name=n;age=a;
    }
}

public class SocialMediaSLL{

    static User head=null;

    static void addUser(int i,String n,int a){
        User u=new User(i,n,a);
        u.next=head;
        head=u;
    }

    static void displayFriends(int id){
        User t=head;
        while(t!=null){
            if(t.id==id){
                System.out.println(t.friends);
                return;
            }
            t=t.next;
        }
    }

    public static void main(String[] args){
        addUser(1,"Aman",20);
        addUser(2,"Rahul",21);
        head.friends.add(2);
        displayFriends(1);
    }
}
