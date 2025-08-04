public class testpizza {
    public static void main(String[] args) {
        pizza myPizza = new pizza();

        // เพิ่มเครื่องปรุง
        myPizza.addTopping("เห็ด");
        myPizza.addTopping("ไส้กรอก");
        myPizza.addTopping("แฮม");
        myPizza.addTopping("สับปะรด");

        // แสดงจำนวนเครื่องปรุง
        System.out.println("จำนวนท็อปปิ้ง: " + myPizza.getTotalToppings());

        // แสดงราคา
        System.out.println("ราคารวม: " + myPizza.getPrice() + " บาท");

        // แสดงเครื่องปรุงทั้งหมด
        myPizza.printAllTopping();
    }
}