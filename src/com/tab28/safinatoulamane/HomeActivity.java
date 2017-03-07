package com.tab28.safinatoulamane;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setHeader(getString(R.string.HomeActivityTitle), false, true);
		AlertDialog alertDialog1 = new AlertDialog.Builder(
                this).create();
        // Setting Dialog Title
		alertDialog1.setTitle("ASSALAMOUHALEYKOUM!");
        // Setting Dialog Message
        alertDialog1.setMessage(Html.fromHtml("<center>NOTRE CREDO: Oeuvrer pour Cheikh Ahmadou Bamba Khadimou Rassoul. <br/>Nous demandons à toute personne utilisant ce logiciel de prier pour SERIGNE SALIOU MBACKE</center>"));
        // Setting Icon to Dialog
        alertDialog1.setIcon(R.drawable.ss);
        // Setting OK Button
        alertDialog1.setButton("OK!", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                 //Write your code here to execute after dialog closed
                Toast.makeText(getApplicationContext(),
                        "DIEUREDIEUF!", Toast.LENGTH_SHORT).show();
            }
        });

        // Showing Alert Message
        alertDialog1.show();

	}

	/**
	 * Button click handler on Main activity
	 * 
	 * @param v
	 */
	public void onButtonClicker(View v) {
		Intent intent;

		switch (v.getId()) {
		case R.id.main_btn_dimanche:
			intent = new Intent(this, Activity_Dimanche.class);
			startActivity(intent);
			break;

		case R.id.main_btn_lundi:
			intent = new Intent(this, Activity_Lundi.class);
			startActivity(intent);
			break;

		case R.id.main_btn_mardi:
			intent = new Intent(this, Activity_Mardi.class);
			startActivity(intent);
			break;

		case R.id.main_btn_mercredi:
			intent = new Intent(this, Activity_Mercredi.class);
			startActivity(intent);
			break;

		case R.id.main_btn_jeudi:
			intent = new Intent(this, Activity_Jeudi.class);
			startActivity(intent);
			break;

		case R.id.main_btn_vendredi:
			intent = new Intent(this, Activity_Vendredi.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_samedi:
			intent = new Intent(this, Activity_Samedi.class);
			startActivity(intent);
			break;
			
		default:
			break;
		}
	}
}
