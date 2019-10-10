package com.example.smartgarden;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.smartgarden.ui.main.SectionsPagerAdapter;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);

        viewPager.setAdapter(sectionsPagerAdapter);
        tabs.setupWithViewPager(viewPager);
        populateviewPager();
    }

    private void populateviewPager() {

        Objects.requireNonNull(tabs.getTabAt(0)).setIcon(R.drawable.home_icon);
        Objects.requireNonNull(tabs.getTabAt(1)).setIcon(R.drawable.settings_icon);
        Objects.requireNonNull(tabs.getTabAt(2)).setIcon(R.drawable.maintenance_icon);
    }
}