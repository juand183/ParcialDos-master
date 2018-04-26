package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Food;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

public class GameAdapter {
    List<Food> gameList = new ArrayList<>();
    Context context;

    public GameAdapter(List<Food> countryList, Context context) {
        this.gameList = countryList;
        this.context = context;
    }


    @NonNull

    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        FoodAdapter.ViewHolder viewHolder = new GameAdapter().ViewHolder(item);

        return viewHolder;
    }


    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.textView.setText(gameList.get(position).getTitle());

    }


    public int getItemCount() {
        return gameList.size();
    }

    // ******************************************************************************

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;


        public ViewHolder(View item) {
            super(item);

            textView = (TextView) item.findViewById(R.id.id_txv_game_name);

        }
    }
}

}
