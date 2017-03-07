package com.tab28.safinatoulamane;

import com.tab28.safinatoulamane.R;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity_Jeudi extends DashBoardActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.activity_jeudi);
		setHeader(getString(R.string.jeudi), true, true);
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv.setText(Html.fromHtml("<h1>Journée Jeudi</h1>Un nommé Akramata (Que DIEU l'agréé) rapporte que, d'après Ibn (fils) Abass (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\nDurant la journée de Jeudi entre  la prière de Dohr (Tisbaar en wolof) et celle de Asr (Takoussaane en wolof), celui qui effectue  deux rakas (2R) dont:\n  - Premiier rakas: Souratoul Fatiha 1fois (Sourate 1) et Ayaatoul koursiy 100fois (le verset 255 de la Sourate 2):  - Deuxième rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 100fois (Sourate 112).\n  - Après la salutation finale qu'il fasse 100fois Salatou ala Nabi (Prière sur le Prophète Mouhammed (PSL).\nLe Bon DIEU lui donnera des bienfaits équivalents à ceux d'une personne ayant jeûné les mois de Rajab, Chahbaane et Ramadane.\n Il aura aussi les bienfaits de celui qui aurait effectué le Hadj (pélérinage à la Mecque).\n Il aura aussi de très belles choses auprès de DIEU comme l'ensemble des croyants  ayant portés leur confiance entière au Miséricordieu.<br><br><h1>Jeudi Nuit</h1>Cheikhouna Sanoussi affirme que:\n\n Jeudi nuit, entre la prière de Maghreb (Timiss en wolof) et celle de Isha (Guéwé en wolof), celui qui effectue deux rakas (2R) dont chacune:\n Souratoul Fatiha 1fois (Sourate 1) et Souratou Zalzalah 15fois (Sourate 99): Le Bon DIEU l'épargnera des horreurs de la tombe. <br>Diaabir Ibn (fils de) Abdallah (Que DIEU les agrée) rapporte que le Prophète Mouhammed (PSL) a dit:\n\nJeudi nuit, entre la prière de Maghreb (Timiss en wolof) et celle de Isha (Guéwé en wolof), celui qui effectue douze rakas (12R) dont chacune:\n  Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 10fois (Sourate 112),\n sera considéré comme quelqu'un qui, pendant 12 ans se serait consacré à DIEU en jeunant ses journées entières et en accomplissant des prières surrérogatoires ses nuits entières.<br>Kassiir Ibn (fils de) Salamata (Que DIEU les agréé) rapporte que, d'après Anass fils de Malick (Que DIEU l'agréé), le Prophète Mouhammed (PSL) a dit:\n\nCelui qui, après avoir effectué la prière de Isha (Guéwé en wolof) en communauté et effectué les deux rakas (2R) de prière surrérogatoire qui s'en suivent, fait dix rakas (10R: 2R par 2R) dont chacune:\n  - Souratou Fatiha 1fois (Sourate 1), Souratou Likhlaass 1fois (Sourate 112), Souratoul Falaqi 1fois (Sourate 113) et Souratou Naassi 1fois (Sourate 114).\n  - Effectue les sunnas de Chafaa (2R) et celle de Witre(1R fermant tous les rakas).\n  - Se couche latéralement du côté droit en faisant face au 'Qibla' (Du côté de la Kaaba plus généralement du côté Est).\nCelui ci sera considéré comme quelqu'un qui aurait vivifié la nuit de 'Laylatoul Qadr' par des Salates (prière), par l'invocation des Attributs Sublîmes de DIEU, par le récital du coran et toute sortes d'actes de dévotion.<br>Le Prophète Mouhammed (PSL) a dit:\nMultipliez vos prières sur le Prophète Mouhammed (PSL) durant Jeudi nuit et la journée du Vendredi."));
	}
}
