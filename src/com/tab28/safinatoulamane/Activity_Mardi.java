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

public class Activity_Mardi extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mardi);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		setHeader(getString(R.string.mardi), true, true);
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv
				.setText(Html
						.fromHtml("<h1>Journée Mardi</h1>Yaziide Rouqaaciiye (Que DIEU l'agréé) rapporte  que, d'après Anass fils de Malick (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\n"
								+ "Mardi,durant la mi-journée ou durant le jour montant (yoor yoor  en wolof) du Mardi selon un autre hadith, celui qui effectue dix rakas (10R) dont chacune:\n"
								+ "  - Souratoul Fatiha 1fois (Sourate 1), Ayaatoul koursiy 1fois(le verset 255 de la Sourate 2):"
								+ "  - Souratou Likhlaass  3fois (Sourate 112)\nSes péchés ne seront pas comptés durant de 70 jours. \n"
								+ "S'il meurt dans ces 70 jours il sera considéré comme un Sahaba martyre(Compagnon du Prophète (PSL) mort dans un des champs de batailles du Prophète (PSL)). "
								+ "Le Bon DIEU lui pardonnera ses péchés commis pendant une durée de 70 ans.<br><br>"
								+ "<h1>Mardi Nuit</h1>"
								+ "Le Prophète Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue Mardi nuit 2 rakas:\n"
								+ "  - Premier Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratoul Falaqi 10fois (Sourate 113)\n"
								+ "  - Deuxième Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratoul Nassi 10fois (Sourate 114).\n"
								+ "Jusqu'au jour du jugement dernier, 70 000 anges descendront de chacun des cieux pour lui marquer des bienfaits."));
	}
}
