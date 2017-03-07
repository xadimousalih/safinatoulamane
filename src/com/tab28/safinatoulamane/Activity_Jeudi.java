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
		dimancheTv.setText(Html.fromHtml("<h1>Journ�e Jeudi</h1>Un nomm� Akramata (Que DIEU l'agr��) rapporte que, d'apr�s Ibn (fils) Abass (Que DIEU l'agr��), le Proph�te Mouhammed (PSL) a dit:\n\nDurant la journ�e de Jeudi entre  la pri�re de Dohr (Tisbaar en wolof) et celle de Asr (Takoussaane en wolof), celui qui effectue  deux rakas (2R) dont:\n  - Premiier rakas: Souratoul Fatiha 1fois (Sourate 1) et Ayaatoul koursiy 100fois (le verset 255 de la Sourate 2):  - Deuxi�me rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 100fois (Sourate 112).\n  - Apr�s la salutation finale qu'il fasse 100fois Salatou ala Nabi (Pri�re sur le Proph�te Mouhammed (PSL).\nLe Bon DIEU lui donnera des bienfaits �quivalents � ceux d'une personne ayant je�n� les mois de Rajab, Chahbaane et Ramadane.\n Il aura aussi les bienfaits de celui qui aurait effectu� le Hadj (p�l�rinage � la Mecque).\n Il aura aussi de tr�s belles choses aupr�s de DIEU comme l'ensemble des croyants  ayant port�s leur confiance enti�re au Mis�ricordieu.<br><br><h1>Jeudi Nuit</h1>Cheikhouna Sanoussi affirme que:\n\n Jeudi nuit, entre la pri�re de Maghreb (Timiss en wolof) et celle de Isha (Gu�w� en wolof), celui qui effectue deux rakas (2R) dont chacune:\n Souratoul Fatiha 1fois (Sourate 1) et Souratou Zalzalah 15fois (Sourate 99): Le Bon DIEU l'�pargnera des horreurs de la tombe. <br>Diaabir Ibn (fils de) Abdallah (Que DIEU les agr�e) rapporte que le Proph�te Mouhammed (PSL) a dit:\n\nJeudi nuit, entre la pri�re de Maghreb (Timiss en wolof) et celle de Isha (Gu�w� en wolof), celui qui effectue douze rakas (12R) dont chacune:\n  Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 10fois (Sourate 112),\n sera consid�r� comme quelqu'un qui, pendant 12 ans se serait consacr� � DIEU en jeunant ses journ�es enti�res et en accomplissant des pri�res surr�rogatoires ses nuits enti�res.<br>Kassiir Ibn (fils de) Salamata (Que DIEU les agr��) rapporte que, d'apr�s Anass fils de Malick (Que DIEU l'agr��), le Proph�te Mouhammed (PSL) a dit:\n\nCelui qui, apr�s avoir effectu� la pri�re de Isha (Gu�w� en wolof) en communaut� et effectu� les deux rakas (2R) de pri�re surr�rogatoire qui s'en suivent, fait dix rakas (10R: 2R par 2R) dont chacune:\n  - Souratou Fatiha 1fois (Sourate 1), Souratou Likhlaass 1fois (Sourate 112), Souratoul Falaqi 1fois (Sourate 113) et Souratou Naassi 1fois (Sourate 114).\n  - Effectue les sunnas de Chafaa (2R) et celle de Witre(1R fermant tous les rakas).\n  - Se couche lat�ralement du c�t� droit en faisant face au 'Qibla' (Du c�t� de la Kaaba plus g�n�ralement du c�t� Est).\nCelui ci sera consid�r� comme quelqu'un qui aurait vivifi� la nuit de 'Laylatoul Qadr' par des Salates (pri�re), par l'invocation des Attributs Subl�mes de DIEU, par le r�cital du coran et toute sortes d'actes de d�votion.<br>Le Proph�te Mouhammed (PSL) a dit:\nMultipliez vos pri�res sur le Proph�te Mouhammed (PSL) durant Jeudi nuit et la journ�e du Vendredi."));
	}
}
