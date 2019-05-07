package com.ammarptn.bottomnavbadge;

import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.widget.AppCompatTextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NotificationBadge {

    public static Badge getBadge(BottomNavigationView bottomNavView, int indexAt) {
        BottomNavigationMenuView bottomNavigationMenuView =
                (BottomNavigationMenuView) bottomNavView.getChildAt(0);
        if (bottomNavigationMenuView.getChildCount() > indexAt) {
            View v = bottomNavigationMenuView.getChildAt(indexAt);
            BottomNavigationItemView itemView = (BottomNavigationItemView) v;
            View badge = LayoutInflater.from(bottomNavigationMenuView.getContext()).inflate(R.layout.layout_bottom_badge, itemView, true);
            AppCompatTextView viewById = badge.findViewById(R.id.notifications_badge);
            return (Badge) viewById;
        } else {
            throw new IndexOutOfBoundsException(String.format("No menu item at %d", indexAt));
        }
    }
}
