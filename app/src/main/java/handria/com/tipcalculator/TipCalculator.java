package handria.com.tipcalculator;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TipCalculator extends AppCompatActivity {

    private double total;
    private double tip;
    private TextInputEditText totalInput;
    private TextInputEditText tipInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        totalInput = (TextInputEditText) findViewById(R.id.total_amount);
        tipInput = (TextInputEditText) findViewById(R.id.tip_amount);
    }

    public void calculateEverything(View view) {
        TextView totalView = (TextView) findViewById(R.id.total_display);
        TextView tipView = (TextView) findViewById(R.id.tip_display);
        try {
            total = Double.parseDouble(totalInput.getText().toString());
            tip = Double.parseDouble(tipInput.getText().toString());
            double tip_amount = total*(tip/100);
            double total_amount = total+tip_amount;
            totalView.setText("Total: $"+total_amount);
            tipView.setText("Tip: $"+tip_amount);
        }catch(Exception e){
            totalView.setText("Total: Error Input Invalid");
            tipView.setText("Tip: Error Input Invalid");
        }

    }
}
