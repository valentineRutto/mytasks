package com.valentine.mytasks;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by valentine on 8/20/15.
 */
public class TaskAdapter extends ArrayAdapter<Task> {

    public TaskAdapter(Context context, int resource) {
        super(context, resource);
    }
}
