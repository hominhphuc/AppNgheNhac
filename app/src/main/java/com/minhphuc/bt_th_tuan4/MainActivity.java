package com.minhphuc.bt_th_tuan4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    SeekBar mSeekBarTime, mSeekBarVol;
    static MediaPlayer sMediaPlayer;
    private Runnable mRunnable;
    int currentIndex = 0;
    RecyclerView rcv;
    CustomRecyclerView adt;
    List<Song> mSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv = findViewById(R.id.rcv);
        mSongs = new ArrayList<Song>();

        mSongs.add(new Song("Chạy ngay đi","Sơn tùng - MTP",R.drawable.rectangle4,R.raw.chay_ngay_di));
        mSongs.add(new Song("Lạc Trôi","Sơn tùng - MTP",R.drawable.rectangle2,R.raw.lac_troi));
        mSongs.add(new Song("Muộn rôi mà sao còn","Sơn tùng - MTP",R.drawable.rectangle3,R.raw.muon_roi_ma_sao_con));
        mSongs.add(new Song("Nơi này có anh","Sơn tùng - MTP",R.drawable.rectangle1,R.raw.noi_nay_co_anh));
        mSongs.add(new Song("Chúng ta của hiện tại","Sơn tùng - MTP",R.drawable.rectangle1,R.raw.chung_ta_cua_hien_tai));
        mSongs.add(new Song("Remember me","Sơn tùng - MTP",R.drawable.rectangle2,R.raw.remember_me));
        adt = new CustomRecyclerView(mSongs,this);
        rcv.setHasFixedSize(true);
        rcv.setAdapter(adt);
        rcv.setLayoutManager(new GridLayoutManager(this,2));
    }

    @Override
    public void clickItem(Song song) {
        Intent intent  = new Intent(MainActivity.this,PlaySong.class);
        intent.putExtra("song",song);
        intent.putExtra("listMusic", (Serializable) mSongs);
        intent.putExtra("index",mSongs.indexOf(song));
        startActivity(intent);

    }
}