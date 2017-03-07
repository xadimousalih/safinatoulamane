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

public class Activity_Mercredi extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_mercredi);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		setHeader(getString(R.string.mercredi), true, true);
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv
				.setText(Html
						.fromHtml("<h1>Journ�e Mercredi</h1>Abi Idriissa Khawlaniyye (Que DIEU l'agr��) rapporte  que, d'apr�s Mouaaze Ibn (fils de Jabale) (Que DIEU l'agr��), le Proph�te Mouhammed (PSL) a dit:\n\nDurant le jour montant (yoor yoor  en wolof) du Mercredi, celui qui effectue une pri�re de 12 rakas (12R) dont chacune: \n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois(le verset 255 de la Sourate 2):"
								+ "  , Souratoul Likhlaass 3fois (Sourate 112), Souratoul Falaqi 3fois (Sourate 113)"
								+ "  , Souratoul Nassi 3fois (Sourate 114).\nUn ange situ� au niveau de Harach l'appellera en lui disant:\n\"Toi l'adorateur de DIEU: le Bon DIEU t'a pardonn� tous tes p�ch�s ant�rieurs, � moins que tu n'en fasses encore. \"\nLe Bon DIEU l'�pargnera de l'�troitesse et la noirceur de la tombe. \n"
								+ "Le Bon DIEU l'�pargnera des �preuves (difficult�s) du jour du jugement dernier. \n"
								+ "Pour le Mis�ricordieu , cette oeuvre (ces rakas pri�s) effectu�e sera �lev�e au rang de celles des proph�tes.<br><br>"
								+ "<h1>Mercredi Nuit</h1>Abi Saalihine (Que DIEU l'agr��) rapporte que, d'apr�s Abi Houreyrata (Que DIEU l'agr��), le Proph�te Mouhammed (PSL) a dit:\n\nMercredi nuit, entre la pri�re de Maghreb (Timiss en wolof) et celle de Isha (Gu�w� en wolof), celui qui effectue deux rakas (2R) dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 5fois(le verset 255 de la Sourate 2):"
								+ "  , Souratou Likhlaass 5fois (Sourate 112), Souratoul Falaqi 5fois (Sourate 113) et Souratou Naassi 5fois (Sourate 114).\nApr�s la salutation finale, r�cite:\n"
								+ "  -  15fois 'Astaghfiroulah':"
								+ "  -  Qu'il ait l'intention de donner les retomb�s (b�n�fices) de cet acte � ses parents (p�re et m�re).\n"
								+ "Il aura accompli alors, tout devoir envers ses parents; m�me s'il avait refuse� de respecter leur recommandations.\n"
								+ "Le Bon DIEU lui donnera les r�compenses qu'il octroie aux v�ridiques et aux Sahaba martyres (Compagnons du Proph�te (PSL) mort dans un des champs de batailles dont celui-ci a particip�). "));
	}
}
