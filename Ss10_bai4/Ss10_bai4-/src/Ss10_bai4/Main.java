package Ss10_bai4;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== HỆ THỐNG THỬ NGHIỆM XE Ô TÔ (CAR DEMO) =====\n");

        // 1. Khởi tạo đối tượng Car độc lập
        Car myCar = new Car();
        myCar.printStatus(); // Vận tốc ban đầu: 0 km/h

        // 2. Gọi phiên bản nạp chồng 1: Tăng tốc mặc định
        myCar.accelerate();
        myCar.printStatus();

        // 3. Gọi phiên bản nạp chồng 2: Tăng tốc thêm một khoảng cố định (ví dụ: 40 km/h)
        myCar.accelerate(40);
        myCar.printStatus();

        // 4. Gọi phiên bản nạp chồng 3: Tăng tốc theo thời gian giữ ga (ví dụ: tăng 5 km/h trong 6 giây)
        myCar.accelerate(5, 6);
        myCar.printStatus();

        System.out.println("===== KẾT THÚC QUÁ TRÌNH THỬ NGHIỆM =====");
    }
}