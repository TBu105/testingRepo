package com.example.historyview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HistoryClass {
    int imgAva;
    String txtLostMoney, txtJamName, txtMinuteAgo;


    public HistoryClass(int imgAva, String txtLostMoney, String txtJamName, String txtMinuteAgo) {
        this.imgAva = imgAva;
        this.txtLostMoney = txtLostMoney;
        this.txtJamName = txtJamName;
        this.txtMinuteAgo = txtMinuteAgo;
    }

    public int getImgAva() {
        return imgAva;
    }

    public String getTxtLostMoney() {
        return txtLostMoney;
    }

    public String getTxtJamName() {
        return txtJamName;
    }

    public String getTxtMinuteAgo() {
        return txtMinuteAgo;
    }
}
