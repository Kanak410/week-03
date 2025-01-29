package singleLinkedList.socialmedia;

public class UserNode {
    private int userId;
    private String name;
    private int age;
    private FriendNode friendsHead;
    private UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendsHead = null;
        this.next = null;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FriendNode getFriendsHead() {
        return friendsHead;
    }

    public void setFriendsHead(FriendNode friendsHead) {
        this.friendsHead = friendsHead;
    }

    public UserNode getNext() {
        return next;
    }

    public void setNext(UserNode next) {
        this.next = next;
    }
}
