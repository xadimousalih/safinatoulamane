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
						.fromHtml("<h1>Journée Lundi</h1> Abi Zoubaïry rapporte  que, d'après Diabir fils de Abdallah (Que l'agrément de DIEU soit sur eux), le Prophète Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue durant le jour montant (yoor yoor en wolof) du Lundi deux rakas dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois(le verset 255 de la Sourate 2): , "
								+ "Souratou Likhlaass 1fois (Sourate 112), Souratoul Falaqi 1fois (Sourate 113) et Souratou Naassi 1fois (Sourate 114). "
								+ "Après la salutation finale, récite:\n  -  10fois 'Astaghfiroulah' \n  - Prie 10fois sur le Prophète Mouhammed (PSL)\n "
								+ "Le Bon DIEU absoudra tous ses péchés. <br><br> Saabite Banaaniye (Que DIEU l'agréé) rapporte  que, d'après Anass fils de Malick (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue la journée du Lundi douze rakas (12R 2R par 2R) dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois (le verset 255 de la Sourate 2): S'il termine les dix rakas (12R) récite:\n"
								+ "  - Souratou Likhlaass 12fois (Sourate 112),\n  - Astaghfiroulah 12fois: Le jour du jugement dernier une voix céleste s'élèvera en disant: \"Où est X(celui ayant effectué cette prière) fils de Y; qu'il se lève pour prendre sa récompense\". "
								+ "Une créature celeste lui donnera en premier lieu 1000 parures.\nOn lui enfilera ensuite, un châpeau en or en lui disant entre au paradis.\n"
								+ "100 000 anges, chacun avec son cadeau, l'accueilliront et l'accompagneront jusqu'à ce qu'il accède à 1000 sublimes endroits dont leur clarté est eteincellante. <br><br>"
								+ "<h1>Lundi Nuit</h1>Le Prophète Mouhammed (PSL) a dit:\n\nCelui qui effectue Lundi nuit 12 rakas dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1) et 5fois Souratou nasri (Sourate 110): Au paradis, le Bon DIEU bâtira en sa faveur une chambre dont la longueur et la largeur sont sept(7) fois supérieures à celles du monde."));
	}
}
