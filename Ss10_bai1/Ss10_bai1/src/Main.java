public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog tên là "Buddy"
        Dog d = new Dog("Buddy");

        // Gọi phương thức makeSound() được kế thừa từ Animal
        d.makeSound();
    }
}