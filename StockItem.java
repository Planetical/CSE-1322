public class StockItem {
        String description;
        int id;
        double price;
        int quantity;
        static int idNum = 0;

        public StockItem() {

        }

        public StockItem(String description, double price, int quantity) {
                this.description = description;
                this.id = idNum++;
                this.price = price;
                this.quantity = quantity;
        }

        public String getDescription() {
                return description;
        }

        public int getId() {
                return id;
        }

        public int getQuantity() {
                return quantity;
        }

        public double getPrice() {
                return price;
        }

        public void changePrice(double price) {
                if (price <= 0){
                        System.out.println("Price must be higher than 0.");
                        return;
                } else {
                        this.price = price;
                }
        }

        public void lowerQuantity(int quantity) {
                int newQuantity = this.quantity - quantity;
                if (newQuantity < 0) {
                        System.out.println("Quantity cannot be below 0.");
                        return;
                } else {
                        this.quantity = this.quantity - quantity;
                }
        }

        public void increaseQuantity(int quantity) {
                this.quantity = this.quantity + quantity;
        }

        @Override
        public String toString() {
                return "Item number:" + id + " is " + description + " has price " + price + " we currently have " + quantity + " in stock";
        }

}
