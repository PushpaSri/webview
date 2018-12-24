package com.example.doddas.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
   EditText editText;
   WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.edit);
        webView=(WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
    }

    public void search(View view) {
      String url=editText.getText().toString();
       webView.loadUrl("HTTP://WWW."+url+".com" );
    }
}
