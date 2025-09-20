package cis3334.java_heartrate_start;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeartrateViewHolder extends RecyclerView.ViewHolder {
    TextView heartRateDescription;
    TextView heartRateRange;
    TextView heartRatePulse;
    public HeartrateViewHolder(@NonNull View itemView) {
        super(itemView);
        heartRateDescription = itemView.findViewById(R.id.description);
        heartRateRange = itemView.findViewById(R.id.range);
        heartRatePulse = itemView.findViewById(R.id.pulse);
    }
}
