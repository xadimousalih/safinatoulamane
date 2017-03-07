//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.app.AlertDialog.Builder;
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class ContactUSActivity extends Activity {
//	private HttpURLConnection conn;
//
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.contactus);
//
//		final EditText nameText = (EditText) findViewById(R.id.contactnametextContectUS);
//		final EditText emailText = (EditText) findViewById(R.id.emailaddresstextContectUS);
//		final EditText commentText = (EditText) findViewById(R.id.commenttextContectUS);
//
//		Button submitBtn = (Button) findViewById(R.id.ButtonLoginContectUS);
//
//		submitBtn.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				if (GUIStatiMethods.connectionCheck(ContactUSActivity.this)) {
//					String name = nameText.getText().toString();
//					String email = emailText.getText().toString();
//					String comment = commentText.getText().toString();
//					Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");
//					Matcher matcher = pattern.matcher(email);
//					boolean matchFound = matcher.matches();
//					if (name.equalsIgnoreCase("")) {
//						GUIStatiMethods.showMessageDialog(
//								ContactUSActivity.this, "Please enter name");
//					} else if (name.length() > 20) {
//						GUIStatiMethods.showMessageDialog(
//								ContactUSActivity.this,
//								"Name should be less then 20 character");
//					} else if (email.equalsIgnoreCase("")) {
//						GUIStatiMethods.showMessageDialog(
//								ContactUSActivity.this, "Please enter email");
//					} else if (!(matchFound)) {
//						GUIStatiMethods.showMessageDialog(
//								ContactUSActivity.this,
//								"Invalid email address.");
//					} else if (comment.equalsIgnoreCase("")) {
//						GUIStatiMethods.showMessageDialog(
//								ContactUSActivity.this, "Please enter comment");
//					} else {
//						try {
//							URL url = new URL(UrlStatics.BASEURL_MAIN_SERVER
//									+ "IGA_ADD_CONTACTUS&contactName=" + name
//									+ "&email=" + email + "&comments="
//									+ comment);
//							conn = (HttpURLConnection) url.openConnection();
//							conn.setDoInput(true);
//							conn.setDoOutput(true);
//							conn.setRequestMethod("POST");
//							conn.setRequestProperty("Connection", "Keep-Alive");
//							OutputStreamWriter out = new OutputStreamWriter(
//									conn.getOutputStream());
//							out.write("Content-Disposition: post-data;&contactName="
//									+ name
//									+ "&email="
//									+ email
//									+ "&comments="
//									+ comment);
//							out.close();
//							BufferedReader rd = new BufferedReader(
//									new InputStreamReader(conn.getInputStream()));
//							String decodedString;
//							while ((decodedString = rd.readLine()) != null) {
//								Log.v("TAG", "Contact is Added" + decodedString);
//							}
//							AlertDialog.Builder dialog = new Builder(
//									ContactUSActivity.this);
//							dialog.setTitle("Thank You!!");
//							dialog.setMessage("We will contact you shortly");
//							dialog.setCancelable(false);
//							dialog.setPositiveButton("Ok",
//									new DialogInterface.OnClickListener() {
//										public void onClick(
//												DialogInterface dialog,
//												int which) {
//											nameText.setText("");
//											emailText.setText("");
//											commentText.setText("");
//											finish();
//										}
//									});
//							dialog.show();
//							rd.close();
//
//						} catch (MalformedURLException e) {
//							e.printStackTrace();
//						} catch (ProtocolException e) {
//							e.printStackTrace();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			}
//
//		});
//	}
//}