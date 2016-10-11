package ar.edu.unc.famaf.redditreader.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ar.edu.unc.famaf.redditreader.R;
import ar.edu.unc.famaf.redditreader.model.PostModel;
    /**
     * Created by male on 10/10/16.
     */

public class PostAdapter extends ArrayAdapter<PostModel> {

    private List<PostModel> mLstPostModel;
        int resource;
    public PostAdapter(Context context, int resource, List<PostModel> list) {
        super(context, resource);
        mLstPostModel = list;
    }

    @Override
    public int getCount() {
        return mLstPostModel.size();
    }

    @Override
    public PostModel getItem(int position) {
        return mLstPostModel.get(position);
    }

    @Override
    public int getPosition(PostModel item) {
        return mLstPostModel.indexOf(item);
    }

    static class ViewHolder {
        TextView title;
        TextView author;
        ImageView image;
        TextView comments;
        TextView date;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(resource,parent,false);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.ipsum);
            holder.comments = (TextView) convertView.findViewById(R.id.textView3);
            holder.author = (TextView) convertView.findViewById(R.id.textView4);
            holder.date = (TextView) convertView.findViewById(R.id.textView2);
            holder.image = (ImageView) convertView.findViewById(R.id.post_image);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        PostModel post = mLstPostModel.get(position);

        holder.title.setText(post.getmTitle());
        holder.comments.setText(post.getmNumComments());
        holder.author.setText(post.getmAuthor());
        holder.image.setBackgroundResource(R.mipmap.ic_launcher);
        holder.date.setText(post.getmDate().toString());
        return convertView;
    }

    @Override
    public boolean isEmpty() {
        return mLstPostModel.isEmpty();
    }
}

