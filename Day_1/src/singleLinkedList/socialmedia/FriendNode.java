package singleLinkedList.socialmedia;

public class FriendNode {
    private int friendId;
    private FriendNode next;

    public FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public FriendNode getNext() {
        return next;
    }

    public void setNext(FriendNode next) {
        this.next = next;
    }
}
