package com.example.macwojs.musicalstructureapp;

        import android.app.Activity;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music>{

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param musics A List of AndroidFlavor objects to display in a list
     */
    public MusicAdapter(Activity context, ArrayList<Music> musics) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, musics);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, true);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        titleTextView.setText(currentMusic.getmTitle());


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        artistTextView.setText(currentMusic.getmArtist());

        // Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView coverImageView = (ImageView) listItemView.findViewById(R.id.cover_image_view);
        // Get the version name from the current AndroidFlavor object and
        // set this src on the src ImageView
        coverImageView.setImageResource(currentMusic.getmSrc());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
