public class Circle extends Shape {
    private double radius;

    // Constructor khởi tạo bán kính
    public Circle(double radius) {
        this.radius = radius;
    }

    // Ghi đè (Override) phương thức area() để tính diện tích hình tròn
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}