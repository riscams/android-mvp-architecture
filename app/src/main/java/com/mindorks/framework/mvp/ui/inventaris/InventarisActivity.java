package com.mindorks.framework.mvp.ui.inventaris;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.mindorks.framework.mvp.R;
import com.mindorks.framework.mvp.ui.main.MainActivity;

import butterknife.OnClick;

public class InventarisActivity extends AppCompatActivity {

  private Spinner spinner1, spinner2, spinner3;
  private Button btn_save;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_inventaris);
  }

  public static Intent getStartIntent(Context context) {
      Intent intent = new Intent(context,InventarisActivity.class);
      return intent;
  }


}
