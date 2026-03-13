
import java.util.*;

class Student {
    int roll, age;
    String name, grade;
    Student next;

    Student(int r,String n,int a,String g){
        roll=r; name=n; age=a; grade=g;
        next=null;
    }
}

public class StudentRecordSLL {
    static Student head=null;

    static void addEnd(int r,String n,int a,String g){
        Student s=new Student(r,n,a,g);
        if(head==null){ head=s; return; }
        Student temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=s;
    }

    static void delete(int roll){
        Student temp=head,prev=null;
        while(temp!=null && temp.roll!=roll){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null) return;
        if(prev==null) head=temp.next;
        else prev.next=temp.next;
    }

    static void search(int roll){
        Student t=head;
        while(t!=null){
            if(t.roll==roll){
                System.out.println("Found: "+t.name);
                return;
            }
            t=t.next;
        }
        System.out.println("Not found");
    }

    static void display(){
        Student t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t=t.next;
        }
    }

    static void updateGrade(int roll,String g){
        Student t=head;
        while(t!=null){
            if(t.roll==roll){
                t.grade=g;
                return;
            }
            t=t.next;
        }
    }

    public static void main(String[] args){
        addEnd(1,"Aman",20,"A");
        addEnd(2,"Rahul",21,"B");
        display();
        updateGrade(2,"A+");
        search(2);
        delete(1);
        display();
    }
}
