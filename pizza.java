public class pizza {
    private static final int MAX_TOPPINGS = 10;
    private String[] toppings;
    private int totalToppings;

    // Constructor
    public pizza() {
        toppings = new String[MAX_TOPPINGS];
        totalToppings = 0;
    }

    // เพิ่มเครื่องปรุง
    public void addTopping(String topping) {
        if (totalToppings < MAX_TOPPINGS) {
            toppings[totalToppings] = topping;
            totalToppings++;
        } else {
            System.out.println("เลือกท็อปปิ้งได้ไม่เกิน " + MAX_TOPPINGS + " อย่าง");
        }
    }

    // บอกจำนวนเครื่องปรุง
    public int getTotalToppings() {
        return totalToppings;
    }

    // คำนวณราคาพิซซ่า
    public int getPrice() {
        return 100 + (10 * totalToppings);
    }

    // แสดงเครื่องปรุงทั้งหมด
    public void printAllTopping() {
        if (totalToppings == 0) {
            System.out.println("ไม่มีท็อปปิ้ง");
        } else {
            System.out.println("รายการท็อปปิ้ง:");
            for (int i = 0; i < totalToppings; i++) {
                System.out.println("- " + toppings[i]);
            }
        }
    }
}
