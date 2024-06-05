package TH;

    public class Category {
        private int categoryId;
        private String categoryName;

        //2.    constructor
        public Category() {
        }
        public Category(int categoryId, String categoryName) {
            this.categoryId = categoryId;
            this.categoryName = categoryName;
        }
        public String getCategoryName() {
            return categoryName;
        }
        public void  displayData(){
            System.out.printf("categoryId: %d\ncategoryName: %s\n",categoryId,categoryName);
        }
//  3. cac phuong thuc


    }

