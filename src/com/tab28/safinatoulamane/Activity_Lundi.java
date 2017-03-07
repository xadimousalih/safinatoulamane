package com.tab28.safinatoulamane;

import com.tab28.safinatoulamane.R;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity_Lundi extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lundi);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setHeader(getString(R.string.lundi), true, true);
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv
				.setText(Html
						.fromHtml("<h1>Journ�e Lundi</h1> Abi Zouba�ry rapporte  que, d'apr�s Diabir fils de Abdallah (Que l'agr�ment de DIEU soit sur eux), le Proph�te Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue durant le jour montant (yoor yoor en wolof) du Lundi deux rakas dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois(le verset 255 de la Sourate 2): , "
								+ "Souratou Likhlaass 1fois (Sourate 112), Souratoul Falaqi 1fois (Sourate 113) et Souratou Naassi 1fois (Sourate 114). "
								+ "Apr�s la salutation finale, r�cite:\n  -  10fois 'Astaghfiroulah' \n  - Prie 10fois sur le Proph�te Mouhammed (PSL)\n "
								+ "Le Bon DIEU absoudra tous ses p�ch�s. <br><br> Saabite Banaaniye (Que DIEU l'agr��) rapporte  que, d'apr�s Anass fils de Malick (Que DIEU l'agr��), le Proph�te Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue la journ�e du Lundi douze rakas (12R 2R par 2R) dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois (le verset 255 de la Sourate 2): S'il termine les dix rakas (12R) r�cite:\n"
								+ "  - Souratou Likhlaass 12fois (Sourate 112),\n  - Astaghfiroulah 12fois: Le jour du jugement dernier une voix c�leste s'�l�vera en disant: \"O� est X(celui ayant effectu� cette pri�re) fils de Y; qu'il se l�ve pour prendre sa r�compense\". "
								+ "Une cr�ature celeste lui donnera en premier lieu 1000 parures.\nOn lui enfilera ensuite, un ch�peau en or en lui disant entre au paradis.\n"
								+ "100 000 anges, chacun avec son cadeau, l'accueilliront et l'accompagneront jusqu'� ce qu'il acc�de � 1000 sublimes endroits dont leur clart� est eteincellante. <br><br>"
								+ "<h1>Lundi Nuit</h1>Le Proph�te Mouhammed (PSL) a dit:\n\nCelui qui effectue Lundi nuit 12 rakas dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1) et 5fois Souratou nasri (Sourate 110): Au paradis, le Bon DIEU b�tira en sa faveur une chambre dont la longueur et la largeur sont sept(7) fois sup�rieures � celles du monde."));
	}
}
