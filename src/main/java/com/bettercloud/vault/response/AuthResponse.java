package com.bettercloud.vault.response;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Document...
 *
 * TODO: Can we use the same type for all auth backends?  Is that a good idea, or would it be less messy to have multiple response types?
 */
public class AuthResponse {

    private String leaseId;
    private boolean renewable;
    private int leaseDuration;
    private String authClientToken;
    private List<String> authPolicies = new ArrayList<String>();
    private int authLeaseDuration;
    private boolean authRenewable;
    private String appId;
    private String userId;
    private String username;

    // TODO: Do we also need fields for "data" and/or "authMetadata"?

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(final String leaseId) {
        this.leaseId = leaseId;
    }

    public boolean isRenewable() {
        return renewable;
    }

    public void setRenewable(final boolean renewable) {
        this.renewable = renewable;
    }

    public int getLeaseDuration() {
        return leaseDuration;
    }

    public void setLeaseDuration(final int leaseDuration) {
        this.leaseDuration = leaseDuration;
    }

    public String getAuthClientToken() {
        return authClientToken;
    }

    public void setAuthClientToken(final String authClientToken) {
        this.authClientToken = authClientToken;
    }

    public List<String> getAuthPolicies() {
        return authPolicies;
    }

    public void setAuthPolicies(final List<String> authPolicies) {
        this.authPolicies.clear();
        this.authPolicies.addAll(authPolicies);
    }

    public int getAuthLeaseDuration() {
        return authLeaseDuration;
    }

    public void setAuthLeaseDuration(final int authLeaseDuration) {
        this.authLeaseDuration = authLeaseDuration;
    }

    public boolean isAuthRenewable() {
        return authRenewable;
    }

    public void setAuthRenewable(final boolean authRenewable) {
        this.authRenewable = authRenewable;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(final String appId) {
        this.appId = appId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

}
