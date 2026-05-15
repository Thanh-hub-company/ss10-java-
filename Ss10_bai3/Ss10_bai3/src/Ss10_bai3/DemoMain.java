package Ss10_bai3;

public class DemoMain {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Computer
        Computer myComputer = new Computer();

        // Giả lập dữ liệu đầu vào
        double basePrice = 15000000.0; // 15 triệu VND
        double tax = 1500000.0;        // 1.5 triệu VAT
        double discount = 500000.0;    // Giảm giá 500k

        System.out.println("===== CHƯƠNG TRÌNH TÍNH GIÁ MÁY TÍNH =====\n");

        // Tình huống 1: Khách mua máy không chịu thuế, không giảm giá
        System.out.println("--- Tình huống 1 ---");
        double result1 = myComputer.calculatePrice(basePrice);
        System.out.printf("-> Giá cuối cùng: %,.2f VND\n\n", result1);

        // Tình huống 2: Khách mua máy có tính thuế VAT
        System.out.println("--- Tình huống 2 ---");
        double result2 = myComputer.calculatePrice(basePrice, tax);
        System.out.printf("-> Giá cuối cùng: %,.2f VND\n\n", result2);

        // Tình huống 3: Khách có thẻ VIP (Đầy đủ Thuế và Giảm giá)
        System.out.println("--- Tình huống 3 ---");
        double result3 = myComputer.calculatePrice(basePrice, tax, discount);
        System.out.printf("-> Giá cuối cùng: %,.2f VND\n\n", result3);

        System.out.println("==========================================");
    }
}