package singleLinkedList.socialmedia;

public class SocialMedia {
    private UserNode head;

    public SocialMedia() {
        this.head = null;
    }

    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newUser);
        }
    }

    private UserNode findUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.getUserId() == userId) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void addFriend(int user1Id, int user2Id) {
        UserNode user1 = findUser(user1Id);
        UserNode user2 = findUser(user2Id);
        if (user1 != null && user2 != null) {
            addFriendHelper(user1, user2Id);
            addFriendHelper(user2, user1Id);
        }
    }

    private void addFriendHelper(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        if (user.getFriendsHead() == null) {
            user.setFriendsHead(newFriend);
        } else {
            FriendNode temp = user.getFriendsHead();
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newFriend);
        }
    }

    public void removeFriend(int user1Id, int user2Id) {
        UserNode user1 = findUser(user1Id);
        UserNode user2 = findUser(user2Id);
        if (user1 != null && user2 != null) {
            removeFriendHelper(user1, user2Id);
            removeFriendHelper(user2, user1Id);
        }
    }

    private void removeFriendHelper(UserNode user, int friendId) {
        FriendNode temp = user.getFriendsHead(), prev = null;
        while (temp != null) {
            if (temp.getFriendId() == friendId) {
                if (prev != null) {
                    prev.setNext(temp.getNext());
                } else {
                    user.setFriendsHead(temp.getNext());
                }
                return;
            }
            prev = temp;
            temp = temp.getNext();
        }
    }

    public int countFriends(int userId) {
        UserNode user = findUser(userId);
        if (user == null) {
            return 0;
        }
        int count = 0;
        FriendNode temp = user.getFriendsHead();
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
}
