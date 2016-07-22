package kim.sungmin.androidstudy.activity;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import kim.sungmin.androidstudy.R;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

//
//public class ScrollingActivity extends AppCompatActivity {
//
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_scrolling);
////        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
////
//////        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//////        fab.setOnClickListener(new View.OnClickListener() {
//////            @Override
//////            public void onClick(View view) {
//////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//////                        .setAction("Action", null).show();
//////            }
//////        });
////    }
//    private CollapsingToolbarLayout collapsingToolbarLayout = null;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_scrolling);
//
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//
//        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        collapsingToolbarLayout.setTitle("scroll");
//
////        dynamicToolbarColor();
////        toolbarTextAppernce();
//    }
//
////    private void dynamicToolbarColor() {
////
////        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
////                R.drawable.profile_pic);
////        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
////
////            @Override
////            public void onGenerated(Palette palette) {
////                collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(R.attr.colorPrimary));        collapsingToolbarLayout.setStatusBarScrimColor(palette.getMutedColor(R.attr.colorPrimaryDark);
////            }
////        });
////    }
////
////    private void toolbarTextAppernce() {
////        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.collapsedappbar);
////        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.expandedappbar);
////    }
//
//}
