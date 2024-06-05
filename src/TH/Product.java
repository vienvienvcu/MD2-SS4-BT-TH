package TH;

import java.util.Scanner;

public class Product {
  private int productId;
  private String productName;
  private float productPrice;
  private Category category;

//2.    constructor
    public Product() {
    }
    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }
    public void  displayData(){
        System.out.printf("productId: %d\nproductName: %s\nproductPrice: %s\ncategory:%s\n",productId,productName,productPrice,category.getCategoryName());
    }


}