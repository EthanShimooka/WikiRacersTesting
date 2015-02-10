package wikiracers.wikiracers;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Ethan on 2/10/2015.
 */
public class WikiRacerMain extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Configuration configInfo = getResources().getConfiguration();



        MenuFragmentPortrait menuFragmentPortrait= new MenuFragmentPortrait();
        fragmentTransaction.replace(android.R.id.content, menuFragmentPortrait);



    /*
        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){
            BrowserFragmentLandscape browserFragmentLandscape = new BrowserFragmentLandscape();
            fragmentTransaction.replace(android.R.id.content, browserFragmentLandscape);
        }else{

            BrowserFragmentPortrait browserFragmentPortrait= new BrowserFragmentPortrait();
            fragmentTransaction.replace(android.R.id.content, browserFragmentPortrait);
        }
*/
        fragmentTransaction.commit();



    }



}
