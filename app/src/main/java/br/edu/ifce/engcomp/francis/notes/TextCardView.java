package br.edu.ifce.engcomp.francis.notes;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by francisco on 27/04/15.
 */
public class TextCardView extends CardView {
    private TextView cardViewText;

    public TextCardView(Context context, String text) {
        super(context);

        this.cardViewText = new TextView(context);
        this.initializeCardViewText(text);
    }

    private void initializeCardViewText(String text) {
        this.cardViewText.setText(text);
        this.cardViewText.setTextColor(Color.BLACK);
        this.cardViewText.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        this.addView(this.cardViewText);

        CardView.LayoutParams params = new CardView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100);
        params.setMargins(0, 200, 0, 0);

        this.setLayoutParams(params);
    }
}
