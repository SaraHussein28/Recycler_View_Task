package com.example.recyclerview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private final ImageView charImg;
    private final TextView charName;
 //   private final TextView price;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);

        charImg = itemView.findViewById(R.id.character_img);
        charName = itemView.findViewById(R.id.character_name_label);
   //     price = itemView.findViewById(R.id.price_data);
        itemView.setOnClickListener(this);
    }

    public void populateCharacterInfo(Character character){
    charName.setText(character.getName());
    charImg.setImageResource(character.getImageSrc());
   // price.setText(character.getPrice());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == itemView.getId()){

            charImg.setDrawingCacheEnabled(true);
            Bitmap b=charImg.getDrawingCache();

            Intent intent = new Intent(itemView.getContext(), DetailsActivity.class);
            intent.putExtra("Details" , charName.getText());
            intent.putExtra("Image", b);
     //       intent.putExtra("Price", price.getText() + " EGP");
            itemView.getContext().startActivity(intent);
        }
    }
}
