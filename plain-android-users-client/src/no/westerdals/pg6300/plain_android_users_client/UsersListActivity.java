package no.westerdals.pg6300.plain_android_users_client;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import org.androidannotations.annotations.*;
import org.androidannotations.annotations.rest.RestService;

import java.util.List;

@EActivity
public class UsersListActivity extends ListActivity
{
    @ViewById
    Button loadUsersButton;

    @RestService
    UserClient userClient;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_list);
    }

    @AfterInject
    @Click(R.id.loadUsersButton)
    @Background
    void loadUsers()
    {
        List<User> users = userClient.query();
        displayUsers(users);
    }

    @UiThread
    void displayUsers(List<User> users)
    {
        ArrayAdapter<User> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
    }
}
