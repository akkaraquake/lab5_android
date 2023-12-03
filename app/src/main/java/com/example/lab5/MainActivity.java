package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        final LinearLayout mylayout = (LinearLayout) findViewById(R.id.root);
        int itemId = item.getItemId();
        if (itemId == R.id.red) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.red));
            return true;
        } else if (itemId == R.id.green) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.green));
            return true;
        } else if (itemId == R.id.blue) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.blue));
            return true;
        } else if (itemId == R.id.black) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.black));
            return true;
        }  else if (itemId == R.id.yellow) {
            mylayout.setBackgroundColor(getResources().getColor(R.color.yellow));
            return true;
        } else if (itemId == R.id.background_2) {
            mylayout.setBackgroundResource(R.drawable.background_2);
            return true;
        } else if (itemId == R.id.textfield) {
            addTextField();
            return true;
        }
        else if (itemId == R.id.exit) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addTextField() {
        final LinearLayout mylayout = (LinearLayout) findViewById(R.id.root);
        EditText textField = new EditText(this);
        textField.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        textField.setTextColor(getResources().getColor(R.color.white));
        mylayout.addView(textField);
    }
}