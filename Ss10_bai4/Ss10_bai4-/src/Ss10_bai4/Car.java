package Ss10_bai4;

public class Car {
    // Khai báo thuộc tính vận tốc hiện tại
    private int currentSpeed = 0;

    // Phiên bản 1: Tăng tốc mặc định (+10 km/h)
    public void accelerate() {
        this.currentSpeed += 10;
        System.out.println("Car accelerates by default: +10 km/h");
    }

    // Phiên bản 2: Tăng tốc theo giá trị người dùng truyền vào
    public void accelerate(int speed) {
        this.currentSpeed += speed;
        System.out.println("Car accelerates by " + speed + " km/h");
    }

    // Phiên bản 3: Tăng tốc dựa trên vận tốc và thời gian giữ ga
    public void accelerate(int speed, int seconds) {
        int increase = speed * seconds;
        this.currentSpeed += increase;
        System.out.println("Car accelerates " + increase + " km/h (speed x time)");
    }

    // Phương thức in ra trạng thái vận tốc hiện tại
    public void printStatus() {
        System.out.println("-> Current speed: " + this.currentSpeed + " km/h");
        System.out.println("----------------------------------------------");
    }
}
