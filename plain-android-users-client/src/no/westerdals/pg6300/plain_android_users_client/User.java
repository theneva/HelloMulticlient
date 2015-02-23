package no.westerdals.pg6300.plain_android_users_client;

public class User
{
    private String username;

    public User()
    {
    }

    public User(final String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(final String username)
    {
        this.username = username;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
