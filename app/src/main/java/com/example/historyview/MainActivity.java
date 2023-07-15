package com.example.historyview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnChiTieu, btnThuNhap, btnHistory;
    String Root_Frag = "root_fagment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }
    private void addControl() {
        btnHistory = findViewById(R.id.btnHistory);
        btnThuNhap = findViewById(R.id.btnThuNhap);
        btnChiTieu = findViewById(R.id.btnChiTieu);
    }
    private void addEvent() {
        // default frag
        loadFrag(new HistoryFragment(), 0);

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                loadFrag(new HistoryFragment(), 0);
            }
        });

        btnThuNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                loadFrag(new ThuNhapFragment(), 1);
            }
        });

        btnChiTieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                loadFrag(new ChiTieuFragment(), 1);
            }
        });

    }

    // flag 0 for add, 1 for replace
    public void loadFrag(Fragment fragment_name, int flag)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag == 0) {
            ft.add(R.id.FL, fragment_name);

            fm.popBackStack(Root_Frag, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(Root_Frag);
        }
        else {
            ft.replace(R.id.FL, fragment_name);
            ft.addToBackStack(null);
        }

        ft.commit();
    }
}