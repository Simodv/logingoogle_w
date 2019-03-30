package com.powerdev.wasta1;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by yasser on 3/10/2019.
 */

public class ChildServiceViewHolder extends ChildViewHolder {
    private TextView mTextView;

    public ChildServiceViewHolder(View itemView) {
        super(itemView);
        mTextView=itemView.findViewById(R.id.textView_child);
    }
    public void bind(ChildServiceModel childServiceModel){

        mTextView.setText(childServiceModel.name);
    }
}
