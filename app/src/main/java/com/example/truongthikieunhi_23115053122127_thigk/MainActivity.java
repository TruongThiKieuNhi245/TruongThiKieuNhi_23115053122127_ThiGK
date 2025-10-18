package com.example.truongthikieunhi_23115053122127_thigk;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtNam, edtEmail, edtPhone;
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewByld(R.id.edtName);
        edtEmail = findViewByld(R.id.edtEmail);
        edtPhone = findViewByld(R.id.edtPhone);
        btnNext = findViewByld(R.id.btnNext);

        btnNext.setOnClickListener(v-> {
            String name = editName.getText().toString().trim();
            String email = editEmail.getText().toString().trim();
                }

        });
    }
}