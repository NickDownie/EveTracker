package com.example.evetracker;



import android.net.Uri;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		String[] ships={"Eve Website", "Eve Wiki", "Punisher", "Coercer", "Omen", "Bestower", "Legion", "Harbinger", "Abaddon", "Avatar"};
		setListAdapter(new ArrayAdapter <String>(this, 
        		R.layout.activity_main, R.id.tvSpace, ships));
	}
	
	 protected void onListItemClick(ListView l, View v, int position, long id){
	    	switch(position)
	    	{
	    	case 0: startActivity(new Intent(Intent.ACTION_VIEW,
	    			Uri.parse("http://www.eveonline.com/")));
	    			break;
	    	case 1: startActivity(new Intent(Intent.ACTION_VIEW,
	    			Uri.parse("https://wiki.eveonline.com/en/wiki/Main_Page")));
	    			break;
	    	case 2: startActivity(new Intent(MainActivity.this, punisher.class));
	    			break;
	    	case 3: startActivity(new Intent(MainActivity.this, coercer.class));
					break;
			case 4: startActivity(new Intent(MainActivity.this, omen.class));
					break;
			case 5: startActivity(new Intent(MainActivity.this, bestower.class));
					break;
			case 6: startActivity(new Intent(MainActivity.this, legion.class));
					break;
			case 7: startActivity(new Intent(MainActivity.this, harbinger.class));
					break;
			case 8: startActivity(new Intent(MainActivity.this, abaddon.class));
					break;
			case 9: startActivity(new Intent(MainActivity.this, avatar.class));
					break;
	    	}
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
