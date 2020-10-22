package <your package>;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.basbaer.baked.databinding.AlertDialogLayoutBinding;

public class Custom_AlertDialog extends Dialog{

    AlertDialogLayoutBinding alertDialogLayoutBinding;

    public Activity activity;
    RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    Adapter_RecyclerView_AlertDialog adapter;


    public AlertDialog_RecyclerView(Activity activity, Adapter_RecyclerView_AlertDialog adapter){
        super(activity);

        this.activity = activity;
        this.adapter = adapter;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        alertDialogLayoutBinding = AlertDialogLayoutBinding.inflate(getLayoutInflater());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(alertDialogLayoutBinding.getRoot());


        //set up the RecyclerView for AlertDialog
        recyclerView = alertDialogLayoutBinding.recyclerViewAlertDialog;

        //setting the layout manager
        mLayoutManager = new LinearLayoutManager(activity);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);


    }
}
