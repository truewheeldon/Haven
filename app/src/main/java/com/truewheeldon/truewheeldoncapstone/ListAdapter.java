package com.truewheeldon.truewheeldoncapstone;

/**
 * Created by True Wheeldon 5/8/2017.
 */
        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;

    public ListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.contentlist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        //use the contentlist xml file to change the layout of the cells
        LayoutInflater inflater=context.getLayoutInflater();
        View myView=inflater.inflate(R.layout.contentlist, null,true);

        //find the text/image views inside the cells
        TextView txtTitle = (TextView) myView.findViewById(R.id.item);
        ImageView imageView = (ImageView) myView.findViewById(R.id.icon);

        //place the correct elements inside each cell
        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return myView;

    };
}