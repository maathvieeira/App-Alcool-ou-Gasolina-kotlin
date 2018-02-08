package br.com.matheusvieira.appalcoolougasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnVerificar(view: View){

        val edtAlcool = edtAlcool.text.toString()
        val edtGasolina = edtGasolina.text.toString()

        if(edtAlcool.isEmpty() || edtGasolina.isEmpty()){
            txtResultado.setText("Preencha os Campos!")
        } else {
            calcularValores(edtAlcool, edtGasolina)
        }
    }

    fun calcularValores( edtAlcool: String, edtGasolina: String ){

        val valorAlcool = edtAlcool.toDouble()
        val valorGasolina = edtGasolina.toDouble()

        val resultado = valorAlcool / valorGasolina

        if( resultado > 0.7 ){
            txtResultado.setText("Melhor ultilizar Gasolina!")
        } else {
            txtResultado.setText("Melhor ultilizar Alcool!")
        }
    }
}
