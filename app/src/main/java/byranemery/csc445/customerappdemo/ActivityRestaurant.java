package byranemery.csc445.customerappdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import byranemery.csc445.customerappdemo.nonActivity.Restaurant;
import byranemery.csc445.customerappdemo.nonActivity.RestaurantAdapter;

/**
 * Created by Siren10 on 18-Mar-18.
 */

public class ActivityRestaurant extends AppCompatActivity {

    private RestaurantAdapter restaurantArrayAdapter;
    private ArrayList<Restaurant> restaurants;
    private GridView restaurantGrid;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        restaurantGrid = findViewById(R.id.restaurant_grid);
        populateRestaurants();
        restaurantArrayAdapter = new RestaurantAdapter(this, restaurants);
        restaurantGrid.setAdapter(restaurantArrayAdapter);
    }

    public void populateRestaurants(){
        restaurants = new ArrayList();
        restaurants.add(new Restaurant("Burger King", R.drawable.ic_launcher_background));
        restaurants.add(new Restaurant("Mc Donalds", R.drawable.ic_launcher_background));
        restaurants.add(new Restaurant("Dairy Queen", R.drawable.ic_launcher_background));
        restaurants.add(new Restaurant("Five Guys", R.drawable.ic_launcher_background));
        restaurants.add(new Restaurant("54 Street", R.drawable.ic_launcher_background));
        restaurants.add(new Restaurant("Olive Garden", R.drawable.ic_launcher_background));
        restaurants.add(new Restaurant("Wendy's", R.drawable.ic_launcher_background));
    }
}
