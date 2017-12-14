package de.cooperateproject.cdo.util.connection;

public class CDOConnectionSettings {

    public static class Builder {
        private final CDOConnectionSettings settings = new CDOConnectionSettings();

        public Builder setHost(String host) {
            settings.setHost(host);
            return this;
        }

        public Builder setPort(int port) {
            settings.setPort(port);
            return this;
        }

        public Builder setRepo(String repo) {
            settings.setRepo(repo);
            return this;
        }

        public Builder setUser(String user) {
            settings.setUser(user);
            return this;
        }

        public Builder setPassword(String password) {
            settings.setPassword(password);
            return this;
        }

        public CDOConnectionSettings build() {
            return settings;
        }
    }

    private String host;
    private int port;
    private String repo;
    private String user;
    private String password;

    public static Builder builder() {
        return new Builder();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
