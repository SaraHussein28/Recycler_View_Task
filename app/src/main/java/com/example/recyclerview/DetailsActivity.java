package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class DetailsActivity extends AppCompatActivity {
    TextView mDetails;
    ImageView mImage;
    TextView mPrice;
    MaterialButton mAddToBasketBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initViews();
        updateViews();
        setClicks();
    }

    private void setClicks() {
        mAddToBasketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DetailsActivity.this, "Item Is Added To Basket", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    private void updateViews() {
        Bitmap bitmap = (Bitmap) getIntent().getParcelableExtra("Image");
        mImage.setImageBitmap(bitmap);

        String details = getIntent().getStringExtra("Details");
        mDetails.setText(details);

      //  String price = getIntent().getStringExtra("Price");
    //    mPrice.setText(price);
    }

    private void initViews() {
        mDetails = findViewById(R.id.details_txt);
        mImage = findViewById(R.id.dish_img);
        mAddToBasketBtn = findViewById(R.id.add_to_basket_btn);
     //   mPrice.findViewById(R.id.price_data);
    }
}