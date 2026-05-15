package Ss10_bai3;


public class Computer {

    // Phiên bản 1: Chỉ tính theo giá gốc
    public double calculatePrice(double basePrice) {
        System.out.println("[Hệ thống] Đang áp dụng công thức 1: Chỉ tính theo giá gốc.");
        return basePrice;
    }

    // Phiên bản 2: Tính theo giá gốc + thuế (VAT)
    public double calculatePrice(double basePrice, double tax) {
        System.out.println("[Hệ thống] Đang áp dụng công thức 2: Giá gốc + Thuế (VAT).");
        return basePrice + tax;
    }

    // Phiên bản 3: Tính theo giá gốc + thuế - giảm giá (Discount)
    public double calculatePrice(double basePrice, double tax, double discount) {
        System.out.println("[Hệ thống] Đang áp dụng công thức 3: Giá gốc + Thuế (VAT) - Giảm giá.");
        return basePrice + tax - discount;
    }
}