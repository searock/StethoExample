package net.searock.stethoexample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.searock.stethoexample.R;
import net.searock.stethoexample.domain.User;
import net.searock.stethoexample.remote.GitHubServiceImpl;
import net.searock.stethoexample.remote.ViewCallback;

public class MainActivity extends AppCompatActivity {

    private TextView tvUsername;
    private Button btnUsername;
    private GitHubServiceImpl gitHubServiceImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsername = findViewById(R.id.tvUsername);
        btnUsername = findViewById(R.id.btnUsername);
        btnUsername.setOnClickListener(btnUsernameClickListener);
        gitHubServiceImpl = new GitHubServiceImpl();
    }

    ViewCallback<User, Exception> callback = new ViewCallback<User, Exception>() {
        @Override
        public void onSuccess(User domain) {
            tvUsername.setText(domain.getId() + " - " + domain.getLogin());
        }

        @Override
        public void onError(Exception exception) {
            Toast.makeText(MainActivity.this, "Network error", Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener btnUsernameClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gitHubServiceImpl.getUserByLoginName("octocat", callback);
        }
    };
}
