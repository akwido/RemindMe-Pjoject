package w72016.com.remindme.adapter;

import android.view.View;
import android.widget.TextView;

import java.util.List;

import w72016.com.remindme.dto.RemindDTO;

/**
 * Created by 2016W7 on 08.08.2016.
 */
// в качестве типа переадается <RemindListAdapter.RemindViewHolder> т.е. внутренний класс
public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemindViewHolder>{

    // объект который будет приходить с сервера
    private List<RemindDTO> data;

    public RemindListAdapter(List<RemindDTO> data){
        this.data = data;
    }
    //-----------------------

    public static class RemindViewHolder extends RecyclerView.Viewholder{

        CardView cardView; // cardview  - будет управлять recyclerview
        TextView title;
        //constructor
        public RemindViewHolder (View itemView){
            super(itemView)
        }

      cardView = (CardView)  itemView.findViewById(R.id.cardView);
     titile = (TextView)  itemView.findViewById(R.id.title);

    }
}

