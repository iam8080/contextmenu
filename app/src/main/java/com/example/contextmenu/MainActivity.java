package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)  findViewById(R.id.btn);
        registerForContextMenu(btn1);
    }
    public void onCreateContextMenu(ContextMenu m ,View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.context_menu,m);
        super.onCreateContextMenu(m , v , menuInfo);
    }
    public  boolean onContextItemSelected(@NonNull MenuItem item)
    {
        int itemmid;
        itemmid = item.getItemId();
        if (itemmid == R.id.o1)
            Toast.makeText(this, "First", Toast.LENGTH_SHORT).show();

        if (itemmid == R.id.o2)
            Toast.makeText(this, "Second", Toast.LENGTH_SHORT).show();

        if (itemmid == R.id.o3)
            Toast.makeText(this, "Three", Toast.LENGTH_SHORT).show();

        return  super.onContextItemSelected(item);
    }
}