import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();

        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Profile created with minimal values!");
        System.out.println("Profile1 email: " + p.getEmail());

        UserProfile p2 = new UserProfile.Builder("u2", "bob@builder.com")
                .displayName("Bob the Builder")
                .twitter("@buildingbob")
                .marketingOptIn(true)
                .build();
        System.out.println("Profile created with some extra values!");
        System.out.println("Profile2 displayName: " + p2.getDisplayName());
        System.out.println("Profile2 twitter: " + p2.getTwitter());
    }
}