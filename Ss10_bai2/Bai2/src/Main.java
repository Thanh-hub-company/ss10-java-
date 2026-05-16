public class Main {
    public static void main(String[] args) {
        // Tính đa hình: Khai báo kiểu Shape nhưng khởi tạo kiểu con
        Shape s1 = new Rectangle(2, 3);
        Shape s2 = new Circle(1);

        // In ra diện tích của các hình
        System.out.println("Dien tich hinh chu nhat (s1): " + s1.area());
        System.out.println("Dien tich hinh tron (s2): " + s2.area());
    }
}
