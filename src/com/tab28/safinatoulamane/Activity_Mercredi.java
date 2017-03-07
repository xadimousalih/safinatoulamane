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
						.fromHtml("<h1>Journée Mercredi</h1>Abi Idriissa Khawlaniyye (Que DIEU l'agréé) rapporte  que, d'après Mouaaze Ibn (fils de Jabale) (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\nDurant le jour montant (yoor yoor  en wolof) du Mercredi, celui qui effectue une prière de 12 rakas (12R) dont chacune: \n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois(le verset 255 de la Sourate 2):"
								+ "  , Souratoul Likhlaass 3fois (Sourate 112), Souratoul Falaqi 3fois (Sourate 113)"
								+ "  , Souratoul Nassi 3fois (Sourate 114).\nUn ange situé au niveau de Harach l'appellera en lui disant:\n\"Toi l'adorateur de DIEU: le Bon DIEU t'a pardonné tous tes péchés antérieurs, à moins que tu n'en fasses encore. \"\nLe Bon DIEU l'épargnera de l'étroitesse et la noirceur de la tombe. \n"
								+ "Le Bon DIEU l'épargnera des épreuves (difficultés) du jour du jugement dernier. \n"
								+ "Pour le Miséricordieu , cette oeuvre (ces rakas priés) effectuée sera élevée au rang de celles des prophètes.<br><br>"
								+ "<h1>Mercredi Nuit</h1>Abi Saalihine (Que DIEU l'agréé) rapporte que, d'après Abi Houreyrata (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\nMercredi nuit, entre la prière de Maghreb (Timiss en wolof) et celle de Isha (Guéwé en wolof), celui qui effectue deux rakas (2R) dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 5fois(le verset 255 de la Sourate 2):"
								+ "  , Souratou Likhlaass 5fois (Sourate 112), Souratoul Falaqi 5fois (Sourate 113) et Souratou Naassi 5fois (Sourate 114).\nAprès la salutation finale, récite:\n"
								+ "  -  15fois 'Astaghfiroulah':"
								+ "  -  Qu'il ait l'intention de donner les retombés (bénéfices) de cet acte à ses parents (père et mère).\n"
								+ "Il aura accompli alors, tout devoir envers ses parents; même s'il avait refuseé de respecter leur recommandations.\n"
								+ "Le Bon DIEU lui donnera les récompenses qu'il octroie aux véridiques et aux Sahaba martyres (Compagnons du Prophète (PSL) mort dans un des champs de batailles dont celui-ci a participé). "));
	}
}
