package Adapters;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.DetailsActivity;
import com.example.recyclerview.R;

import java.util.List;
import Model.Listitem;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
private  Context context;
private List<Listitem> listItems;

public MyAdapter(Context context, List listitem){
     this.context = context;
     this.listItems = listitem;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);

    return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

    Listitem item  = listItems.get(position);
        holder.name.setText(item.getName());
    holder.description.setText(item.getDescription());
    holder.remarks.setText(item.getRemarks());
}

    @Override
    public int getItemCount() {
        return listItems.size();
    }
   public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
   public TextView name;
   public TextView description;
   public TextView remarks;
   public ViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
                name = (TextView) itemView.findViewById(R.id.name);
    description = (TextView) itemView.findViewById(R.id.description);
    remarks = (TextView) itemView.findViewById(R.id.remarks);
   }

       @Override
       public void onClick(View v) {
       int position = getAdapterPosition();
           Listitem item = listItems.get(position);
           Intent intent = new Intent(context, DetailsActivity.class);
           intent.putExtra("name", item.getName());
           intent.putExtra("description ", item.getDescription());
           intent.putExtra("remarks", item.getRemarks());

        context.startActivity(intent);

           Toast.makeText(context, item.getName(), Toast.LENGTH_LONG).show();


   }
   }

}
