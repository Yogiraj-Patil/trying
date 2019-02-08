package in.codecore.yogiraj.trynewdrawerlayout.attendence;

import android.widget.TextView;

public class Month_date_item {

    private TextView text_date;
    private TextView text_data;

    public Month_date_item(TextView text_date, TextView date_data) {
        this.text_date = text_date;
        this.text_data = date_data;
    }

    public TextView getText_date() {
        return text_date;
    }

    public TextView getDate_data() {
        return text_data;
    }
}
