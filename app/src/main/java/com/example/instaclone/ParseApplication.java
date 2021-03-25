package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

       // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("f54XfiCYADuF3ipdwq0PWuyVt5xQhoUiSCfZTrUM")
                .clientKey("izqVe2U171QBbmhSlPF1b8lphBvcOXBA76k36UrB")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }

}
