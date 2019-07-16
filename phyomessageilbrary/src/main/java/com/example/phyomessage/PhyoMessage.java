package com.example.phyomessage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phyomessage.TitleAndList.DialogListAdapter;

import java.util.List;

public class PhyoMessage {
    public static void TitleAndMessage(Context context, String title, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle(title);
        dialog.setMessage(message);
        AlertDialog alert = dialog.create();
        alert.show();
    }

    public static void MessageOnly(Context context, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setMessage(message);
        AlertDialog alert = dialog.create();
        alert.show();
    }
    public static void showPhyoDialog(Context context, String title, String message, List<String> listItems) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_layout, null);
        TextView dialogTitle = dialogView.findViewById(R.id.dialog_title);
        TextView dialogMessage = dialogView.findViewById(R.id.dialog_message);
        RecyclerView recyclerView = dialogView.findViewById(R.id.dialog_list_recycler);
        if (title.length() > 0) {
            dialogTitle.setText(title);
        }else {
            dialogTitle.setVisibility(View.GONE);
        }

        if (message.length() > 0) {
            dialogMessage.setText(message);
        }else {
            dialogMessage.setVisibility(View.GONE);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        DialogListAdapter adapter = new DialogListAdapter(context, listItems);
        recyclerView.setAdapter(adapter);
        dialog.setView(dialogView);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

}
