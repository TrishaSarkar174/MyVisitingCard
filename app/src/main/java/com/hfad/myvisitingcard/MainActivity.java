package com.hfad.myvisitingcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView contact = findViewById(R.id.ContactIcon);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(Intent.ACTION_DIAL);
                contactIntent.setData(Uri.parse("tel: +88 01614434451"));
                startActivity(contactIntent);
            }
        });

        ImageView mail = findViewById(R.id.MailIcon);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
                mailIntent.setData(Uri.parse("mailto: jucse29.359@gmail.com"));
                mailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject Here");
                startActivity(Intent.createChooser(mailIntent,"send Mail"));
            }
        });

        ImageView website = findViewById(R.id.WebsiteIcon);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW);
                websiteIntent.setData(Uri.parse("https://trishasarkar174.github.io/portfolio/"));
                startActivity(websiteIntent);
            }
        });

        ImageView location = findViewById(R.id.LocationIcon);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent locationIntent = new Intent(Intent.ACTION_VIEW);
                locationIntent.setData(Uri.parse("geo:0,0?q=Savar, Jahangirnagar University"));
                startActivity(locationIntent);

            }
        });

        ImageView facebook = findViewById(R.id.facebookIcon);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/oindrilla.sarkar.54"));
                startActivity(facebookIntent);
            }
        });

        ImageView whatsapp = findViewById(R.id.WhatsappIcon);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatsappIntent = new Intent(Intent.ACTION_VIEW);
                whatsappIntent.setData(Uri.parse("https://api.whatsapp.com/send?phone="+"+88 01614434451"));
                startActivity(whatsappIntent);
            }
        });

        ImageView linkedIn = findViewById(R.id.LinkedInIcon);
        linkedIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkedIntent = new Intent(Intent.ACTION_VIEW);
                linkedIntent.setData(Uri.parse("https://www.linkedin.com/in/trisha-sarkar-76ab9b285/"));
                startActivity(linkedIntent);
            }
        });

        ImageView git = findViewById(R.id.GitIcon);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GitIntent = new Intent(Intent.ACTION_VIEW);
                GitIntent.setData(Uri.parse("https://github.com/"));
                startActivity(GitIntent);
            }
        });


    }
}