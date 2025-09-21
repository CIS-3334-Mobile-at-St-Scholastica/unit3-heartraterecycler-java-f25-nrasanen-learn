package cis3334.java_heartrate_start;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeartrateAdapter extends RecyclerView.Adapter<HeartrateViewHolder> {

    Application application;
    MainViewModel mainViewModel;
    HeartrateAdapter(Application application, MainViewModel mainViewModel)
    {
        this.application = application;
        this.mainViewModel = mainViewModel;
    }

    // code bellow is from ai
    // I don't know what to do in the last part of step 5
    public void setHeartrates(List<Heartrate> heartrates) {
        this. = heartrates;
        notifyDataSetChanged(); // refresh RecyclerView
    }

    @NonNull
    @Override
    public HeartrateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.heartrate_row, parent, false);

        return new HeartrateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeartrateViewHolder holder, int position) {
        Heartrate heartrate = mainViewModel.getAllHeartrates().getValue().get(position);
        holder.heartRateDescription.setText(heartrate.toString());
        holder.heartRateRange.setText(heartrate.toString());
        holder.heartRatePulse.setText(heartrate.toString());
    }

    @Override
    public int getItemCount() {
        int numHeart = 0;
        LiveData<List<Heartrate>> orderLiveData = mainViewModel.getAllHeartrates();
        if(orderLiveData != null && orderLiveData.getValue() != null)
        {
            numHeart = orderLiveData.getValue().size();
        }
        return numHeart;
    }
}
