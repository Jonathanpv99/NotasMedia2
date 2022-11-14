package com.jonathanpea.notasmedia.Adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.jonathanpea.notasmedia.Models.Notes;
import com.jonathanpea.notasmedia.NotesClickListener;
import com.jonathanpea.notasmedia.R;

import java.util.List;

public class NotesListAdapter extends RecyclerView.Adapter<NotesViewHolder> {
    Context context;
    List<Notes> List;
    NotesClickListener Listener;

    public NotesListAdapter(Context context, java.util.List<Notes> list, NotesClickListener listener) {
        this.context = context;
        List = list;
        Listener = listener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotesViewHolder(LayoutInflater.from(context).inflate(R.layout.notes_liste,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
              holder.textView_title.setText(List.get(position).getTitle());
              holder.textView_title.setSelected(true);

              holder.textView_notes.setText(List.get(position).getNotes());

              holder.textView_date.setText(List.get(position).getDate());
              holder.textView_date.setSelected(true);

              if(List.get(position).isPinned()){
                  holder.imageView_pin.setImageResource(R.drawable.clip);
              }
              else{
                  holder.imageView_pin.setImageResource(0);
              }
    }

    @Override
    public int getItemCount() {
        return List.size();
    }
}
class NotesViewHolder extends RecyclerView.ViewHolder{
    CardView notes_containers;
    TextView textView_title, textView_notes, textView_date;
    ImageView imageView_pin;

    public NotesViewHolder(@NonNull View itemView){
        super(itemView);
        notes_containers = itemView.findViewById(R.id.notes_container);
        notes_containers = itemView.findViewById(R.id.textView_title);
        notes_containers = itemView.findViewById(R.id.textView_notes);
        notes_containers = itemView.findViewById(R.id.textView_date);
        notes_containers = itemView.findViewById(R.id.imageView_pin);
    }
}

