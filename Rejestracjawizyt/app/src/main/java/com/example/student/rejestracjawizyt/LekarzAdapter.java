package com.example.student.rejestracjawizyt;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by student on 2018-01-17.
 */

public class LekarzAdapter extends RecyclerView.Adapter<LekarzAdapter.ViewHolder> {

    private ArrayList<Lekarz>list=new ArrayList<>();

    LekarzAdapter(ArrayList<Lekarz> lekarze) {
        this.list=lekarze;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setNazwisko(list.get(position).getNazwisko());
        holder.setSpecjalizacja(list.get(position).getSpecjalizacja());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.nazwisko)
        TextView nazwisko;

        @BindView(R.id.specjalizacja)
        TextView specjalizacja;

        @OnClick(R.id.button_wybierz)
        void onNameClick(){

        }

        ViewHolder(View itemView)
        {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        void setNazwisko(String drink) {
            nazwisko.setText(drink);
        }

        void setSpecjalizacja(String price) {
            specjalizacja.setText(price);
        }


    }
}
