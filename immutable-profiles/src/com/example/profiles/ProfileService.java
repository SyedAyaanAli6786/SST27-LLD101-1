package com.example.profiles;

/**
 * Builds UserProfiles without mutating after creation.
 */
public class ProfileService {

    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile withDisplayName(UserProfile p, String displayName) {
        // Create a *new* profile based on existing one (copy builder pattern)
        return new UserProfile.Builder(p.getId(), p.getEmail())
                .phone(p.getPhone())
                .address(p.getAddress())
                .marketingOptIn(p.isMarketingOptIn())
                .twitter(p.getTwitter())
                .github(p.getGithub())
                .displayName(displayName)
                .build();
    }
}
