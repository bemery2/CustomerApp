package byranemery.csc445.customerappdemo.nonActivity;

/**
 * Created by Siren10 on 18-Mar-18.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import byranemery.csc445.customerappdemo.R;


public class RestaurantAdapter extends BaseAdapter{

    private Context context;
    private List<Restaurant> restaurantsList = new ArrayList<>();

    public RestaurantAdapter(@NonNull Context context, ArrayList<Restaurant> list) {
        this.context = context;
        restaurantsList = list;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(convertView == null){
            listItem = new View(context);
            listItem.setLayoutParams(new GridView.LayoutParams(100, 55));
            listItem.setPadding(8,8,8,8);
        }else{
            listItem = convertView;
        }

        Restaurant currentRestaurant = restaurantsList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.restaurant_image);
        image.setImageResource(currentRestaurant.getImage());

        TextView name = (TextView) listItem.findViewById(R.id.restaurant_name);
        name.setText(currentRestaurant.getName());
        listItem.setId(position);

        return listItem;
    }
}