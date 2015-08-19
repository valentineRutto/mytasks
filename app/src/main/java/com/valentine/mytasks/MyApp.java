package com.valentine.mytasks;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

/**
 * Created by valentine on 8/19/15.
 */
public class MyApp {

    Parse.initialize(this, "bDrxYwWkcBY0kjqk8yh333FBXspyYUJDQIkvB7uf", "9Eh1b8QHjAczgfBHNcrzyy4sBXml6bocKd2TQ1W6");
    ParseAnalytics.trackAppOpened(getIntent());
    ParseObject.registerSubclass(Task.class);
}
