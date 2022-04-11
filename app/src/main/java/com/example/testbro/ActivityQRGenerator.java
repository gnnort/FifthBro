package com.example.testbro;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import net.glxn.qrgen.android.QRCode;

public class ActivityQRGenerator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bitmap myBitmap = QRCode.from("www.example.org").bitmap();
        ImageView myImage = (ImageView) findViewById(R.id.qr_image);
        myImage.setImageBitmap(myBitmap);
    }
}
