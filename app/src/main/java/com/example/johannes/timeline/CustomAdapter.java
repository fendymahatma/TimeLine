package com.example.johannes.timeline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.johannes.timeline.R.*;

class CustomAdapter extends ArrayAdapter<Profile> {

    int answerCharLong = 0;

    public CustomAdapter(Context context, ArrayList<Profile> profiles) {
        super(context, layout.custom_row, profiles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater customInflate = LayoutInflater.from(getContext());
        View customView = customInflate.inflate(R.layout.custom_row, parent, false);

        Profile selectedItem = getItem(position);
        ImageView image_profile_bg = (ImageView) customView.findViewById(id.image_profile_bg);
        ImageView image_profile_pp = (ImageView) customView.findViewById(id.image_profile_pp);
        TextView text_name = (TextView) customView.findViewById(id.text_name);
        TextView text_answer = (TextView) customView.findViewById(id.text_answer);
        Button long_one = (Button) customView.findViewById(id.long_one);
        Button long_two = (Button) customView.findViewById(id.long_two);
        Button long_three = (Button) customView.findViewById(id.long_three);
        Button long_four = (Button) customView.findViewById(id.long_four);
        Button answer1 = (Button) customView.findViewById(id.answerOne);
        Button answer2 = (Button) customView.findViewById(id.answerTwo);
        Button short_three = (Button) customView.findViewById(id.short_three);
        Button answer3 = (Button) customView.findViewById(id.answerThree);
        Button answer4 = (Button) customView.findViewById(id.answerFour);

        //18 paling panjang
        answerCharLong = selectedItem.answerOne.length() + selectedItem.answerTwo.length()
                            + selectedItem.answerThree.length() + selectedItem.answerFour.length();



        if(answerCharLong <= 1){
            image_profile_bg.setImageResource(selectedItem.resourceIdPost);
            image_profile_pp.setImageResource(selectedItem.resourceIdProfilePicture);
        }else{
        }

        return customView;
    }
}
