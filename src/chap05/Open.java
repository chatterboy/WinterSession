package chap05;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */

class Product {
    int id;
    String desc;
    String maker;
    int price;
    Product() {}
    Product(int id, String desc, String maker, int price) {
        this.id = id;
        this.desc = desc;
        this.maker = maker;
        this.price = price;
    }
    public Product input(int id, Scanner in) {
        this.id = id;
        System.out.print("상품 설명>>");
        in.skip("[\\n\\r]+");
        desc = in.nextLine();
        System.out.print("생산자>>");
        maker = in.next();
        System.out.print("가격>>");
        price = in.nextInt();
        return this;
    }
    public void show() {
        System.out.println("상품ID>>" + String.valueOf(id));
        System.out.println("상품 설명>>" + desc);
        System.out.println("상품 설명>>" + maker);
        System.out.println("상품 설명>>" + String.valueOf(price));
    }
}

class Book extends Product {
    String ISBN;
    String author;
    String title;
    Book() {}
    Book(int id, String desc, String maker, int price, String ISBN, String author, String title) {
        super(id, desc, maker, price);
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }
    @Override
    public Book input(int id, Scanner in) {
        super.input(id, in);
        System.out.print("ISBN>>");
        ISBN = in.next();
        System.out.print("저자>>");
        author = in.next();
        System.out.print("책 제목>>");
        in.skip("[\\n\\r]+");
        title = in.nextLine();
        return this;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("ISBN>>" + ISBN);
        System.out.println("저자>>" + author);
        System.out.println("책 제목>>" + title);
    }
}

class CompactDisc extends Product {
    String title;
    String singer;
    CompactDisc() {}
    CompactDisc(int id, String desc, String maker, int price, String title, String singer) {
        super(id, desc, maker, price);
        this.title = title;
        this.singer = singer;
    }
    @Override
    public CompactDisc input(int id, Scanner in) {
        super.input(id, in);
        System.out.print("앨범 제목>>");
        in.skip("[\\n\\r]+");
        this.title = in.nextLine();
        System.out.print("가수>>");
        this.singer = in.next();
        return this;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("앨범 제목>>" + title);
        System.out.println("가수>>" + singer);
    }
}

class ConversationBook extends Book {
    String lang;
    ConversationBook() {}
    ConversationBook(int id, String desc, String maker, int price, String ISBN, String author, String title, String lang) {
        super(id, desc, maker, price, ISBN, author, title);
        this.lang = lang;
    }
    @Override
    public ConversationBook input(int id, Scanner in) {
        super.input(id, in);
        System.out.print("언어>>");
        lang = in.next();
        return this;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("언어>>");
    }
}

public class Open {
    interface Item {
        public Product get(int i);
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\\n");
        boolean exit = false;
        int id = 0;
        Product [] products = new Product[10];
        Item item = (int i) -> {
            if (i == 1) return new Book();
            if (i == 2) return new CompactDisc();
            return new ConversationBook();
        };
        for (;;) {
            System.out.print("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3>>>");
            int menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("상품 종류 책<1>, 음악CD<2>, 회화책<3>>>");
                    int type = in.nextInt();
                    Product product = item.get(type).input(id, in);
                    products[id++] = product;
                    break;
                case 2:
                    int n = id;
                    for (int i = 0; i < n; ++i) {
                        products[i].show();
                    }
                    break;
                case 3:
                    exit = true;
                    break;
            }
            if (exit) break;
        }
        in.close();
    }
}
