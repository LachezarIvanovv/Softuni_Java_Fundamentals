package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static class User {
        public User(int likesCount, int commentsCount) {
            this.likesCount = likesCount;
            this.commentsCount = commentsCount;
        }

        public int getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(int likesCount) {
            this.likesCount = likesCount;
        }

        public int getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(int commentsCount) {
            this.commentsCount = commentsCount;
        }

        int likesCount;
        int commentsCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, User> users = new LinkedHashMap();
        String line = scanner.nextLine();

        int like = 0;
        int comment = 0;

        while (!line.equals("Log out")) {

            String[] command = line.split(": ");
            String name = command[1];
            User user = new User(like, comment);

            switch (command[0]) {
                case "New follower":
                    users.putIfAbsent(name, user);
                    break;
                case "Like":
                    if (users.containsKey(name)) {
                        int totalLike = users.get(name).getLikesCount();
                        int newLike = Integer.parseInt(command[2]);
                        users.get(name).setLikesCount(totalLike + newLike);
                    } else {
                        users.putIfAbsent(name, user);
                        user.setLikesCount(Integer.parseInt(command[2]));
                    }
                    break;
                case "Comment":
                    if (users.containsKey(name)) {
                        int totalComment = users.get(name).getCommentsCount();
                        int newComment = 1;
                        users.get(name).setCommentsCount(totalComment + newComment);
                    } else {
                        users.putIfAbsent(name, user);
                        user.setCommentsCount(1);
                    }
                    break;
                case "Blocked":
                    if (users.containsKey(name)) {
                        users.remove(name);
                    } else {
                        System.out.println(name + " doesn't exist.");
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("%d followers %n", users.size());
        users.forEach((k, v) -> {
            System.out.printf("%s: ", k);
            System.out.printf("%d\n", users.get(k).getCommentsCount() + users.get(k).getLikesCount());
        });
    }
}
