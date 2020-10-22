package <your package>;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterForRecyclerView extends RecyclerView.Adapter<CustomAdapterForRecyclerView.mViewHolder> {

    public static class mViewHolder extends RecyclerView.ViewHolder{

        public CheckBox checkBox;

        public mViewHolder(View view){
            super(view);

            checkBox = view.findViewById(R.id.checkbox);

        }


    }

    private ArrayList<String> arrayList;

    public Adapter_RecyclerView_AlertDialog(ArrayList<String> dataSet){

        arrayList = dataSet;
    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_layout, parent, false);

        mViewHolder mViewHolder = new mViewHolder(v);

        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {
        String s = arrayList.get(position);

        holder.checkBox.setText(arrayLists.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
