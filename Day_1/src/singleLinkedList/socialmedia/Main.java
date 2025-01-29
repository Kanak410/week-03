package singleLinkedList.socialmedia;

public class Main {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        // Adding users
        socialMedia.addUser(1, "sakshi", 25);
        socialMedia.addUser(2, "naman", 27);
        socialMedia.addUser(3, "ali", 22);

        // Adding friendships
        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(1, 3);

        // Counting friends
        System.out.println("sakshi's friend count: " + socialMedia.countFriends(1)); // Output: 2
        System.out.println("naman's friend count: " + socialMedia.countFriends(2));   // Output: 1
        System.out.println("ali's friend count: " + socialMedia.countFriends(3)); // Output: 1

        // Removing a friend
        socialMedia.removeFriend(1, 2);
        System.out.println("sakshi's friend count after removal: " + socialMedia.countFriends(1)); // Output: 1
        System.out.println("naman's friend count after removal: " + socialMedia.countFriends(2));   // Output: 0
    }
}
