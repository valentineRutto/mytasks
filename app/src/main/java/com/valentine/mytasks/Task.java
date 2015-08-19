package com.valentine.mytasks;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by valentine on 8/19/15.
 */
@ParseClassName("Tasks")
public class Task extends ParseObject{
    public Task(){
    }
    public boolean isCompleted(){
        return getBoolean("completed");
    }
    public void setCompleted(boolean complete){
        put("completed", complete);
    }
    public String getDescription(){
        return getString("description");
    }
    public void setDescription(String description){
        put("description", description);
    }


}
