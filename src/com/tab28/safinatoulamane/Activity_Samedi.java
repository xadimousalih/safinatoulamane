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
						.fromHtml("<h1>Samedi Nuit</h1>Le Proph�te Mouhammed (PSL) a dit:\n\nSamedi nuit, celui qui effectue une pri�re de vingt rakas (deux par deux) (20R 2R par 2R) dont chacune:\n  - Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 50fois (Sourate 112), Souratoul Falaqi 1fois (Sourate 113) et Souratoul Nassi 1fois (Sourate 114),\n  - Apr�s la fin des douzes rakas (12R) r�cite 100fois 'Astaghfiroulah':  - Prie sur le Proph�te Mouhammed (PSL) 100fois\n  - R�cite 1fois 'Laa hawla walaa qouwwata illa billahi al haliyyil hazim. Ach hadou an laa ilaaha illa lah wa ach hadou anna Adama safwatoul laahi wa fite ratouhou, wa ibraahiima khaliiloul laahi hazza wa djalla, wa moussaa kaliimoul laahi tahalaa wa insaa rouhoul laahi soubhaanahou wa mouhamadoune habiiboul laahi hazza wa djalla': Celui qui effectue cette pri�re aura l'�quivalent des bienfaits de tous ceux qui disent que DIEU a un fils et l'�quivalent des bienfaits de tous ceux qui attestent que DIEU n'a pas de fils.\n Le Bon DIEU lui fera venir le jour du jugement dernier, accompagn� de ceux qui ont la confince de DIEU. Ce sera alors normal pour le Mis�ricordieu de lui faire entrer au paradis avec ceux l� qui ont la confince de DIEU.<br><br><h1>Journ�e Samedi</h1>Sahiid (Que DIEU l'agr��) rapporte que, d'apr�s Abi houreyrata (Que DIEU l'agr��), le Proph�te Mouhammed (PSL) a dit:\n\nCelui qui effectue la journ�e du Samedi quatre rakas (4R) dont chacune:\n   - Souratoul Fatiha 1fois (Sourate 1) et Souratou Kaafiroune 3fois (Sourate 109),\n  - Apr�s la pri�re r�cite 1fois Ayaatoul koursiy 1fois (le verset 255 de la Sourate 2)\n\nLe Bon DIEU lui �crira pour chaque lettre r�cit� les bienfaits du Hadj (p�l�rinage � la Mecque) et ceux de la Oumra (petit p�l�rinage).\nLe Bon DIEU lui �crira pour chaque lettre r�cit� les dons de quelqu'un qui, durant 1an, aurait je�n� ses journ�es enti�res et effectu� des pri�res surr�rogatoires ses nuits enti�res.\nLe Bon DIEU lui �crira pour chaque lettre r�cit� les dons d'un Sahaba martyre (Compagnon du Proph�te (PSL) mort dans un des champs de batailles dont celui-ci a particip�).\nIl aura le privil�ge de si�ger sous Harache avec les Proph�tes et les Sahaba martyres (Compagnons du Proph�te (PSL) morts dans une des champs de batailles dont celui-ci a particip�)."));
	}
}
