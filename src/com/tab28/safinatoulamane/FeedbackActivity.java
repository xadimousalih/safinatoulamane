package com.tab28.safinatoulamane;


import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class FeedbackActivity extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		setHeader(getString(R.string.FeedbackActivityTitle), true, false);
		
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv
				.setText(Html
						.fromHtml("Maintenant que vous avez �valuez cet application nous aimerions avoir vos nouvelles.<br>La satisfaction totale de nos fr�res musulmans en particuliers les disciples de <b>Cheikh Ahmadou Bamba KHADIMOU RASSOUL</b> est notre seule pr�occupation.<br>Nous demandons � toute personne en sa possession de prier pour Serigne Saliou Mback�.<br>Vous pouvez contacter l'�quipe TAB28 en envoyant vos remarques et contributions aux niveau des adresses emails suivantes:<br><font color=\"#FFFFFF\"><a href=\"mailto:xadimjaxate@gmail.com\">Sayful Xaddiim</a><br><a href=\"mailto:xadimousalih@gmail.com\">xadimouSALIH</a><br><a href=\"mailto:mbengue.m@gmail.com\">Mbengue</a></font><br><br><center><b>DIEUREDIEUFETY BOROM TOUBA<b></center>"));
		
		dimancheTv.setMovementMethod(LinkMovementMethod.getInstance());
	}
}
