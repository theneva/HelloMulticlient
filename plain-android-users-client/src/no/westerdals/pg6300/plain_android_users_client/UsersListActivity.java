package no.westerdals.pg6300.plain_android_users_client;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public class UsersListActivity extends Activity
{
    @ViewById
    Button loadUsersButton;

    @ViewById
    TextView usersTextView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @AfterViews
    void afterViews()
    {
        usersTextView.setText("Ananas er best");
    }

    @Click(R.id.loadUsersButton)
    void loadUsers()
    {
        Log.wtf("TAG", "{username: theknarf}");
    }
}
