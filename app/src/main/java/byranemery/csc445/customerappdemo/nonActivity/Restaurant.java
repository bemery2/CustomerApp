package byranemery.csc445.customerappdemo.nonActivity;

/**
 * Created by Siren10 on 18-Mar-18.
 */

public class Restaurant {
    private String name;
    private int image;

    public Restaurant(String name, int image){
        this.name = name;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public int getImage(){
        return image;
    }
}
