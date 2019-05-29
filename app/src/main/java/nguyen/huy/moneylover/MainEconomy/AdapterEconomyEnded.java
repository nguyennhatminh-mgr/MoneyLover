package nguyen.huy.moneylover.MainEconomy;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import nguyen.huy.moneylover.MainActivity;
import nguyen.huy.moneylover.Model.TietKiem;
import nguyen.huy.moneylover.R;

import static nguyen.huy.moneylover.Tool.Convert.Money;

public class AdapterEconomyEnded extends ArrayAdapter<TietKiem> {
    Activity context;
    int resource;
    List<TietKiem> objects;
    private long balance= MainActivity.balance;

    public AdapterEconomyEnded(Activity context, int resource, List<TietKiem> objects) {
        super(context, resource, objects);
        this.context= context;
        this.resource=resource;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        convertView=inflater.inflate(this.resource,null);

        TextView txtTietKiem= convertView.<TextView>findViewById(R.id.txtMucDichTietKiem);
        TextView txtSoTienConThieu = convertView.<TextView>findViewById(R.id.txtSoTienConThieu);
        TextView tvTrangThaiEnd = convertView.<TextView>findViewById(R.id.tvTrangThaiEnd);


        TietKiem tk=this.objects.get(position);
        txtTietKiem.setText(tk.getMucDichTietKiem());
        Long soThieu = Long.parseLong(tk.getMucTieuTietKiem()) - Long.parseLong(tk.getSoTienHienCo());
        txtSoTienConThieu.setText(Money(soThieu));
        if(balance < soThieu) {
            tvTrangThaiEnd.setText("Chưa hoàn thành");
            tvTrangThaiEnd.setTextColor(Color.RED);
        }
        else{
            tvTrangThaiEnd.setText("Đã hoàn thành");
            tvTrangThaiEnd.setTextColor(Color.BLUE);
        }
        return convertView;
    }


}
