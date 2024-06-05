package TH;

import java.util.Scanner;

public class Build {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input category id: ");
        int categoryId = Integer.parseInt(scanner.nextLine());
        System.out.println("input category name: ");
        String categoryName = scanner.nextLine();
        Category category = new Category(categoryId, categoryName);
        System.out.println("input product id: ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.println("input product name: ");
        String productName = scanner.nextLine();
        System.out.println("input product price: ");
        float productPrice = Float.parseFloat(scanner.nextLine());
        Product Product = new Product( productId,productName,productPrice,category);
//       SHOW PRODUCT
        System.out.println("SHOW product OF category: ");
        Product.displayData();
    }
}
