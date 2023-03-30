package ClassesAndObjects.exerice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>();

        for(int i = 0; i < number; i++){
            String[] data = scanner.nextLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            articleList.add(article);
        }
        articleList.stream().forEach(article -> System.out.println(article.toString()));

    }
    static class Article{
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}
