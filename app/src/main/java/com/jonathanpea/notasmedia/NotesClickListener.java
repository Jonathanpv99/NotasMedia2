package com.jonathanpea.notasmedia;

import androidx.cardview.widget.CardView;

import com.jonathanpea.notasmedia.Models.Notes;

import java.util.Calendar;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
