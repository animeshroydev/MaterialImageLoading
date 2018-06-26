package developer.roy.animesh.materialimageloading;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.florent37.materialimageloading.MaterialImageLoading;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //TODAY in this video I will show to how to load material animated image using a nice github library, and picasso...

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.iv_image);

        populateImage();
    }

    private void populateImage() {
        Picasso.get().load("https://i.imgur.com/9gmxncN.jpg").into(imageView, new Callback.EmptyCallback(){
            @Override
            public void onSuccess(){
                MaterialImageLoading.animate(imageView).setDuration(5000).start();
            }
                }

        );
    }
}

//The app is woring fine in my physical device... :)

