package com.stmikjayanusa.jayamobile;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LokasiFragment extends Fragment {
	
	public LokasiFragment(){}
	
	private WebView webView;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_lokasi, container, false);
        webView = (WebView) rootView.findViewById(R.id.lokasiMap);
        webView.setWebViewClient(new MyWebViewClient());

        String url = "https://www.google.com/maps/@-0.9434854,100.353932,20z";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

        return rootView;
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
