import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();

        UserProfile p1 = svc.createMinimal("u1", "a@b.com");
        System.out.println("Before: " + p1);

        // immutable, must rebuild with modifications
        UserProfile p2 = svc.withDisplayName(p1, "Alice Wonderland");
        System.out.println("After:  " + p2);

        System.out.println("Original still unchanged: " + p1);
    }
}
