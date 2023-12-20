package com.example.hf4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder> {

    private String[] currencyCodes;
    private String[] buyRates;
    private String[] sellRates;
    private String[] currencyNames;
    private Context context;

    public CurrencyAdapter(Context context, String[] currencyCodes, String[] buyRates, String[] sellRates, String[] currencyNames) {
        this.context = context;
        this.currencyCodes = currencyCodes;
        this.buyRates = buyRates;
        this.sellRates = sellRates;
        this.currencyNames = currencyNames;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_currency, parent, false);
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, int position) {
        holder.textCurrencyCode.setText(currencyCodes[position]);
        holder.textBuy.setText("VÉTEL: " + buyRates[position]);
        holder.textSell.setText("ELADÁS: " + sellRates[position]);
        holder.textCurrencyName.setText(currencyNames[position]);

    }

    @Override
    public int getItemCount() {
        return currencyCodes.length;
    }

    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView textCurrencyCode, textBuy, textSell, textCurrencyName;
        ImageView imageFlag;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            textCurrencyCode = itemView.findViewById(R.id.textCurrencyCode);
            textBuy = itemView.findViewById(R.id.textBuy);
            textSell = itemView.findViewById(R.id.textSell);
            textCurrencyName = itemView.findViewById(R.id.textCurrencyName);
            imageFlag = itemView.findViewById(R.id.imageFlag);
        }
    }
}
