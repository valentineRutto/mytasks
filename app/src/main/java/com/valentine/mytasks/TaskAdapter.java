package com.valentine.mytasks;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by valentine on 8/20/15.
 */
public class TaskAdapter extends ArrayAdapter<Task> {
    private Context mContext;
    private List<Task> mTasks;

    public TaskAdapter(Context context, int resource) {
        super(context, R.layout.task_row_item, objects);
        this.mContext = context;
        this.mTasks = objects;

    }
}
