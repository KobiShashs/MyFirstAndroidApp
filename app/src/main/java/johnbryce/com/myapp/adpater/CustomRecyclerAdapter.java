package johnbryce.com.myapp.adpater;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import johnbryce.com.myapp.R;
import johnbryce.com.myapp.model.Person;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<Person> people;

    public CustomRecyclerAdapter(Context context, List people) {
        this.context = context;
        this.people = people;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(people.get(position));

        Person person = people.get(position);

        holder.personId.setText(String.valueOf(person.getId()));
        holder.personName.setText(person.getName());
        holder.personAge.setText(String.valueOf(person.getAge()));

    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView personId;
        public TextView personName;
        public TextView personAge;

        public ViewHolder(View itemView) {
            super(itemView);

            personId = (TextView) itemView.findViewById(R.id.text_view_id);
            personName = (TextView) itemView.findViewById(R.id.text_view_name);
            personAge = (TextView)itemView.findViewById(R.id.text_view_age);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Person person = (Person) view.getTag();

                    Toast.makeText(view.getContext(), person.getId()+" "+person.getName()+" "+person.getAge(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }

}