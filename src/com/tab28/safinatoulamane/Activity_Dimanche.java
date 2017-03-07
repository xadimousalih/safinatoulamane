package com.tab28.safinatoulamane;

import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;

public class Activity_Dimanche extends DashBoardActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.activity_dimanche);
		setHeader(getString(R.string.dimanche), true, true);
		TextView dimancheTv = (TextView) findViewById(R.id.textView1);
		dimancheTv
				.setText(Html
						.fromHtml("<h1>Dimanche Nuit</h1>"
								+ "Al Ahmachi rapporte que, d'apr�s Anas ibn Malick (Que DIEU l'agr�e), le Proph�te Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue une pri�re de quatre rakas (4R) Dimanche nuit:\n  "
								+ "- Premi�re Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 10fois (Sourate 112).\n"
								+ "- Deuxi�me Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 20fois (Sourate 112).\n  "
								+ "- Troisi�me Rakas: Souratoul Fatiha  1fois (Sourate 1) et Likhlaass 30fois (Sourate 112).\n  "
								+ "- Quatri�me Rakas: Souratoul Fatiha 1fois (Sourate 1) et Likhlaass 40fois (Sourate 112).\n  "
								+ "- Fait le dernier Tachahhoud (taaya bou moudj en wolof) et la salutation finale.\n  "
								+ "- R�cite 75 fois Likhlaass (Sourate 112).\n  "
								+ "- R�cite 75 fois pour soi et ses deux parents 'Astaghfiroulah':  "
								+ "- Prie  75 fois sur le Proph�te(PSL).\n"
								+ "S'il formule sa pri�re, le Bon DIEU lui donnera ce qu'il voudra. "
								+ "<br><br>"
								+ "<h1>Journ�e de Dimanche</h1>"
								+ "Abi Amaamata rapporte que le Proph�te Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue une pri�re de deux rakas (2R) Dimanche nuit:\n  "
								+ "- Chaque Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 15fois (Sourate 112).\n  "
								+ "- Apr�s le salut final r�cite 15fois Ayaatoul koursiy (le verset 255 de la Sourate 2): et 15 fois 'Astaghfiroulah':\n "
								+ "Le Bon DIEU inscrira son nom parmi ceux qui iront au paradis m�me s'il faisait parti des gens de l'enfer.\n"
								+ "DIEU absoudra ses p�ch�s apparents, et lui �crira pour chaque verset l'�quivalent des dons du Hadj (p�l�rinage � la Mecque) et ceux de la Oumra (petit p�l�rinage).\n"
								+ "S'il meurt entre les deux Lundi durant lesquels il a effectu� cette pri�re il sera consid�r� comme un Sahaba martyre(Compagnon du Proph�te (PSL) mort dans un des champs de batailles dont celui-ci a particip�)."
								+ "Abi Houreyrata (Que DIEU l&rsquo;agr�e) affirme que le Proph�te Mouhammed (PSL) a dit:\n\nCelui qui effectue une pri�re de quatre rakas (4R) durant la journ�e de Dimanche:\n  - Chaque Rakas: Souratoul Fatiha 1fois (Sourate 1) et Aamana Rassoul (Sourate 2 versets 285 � 286)\n Le Bon DIEU lui mentionnera des dons �quivalant au nombre de chretiens (asraane you goor en wolof) ajout� du nombre de chretiennes (asraane you djigu�ne en wolof).\nIl aura un quote-part sur toutes les r�compenses que le Bon DIEU accordera au Proph�te Mouhammed (PSL).\nLe Bon DIEU lui mentionnera l'�quivalent des dons du Hadj (p�l�rinage � la Mecque) et ceux de la Oumra (petit p�l�rinage).\nLe Bon DIEU lui mentionnera 1000 grades(�chelons) pour chaque rakas effectu�e.\nAu paradis, le Bon DIEU lui octroiera pour chaque lettre (haraf) prononc�es dans ces rakas, des endroits paradisiaques o� le musc embaumera.<br><br>Le Proph�te Mouhammed (PSL) a dit d'apr�s Alioune Ibn Abi Taalib (Que DIEU l'agr�e):\n\nSoyez � la d�votion de DIEU en augmentant vos pri�res la journ�e du Dimanche. DIEU est Unique et n'a point de ressemblance.\nCelui qui effectue la journ�e du Dimanche apr�s la pri�re obligatoire de Dohr (Tisbaar en wolof) et sa sunna,  quatre rakas (4R) dont:\n  - Premier rakas Souratoul Fatiha 1fois (Sourate 1) et Souratou Sadjda 1fois (Sourate 32)   - Deuxi�me rakas Souratoul Fatiha 1fois et Souratoul Moulki 1fois (Sourate 67): Fait le dernier Tachahhoud (taaya bou moudj en wolof) et la salutation finale pour les deux premiers rakas.   - Troisi�me rakas Souratoul Fatiha 1fois (Sourate 1) et Souratoul Joumouha 1fois(Sourate 62):   - Quatri�me rakas Souratoul Fatiha 1fois (Sourate 1) et Souratoul Joumouha 1fois(Sourate 62): Celui qui effectue cette pri�re le Bon DIEU exhaussera ses pri�res et l'�pargnera du Chirk (de ceux qui associent DIEU � quelque chose)."));
	}
}
