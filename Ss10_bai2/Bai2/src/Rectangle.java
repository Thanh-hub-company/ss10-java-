public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor khởi tạo chiều rộng và chiều cao
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Ghi đè (Override) phương thức area() để tính diện tích hình chữ nhật
    @Override
    public double area() {
        return width * height;
    }
}