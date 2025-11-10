package library.members;

public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }

    public String getName() {
        return name;
    }
}
