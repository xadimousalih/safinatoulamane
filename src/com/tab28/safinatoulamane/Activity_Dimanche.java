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
								+ "Al Ahmachi rapporte que, d'après Anas ibn Malick (Que DIEU l'agrée), le Prophète Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue une prière de quatre rakas (4R) Dimanche nuit:\n  "
								+ "- Première Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 10fois (Sourate 112).\n"
								+ "- Deuxième Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 20fois (Sourate 112).\n  "
								+ "- Troisième Rakas: Souratoul Fatiha  1fois (Sourate 1) et Likhlaass 30fois (Sourate 112).\n  "
								+ "- Quatrième Rakas: Souratoul Fatiha 1fois (Sourate 1) et Likhlaass 40fois (Sourate 112).\n  "
								+ "- Fait le dernier Tachahhoud (taaya bou moudj en wolof) et la salutation finale.\n  "
								+ "- Récite 75 fois Likhlaass (Sourate 112).\n  "
								+ "- Récite 75 fois pour soi et ses deux parents 'Astaghfiroulah':  "
								+ "- Prie  75 fois sur le Prophète(PSL).\n"
								+ "S'il formule sa prière, le Bon DIEU lui donnera ce qu'il voudra. "
								+ "<br><br>"
								+ "<h1>Journée de Dimanche</h1>"
								+ "Abi Amaamata rapporte que le Prophète Mouhammed (PSL) a dit:\n\n"
								+ "Celui qui effectue une prière de deux rakas (2R) Dimanche nuit:\n  "
								+ "- Chaque Rakas: Souratoul Fatiha 1fois (Sourate 1) et Souratou Likhlaass 15fois (Sourate 112).\n  "
								+ "- Après le salut final récite 15fois Ayaatoul koursiy (le verset 255 de la Sourate 2): et 15 fois 'Astaghfiroulah':\n "
								+ "Le Bon DIEU inscrira son nom parmi ceux qui iront au paradis même s'il faisait parti des gens de l'enfer.\n"
								+ "DIEU absoudra ses péchés apparents, et lui écrira pour chaque verset l'équivalent des dons du Hadj (pélérinage à la Mecque) et ceux de la Oumra (petit pélérinage).\n"
								+ "S'il meurt entre les deux Lundi durant lesquels il a effectué cette prière il sera considéré comme un Sahaba martyre(Compagnon du Prophète (PSL) mort dans un des champs de batailles dont celui-ci a participé)."
								+ "Abi Houreyrata (Que DIEU l&rsquo;agrée) affirme que le Prophète Mouhammed (PSL) a dit:\n\nCelui qui effectue une prière de quatre rakas (4R) durant la journée de Dimanche:\n  - Chaque Rakas: Souratoul Fatiha 1fois (Sourate 1) et Aamana Rassoul (Sourate 2 versets 285 à 286)\n Le Bon DIEU lui mentionnera des dons équivalant au nombre de chretiens (asraane you goor en wolof) ajouté du nombre de chretiennes (asraane you djiguène en wolof).\nIl aura un quote-part sur toutes les récompenses que le Bon DIEU accordera au Prophète Mouhammed (PSL).\nLe Bon DIEU lui mentionnera l'équivalent des dons du Hadj (pélérinage à la Mecque) et ceux de la Oumra (petit pélérinage).\nLe Bon DIEU lui mentionnera 1000 grades(échelons) pour chaque rakas effectuée.\nAu paradis, le Bon DIEU lui octroiera pour chaque lettre (haraf) prononcées dans ces rakas, des endroits paradisiaques où le musc embaumera.<br><br>Le Prophète Mouhammed (PSL) a dit d'après Alioune Ibn Abi Taalib (Que DIEU l'agrée):\n\nSoyez à la dévotion de DIEU en augmentant vos prières la journée du Dimanche. DIEU est Unique et n'a point de ressemblance.\nCelui qui effectue la journée du Dimanche après la prière obligatoire de Dohr (Tisbaar en wolof) et sa sunna,  quatre rakas (4R) dont:\n  - Premier rakas Souratoul Fatiha 1fois (Sourate 1) et Souratou Sadjda 1fois (Sourate 32)   - Deuxième rakas Souratoul Fatiha 1fois et Souratoul Moulki 1fois (Sourate 67): Fait le dernier Tachahhoud (taaya bou moudj en wolof) et la salutation finale pour les deux premiers rakas.   - Troisième rakas Souratoul Fatiha 1fois (Sourate 1) et Souratoul Joumouha 1fois(Sourate 62):   - Quatrième rakas Souratoul Fatiha 1fois (Sourate 1) et Souratoul Joumouha 1fois(Sourate 62): Celui qui effectue cette prière le Bon DIEU exhaussera ses prières et l'épargnera du Chirk (de ceux qui associent DIEU à quelque chose)."));
	}
}
