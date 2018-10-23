package com.example.corentinbourlet.test2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
public class IconAdapter extends RecyclerView.Adapter<IconDataViewHolder>{

    private ArrayList<IconData> icons;

    public IconAdapter(ArrayList<IconData> icons) { this.icons = icons; }

    public IconDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_icon, parent, false);
        return new IconDataViewHolder(row);
    }

    public void onBindViewHolder(IconDataViewHolder viewholder, int position) {
        IconData iconToDisplay = this.icons.get(position);

        viewholder.txvName.setText(iconToDisplay.getName());
        viewholder.imvImage.setImage(iconToDisplay.getImage());
    }

    public int getItemCount() {
        return this.icons.size();
    }

}*/