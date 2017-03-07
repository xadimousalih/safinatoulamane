package com.tab28.safinatoulamane;

/**
 * @author Paresh N. Mayani
 * http://www.technotalkative.com
 */
import com.tab28.safinatoulamane.R;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity_Samedi extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_samedi);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		setHeader(getString(R.string.samedi), true, true);
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv
				.setText(Html
						.fromHtml("<h1>Samedi Nuit</h1>Le Prophète Mouhammed (PSL) a dit:\n\nSamedi nuit, celui qui effectue une prière de vingt rakas (deux par deux) (20R 2R par 2R) dont chacune:\n  - Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 50fois (Sourate 112), Souratoul Falaqi 1fois (Sourate 113) et Souratoul Nassi 1fois (Sourate 114),\n  - Après la fin des douzes rakas (12R) récite 100fois 'Astaghfiroulah':  - Prie sur le Prophète Mouhammed (PSL) 100fois\n  - Récite 1fois 'Laa hawla walaa qouwwata illa billahi al haliyyil hazim. Ach hadou an laa ilaaha illa lah wa ach hadou anna Adama safwatoul laahi wa fite ratouhou, wa ibraahiima khaliiloul laahi hazza wa djalla, wa moussaa kaliimoul laahi tahalaa wa insaa rouhoul laahi soubhaanahou wa mouhamadoune habiiboul laahi hazza wa djalla': Celui qui effectue cette prière aura l'équivalent des bienfaits de tous ceux qui disent que DIEU a un fils et l'équivalent des bienfaits de tous ceux qui attestent que DIEU n'a pas de fils.\n Le Bon DIEU lui fera venir le jour du jugement dernier, accompagné de ceux qui ont la confince de DIEU. Ce sera alors normal pour le Miséricordieu de lui faire entrer au paradis avec ceux là qui ont la confince de DIEU.<br><br><h1>Journée Samedi</h1>Sahiid (Que DIEU l'agréé) rapporte que, d'après Abi houreyrata (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\nCelui qui effectue la journée du Samedi quatre rakas (4R) dont chacune:\n   - Souratoul Fatiha 1fois (Sourate 1) et Souratou Kaafiroune 3fois (Sourate 109),\n  - Après la prière récite 1fois Ayaatoul koursiy 1fois (le verset 255 de la Sourate 2)\n\nLe Bon DIEU lui écrira pour chaque lettre récité les bienfaits du Hadj (pélérinage à la Mecque) et ceux de la Oumra (petit pélérinage).\nLe Bon DIEU lui écrira pour chaque lettre récité les dons de quelqu'un qui, durant 1an, aurait jeûné ses journées entières et effectué des prières surrérogatoires ses nuits entières.\nLe Bon DIEU lui écrira pour chaque lettre récité les dons d'un Sahaba martyre (Compagnon du Prophète (PSL) mort dans un des champs de batailles dont celui-ci a participé).\nIl aura le privilège de sièger sous Harache avec les Prophètes et les Sahaba martyres (Compagnons du Prophète (PSL) morts dans une des champs de batailles dont celui-ci a participé)."));
	}
}
