package com.example.fin

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream

public class MainActivity : AppCompatActivity() {
    public EmotionServiceClient emotionServiceClient = new EmotionServiceRestClient("f6000c4796b8401d9649ce6bb1324ce1");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Bitmap mBitmap = BitmapFactory.decodeResource(resources,R.drawable.smile)
        ImageView imageView = =(ImageView) findViewById(R.id.imageView)
        imageView.setImageBitmap(mBitmap)

        Button btnPRocess = (Button)findViewById(R.id.btnEmotion)

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        mbitmap.compress(Bitmap.CompressFormat.JPEG,100,outputstream)
        ByteArrayInputStream = new B


    }
}