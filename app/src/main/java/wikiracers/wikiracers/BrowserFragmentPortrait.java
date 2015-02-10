package wikiracers.wikiracers;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ethan on 2/10/2015.
 */
public class BrowserFragmentPortrait extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.browser_portrait_fragment, container,
                false);



    }
}


