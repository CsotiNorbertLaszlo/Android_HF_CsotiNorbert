    package com.example.hf3;

    import androidx.appcompat.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        private EditText emailEditText;
        private EditText passwordEditText;
        private Button loginButton;
        private Button homeButton;
        private Button signUpButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            emailEditText = findViewById(R.id.emailEditText);
            passwordEditText = findViewById(R.id.passwordEditText);
            loginButton = findViewById(R.id.loginButton);
            homeButton = findViewById(R.id.homeButton);
            signUpButton = findViewById(R.id.signUpButton);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String email = emailEditText.getText().toString();
                    String password = passwordEditText.getText().toString();

                    if (isLoginSuccessful(email, password)) {
                        Toast.makeText(MainActivity.this, "Bejelentkezés sikeres!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Bejelentkezés sikertelen!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        private boolean isLoginSuccessful(String email, String password) {
            return email.equals("admin") && password.equals("admin");
        }
    }