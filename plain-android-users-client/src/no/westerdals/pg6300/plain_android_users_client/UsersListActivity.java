package no.westerdals.pg6300.plain_android_users_client;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import org.androidannotations.annotations.*;
import org.androidannotations.annotations.rest.RestService;

import java.util.List;

@EActivity
public class UsersListActivity extends Activity
{
    @ViewById
    Button loadUsersButton;

    @ViewById
    TextView usersTextView;

    @RestService
    UserClient userClient;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @AfterInject
    @Click(R.id.loadUsersButton)
    @Background
    void loadUsers()
    {
        List<User> users = userClient.query();
        System.out.println(users);
    }

    @AfterViews
    void afterViews()
    {
        usersTextView.setText("Ananas er best");
    }
}
