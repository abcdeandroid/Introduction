package com.abcdeandroid.introduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.rubengees.introduction.IntroductionBuilder;
import com.rubengees.introduction.entity.Slide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntroductionBuilder  introductionBuilder = new IntroductionBuilder (this);
        introductionBuilder.withSlides(generarSlides()).introduceMyself();
    }
    private List<Slide> generarSlides (){
        List <Slide> lista = new ArrayList<>();

        lista.add(new Slide().
                withTitle("Abc de Android").
                withDescription("Ejemplo de Descripcion").
                withColorResource(R.color.background_material_dark).
                withImage(R.mipmap.abcdeandroid));

        lista.add(new Slide().
                withTitle("Segunda pantalla").
                withDescription("Logo diseñador por Freepik").
                withColorResource(R.color.material_deep_teal_500).
                withImage(R.mipmap.freepik));

        return lista;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
