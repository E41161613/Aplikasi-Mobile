package com.example.sam_madura.servis;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;


public class ActivityServiceTuneUp extends AppCompatActivity {

    ListView lst;
    String[] nama = {"Pemeriksaan Fungsi Pengereman","Pemeriksaan Fungsi Roda","Pemeriksaan Oli","Pemeriksaan baud dan mur","Pembersihan Karbulator","Pemeriksaan dan pengisian air radiator","Pembersihan Busi"};
    Integer[] imgid={R.drawable.black1,R.drawable.black2,R.drawable.black3,R.drawable.black4,R.drawable.black5,R.drawable.black6,R.drawable.black7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_tune_up);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("SERVICE");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lst= (ListView) findViewById(R.id.listtuneup);
        Custom customListView= new Custom(this, nama,imgid);
        lst.setAdapter(customListView);

    }@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //tombolBack
        finish();
        return super.onOptionsItemSelected(item);
    }
}