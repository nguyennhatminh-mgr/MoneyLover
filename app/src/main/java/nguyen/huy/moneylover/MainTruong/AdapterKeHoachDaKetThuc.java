package nguyen.huy.moneylover.MainTruong;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import nguyen.huy.moneylover.Model.KeHoach;
import nguyen.huy.moneylover.R;

public class AdapterKeHoachDaKetThuc extends ArrayAdapter<KeHoach> {

    Activity context=null;
    int resource;
    List<KeHoach> objects=null;

    public AdapterKeHoachDaKetThuc(Activity context, int resource, List<KeHoach> objects) {
        super(context, resource, objects);
        this.context= context;
        this.resource=resource;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        convertView=inflater.inflate(this.resource,null);

        TextView txtkeHoach= convertView.<TextView>findViewById(R.id.txtkeHoach);

        KeHoach kh=this.objects.get(position);
        txtkeHoach.setText(kh.getTenkehoach());
        return convertView;
    }
}